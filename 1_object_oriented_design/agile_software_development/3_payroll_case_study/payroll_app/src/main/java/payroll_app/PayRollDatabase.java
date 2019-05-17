package payroll_app;

import java.util.HashMap;
import java.util.Map;

public class PayRollDatabase {
	
	Map<Integer, Employee> itsEmployees = new HashMap<>();
	
	public Employee GetEmployee(int empid) {
		return itsEmployees.get(empid);
	};
	
	public void AddEmployee(int empid, Employee e) {
		itsEmployees.put(empid, e);
	}
	public void clear() {
		itsEmployees.clear();
	}
}
