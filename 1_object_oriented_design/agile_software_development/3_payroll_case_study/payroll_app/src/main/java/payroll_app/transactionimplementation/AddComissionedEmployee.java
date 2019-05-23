package payroll_app.transactionimplementation;

import payroll_app.abstracttransactions.AddEmployeeTransaction;
import payroll_app.domain.PaymentClassification;
import payroll_app.domain.PaymentSchedule;

public class AddComissionedEmployee extends AddEmployeeTransaction {

	public AddComissionedEmployee(int empid, String name, String address) {
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
