package payroll_app.payment.classification;

import payroll_app.payment.PayCheck;

public class SalariedClassification implements PaymentClassification {

	private double itsSalary;

	public SalariedClassification(double salary) {
		itsSalary = salary;
	}

	public double getSalary() {
		return itsSalary;
	}

	@Override
	public double calculatePay(PayCheck payCheck) {
		// TODO Auto-generated method stub
		return 0;
	}
}
