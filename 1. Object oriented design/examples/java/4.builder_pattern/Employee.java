package demo;

import java.io.*;

public class Employee {
	private String name;
	public Employee(String name) {this.name = name;}
	
	interface Importer { String fetchName();}
	interface Exporter { void storeName(String name);}
	
	public Employee(Importer source) {
		name = source.fetchName();
	}
	
	public void export (Exporter destination) {
		destination.storeName(name);
	}
}

class JsonImporter implements Employee.Importer {
	private Reader in; // this could be anything e.g a SQL connection, etc
	
	public JsonImporter(Reader in) {
		this.in = in;
	}
	
	@Override
	public String fetchName() {
		// ... go to the source and read the name
		return "Allen";
	}	
}

class XMLImporter implements Employee.Importer {
	private Reader in; // this could be anything e.g a SQL connection, etc
	
	public XMLImporter(Reader in) {
		this.in = in;
	}
	
	@Override
	public String fetchName() {
		// ... go to the source and read the name
		return "Allen";
	}	
}

class JsonExporter implements Employee.Exporter {
	private String name; 
	
	@Override
	public void storeName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "{ \"name\":"+ name + "}";
	}		
}

class XMLExporter implements Employee.Exporter {
	private String name; 
	
	@Override
	public void storeName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "<name value=\"" + name + "\">";
	}		
}

class Demo {
	public void test() throws Exception {
		String json = "{\"name\":\"Allen\"}";
		Reader in = new StringReader(json);
		Employee me = new Employee(new JsonImporter(in));
		
		Employee.Exporter exporter = new JsonExporter();
		me.export(exporter);
		String jsonVersion = exporter.toString(); 
	}
}

