package payroll_app.transactions;

import payroll_app.payment.classification.PaymentClassification;
import payroll_app.payment.classification.SalariedClassification;
import payroll_app.payment.schedule.MonthlySchedule;
import payroll_app.payment.schedule.PaymentSchedule;

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
