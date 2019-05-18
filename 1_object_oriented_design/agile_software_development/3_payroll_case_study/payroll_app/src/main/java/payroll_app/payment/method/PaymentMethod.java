package payroll_app.payment.method;

import payroll_app.payment.PayCheck;

public interface PaymentMethod {
	void pay(PayCheck payCheck);
}
