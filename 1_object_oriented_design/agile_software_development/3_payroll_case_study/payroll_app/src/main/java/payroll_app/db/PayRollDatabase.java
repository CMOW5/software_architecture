package payroll_app.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import payroll_app.domain.Employee;

public class PayRollDatabase {
	
	Map<Integer, Employee> itsEmployees = new HashMap<>();
	Map<Integer, Employee> itsUnionMembers = new HashMap<>();
	public static PayRollDatabase instance;
	
	public static PayRollDatabase getInstance() {
		if (instance == null) {
			instance = new PayRollDatabase();
		}
		return instance;
	}
	
	private PayRollDatabase() {}
	
	public Employee getEmployee(int empid) {
		return itsEmployees.get(empid);
	};
	
	public void addEmployee(int empid, Employee e) {
		itsEmployees.put(empid, e);
	}
	public void clear() {
		itsEmployees.clear();
	}

	public void deleteEmployee(int itsEmpId) {
		itsEmployees.remove(itsEmpId);
	}

	public void addUnionMember(int memberld, Employee e) {
		itsUnionMembers.put(memberld, e);
	}

	public Employee getUnionMember(int memberld) {
		return itsUnionMembers.get(memberld);
	}

	public List<Integer> getAllEmployeelds() {
		List<Integer> ids = new ArrayList<>();
		itsEmployees.forEach((id, e) -> {
			ids.add(id);
		});
		return ids;
	}
}
