package payroll_app.transactions;

import payroll_app.db.PayRollDatabase;

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
