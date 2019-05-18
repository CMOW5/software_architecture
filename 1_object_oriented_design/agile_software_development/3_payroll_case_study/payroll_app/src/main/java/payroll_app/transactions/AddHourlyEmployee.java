package payroll_app.transactions;

import payroll_app.payment.classification.HourlyClassification;
import payroll_app.payment.classification.PaymentClassification;
import payroll_app.payment.schedule.PaymentSchedule;

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
