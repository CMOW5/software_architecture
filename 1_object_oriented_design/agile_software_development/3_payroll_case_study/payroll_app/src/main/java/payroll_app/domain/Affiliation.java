package payroll_app.domain;

import payroll_app.implementation.PayCheck;

public interface Affiliation {
	double calculateDeductions(PayCheck payCheck);
}
