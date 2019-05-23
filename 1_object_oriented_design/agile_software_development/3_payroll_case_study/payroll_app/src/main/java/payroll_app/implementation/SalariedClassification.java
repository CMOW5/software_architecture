package payroll_app.implementation;

import payroll_app.domain.PaymentClassification;

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
