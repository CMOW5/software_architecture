package payroll_app.domain;

import payroll_app.implementation.PayCheck;

public interface PaymentMethod {
	void pay(PayCheck payCheck);
}
