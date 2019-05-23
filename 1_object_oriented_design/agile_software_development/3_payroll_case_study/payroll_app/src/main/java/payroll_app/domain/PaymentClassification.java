package payroll_app.domain;

import payroll_app.implementation.PayCheck;

public interface PaymentClassification {
	double calculatePay(PayCheck payCheck);
}
