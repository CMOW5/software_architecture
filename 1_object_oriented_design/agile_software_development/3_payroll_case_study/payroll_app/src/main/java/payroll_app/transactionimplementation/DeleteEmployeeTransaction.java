package payroll_app.transactionimplementation;

import payroll_app.db.PayRollDatabase;
import payroll_app.transactionapplication.Transaction;

public class DeleteEmployeeTransaction implements Transaction {
	
	private int itsEmpId;
	
	public DeleteEmployeeTransaction(int empld) {
		itsEmpId = empld;
	}

	@Override
	public void execute() {
		PayRollDatabase.getInstance().deleteEmployee(itsEmpId);
	}

}
