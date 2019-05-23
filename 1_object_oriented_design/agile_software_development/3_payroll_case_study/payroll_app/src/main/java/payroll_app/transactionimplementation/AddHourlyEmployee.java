package payroll_app.transactionimplementation;

import payroll_app.abstracttransactions.AddEmployeeTransaction;
import payroll_app.domain.PaymentClassification;
import payroll_app.domain.PaymentSchedule;
import payroll_app.implementation.HourlyClassification;

public class AddHourlyEmployee extends AddEmployeeTransaction {
	
	private double hourlyRate;
	
	public AddHourlyEmployee(int empid, String name, String address, double hourlyRate) {
		super(empid, name, address);
		this.hourlyRate = hourlyRate;
	}

	@Override
	public PaymentClassification GetClassification() {
		return new HourlyClassification(hourlyRate);
	}

	@Override
	public PaymentSchedule GetSchedule() {
		// TODO Auto-generated method stub
		return null;
	}

}
