package payroll_app.transactions;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import payroll_app.db.PayRollDatabase;
import payroll_app.models.Employee;
import payroll_app.payment.PayCheck;

public class PayDayTransaction implements Transaction {
	
	private LocalDateTime payDate;
	private Map<Integer, PayCheck> itsPaychecks = new HashMap<>();
	
	public PayDayTransaction(LocalDateTime payDate) {
		this.payDate = payDate;
	}

	@Override
	public void execute() {
		List<Integer> emplds = PayRollDatabase.getInstance().getAllEmployeelds();
		emplds.forEach((emplId) -> {
			Employee e = PayRollDatabase.getInstance().getEmployee(emplId);
			if (e != null) {
				if (e.isPayDate(payDate)) {
					PayCheck payCheck = new PayCheck(payDate);
					itsPaychecks.put(emplId, payCheck);
					System.out.println("emplyee = " + e.getName());
					e.payDay(payCheck);
				}
			}
		});
	}

	public PayCheck getPaycheck(int empld) {
		return itsPaychecks.get(empld);
	}

}
