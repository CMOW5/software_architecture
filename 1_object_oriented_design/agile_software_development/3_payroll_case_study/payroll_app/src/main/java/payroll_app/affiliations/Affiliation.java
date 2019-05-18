package payroll_app.affiliations;

import payroll_app.payment.PayCheck;

public interface Affiliation {
	double calculateDeductions(PayCheck payCheck);
}
