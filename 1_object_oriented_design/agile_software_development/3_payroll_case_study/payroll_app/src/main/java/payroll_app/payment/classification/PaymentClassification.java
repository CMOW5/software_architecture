package payroll_app.payment.classification;

import payroll_app.payment.PayCheck;

public interface PaymentClassification {
	double calculatePay(PayCheck payCheck);
}
