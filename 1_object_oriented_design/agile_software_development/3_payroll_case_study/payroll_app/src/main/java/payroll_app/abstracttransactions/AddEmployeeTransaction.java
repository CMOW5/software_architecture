package payroll_app.abstracttransactions;

import payroll_app.db.PayRollDatabase;
import payroll_app.domain.Employee;
import payroll_app.domain.PaymentClassification;
import payroll_app.domain.PaymentMethod;
import payroll_app.domain.PaymentSchedule;
import payroll_app.implementation.HoldMethod;
import payroll_app.transactionapplication.Transaction;

public abstract class AddEmployeeTransaction implements Transaction {
	
	private int itsEmpid;
	private	String itsName;
	private String itsAddress;
	
	public AddEmployeeTransaction(int empid, String name, String address) {
		this.itsEmpid = empid;
		this.itsName = name;
		this.itsAddress = address;
	}
	
	public abstract PaymentClassification GetClassification();
	public abstract PaymentSchedule GetSchedule();
		
	@Override
	public void execute() {
		PaymentClassification pc = GetClassification();
		PaymentSchedule ps = GetSchedule();
		PaymentMethod pm = new HoldMethod();
		Employee e = new Employee(itsEmpid, itsName, itsAddress);
		e.setClassification(pc);
		e.setSchedule(ps);
		e.setMethod(pm);
		PayRollDatabase.getInstance().addEmployee(itsEmpid, e);
	}
}
