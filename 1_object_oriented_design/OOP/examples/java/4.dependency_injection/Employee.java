package demo;

import java.net.*;
import java.util.*;

interface JsonDB {
	public void open (URL location);
	public void close ();
	public HashMap<String, String> lookup (String key);
	
	public class Default implements JsonDB {
		public void open(URL location) {}
		public void close () {}
		public HashMap<String, String> lookup (String key) {
			return null; 
		}
	}
}

class DatabaseMock implements JsonDB {
	@Override
	public void open(URL location) {}

	@Override
	public void close() {}

	@Override
	public HashMap<String, String> lookup(String key) { 
		HashMap<String, String> employee = new HashMap<>();
		employee.put("name", "Allen");
		return employee;
	}
	
}

class DatabaseSpy implements JsonDB {
	JsonDB wrapped;
	
	public DatabaseSpy(JsonDB wrapped) {
		this.wrapped = wrapped;
	}
	
	@Override
	public void open(URL location) {
		wrapped.open(location);
		// do something like logs....
	}

	@Override
	public void close() {
		wrapped.close();
		// do something like logs....
	}

	@Override
	public HashMap<String, String> lookup(String key) {
		// do something like logs....
		return wrapped.lookup(key);
	}
	
}

/** class to manufacture a database **/
class JsonDBFactory {
	public static JsonDB create() throws Exception {
		String dblocation = "http://somelocation.com";
		JsonDB database = new JsonDB.Default();
		database.open(new URL(dblocation));
		return database;
	}
	
	public static void destroy(JsonDB db) {
		db.close();
	}
}

public class Employee {
	String name;
	
	public Employee (String id) throws Exception {
		/** JsonDBFactory facture can make any kind of database that it 
		 *  wants (spy, mock, etc) 
		 *  and the employee wont know that that happened.
		 *  so when we are testing with can create a test db
		 *  in the inside the JsonDBFactory
		 */
		JsonDB database = JsonDBFactory.create();
		HashMap<String, String> result = database.lookup(id);
		name = result.get("name");
		JsonDBFactory.destroy(database);
	}
}
