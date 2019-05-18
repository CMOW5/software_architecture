package payroll_app.transactions;

import payroll_app.payment.classification.PaymentClassification;
import payroll_app.payment.schedule.PaymentSchedule;

public class AddCoiranissionedEmployee extends AddEmployeeTransaction {

	public AddCoiranissionedEmployee(int empid, String name, String address) {
		super(empid, name, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PaymentClassification GetClassification() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentSchedule GetSchedule() {
		// TODO Auto-generated method stub
		return null;
	}

}
