package payroll_app.transactionimplementation;

import payroll_app.abstracttransactions.AddEmployeeTransaction;
import payroll_app.domain.PaymentClassification;
import payroll_app.domain.PaymentSchedule;
import payroll_app.implementation.MonthlySchedule;
import payroll_app.implementation.SalariedClassification;

public class AddSalariedEmployee extends AddEmployeeTransaction {

	private double itsSalary;
	
	public AddSalariedEmployee(int empid, String name, String address, double salary) {
		super(empid, name, address);
		itsSalary = salary;
	}

	@Override
	public PaymentClassification GetClassification() {
		return new SalariedClassification(itsSalary);
	}

	@Override
	public PaymentSchedule GetSchedule() {
		return new MonthlySchedule();
	}

}
