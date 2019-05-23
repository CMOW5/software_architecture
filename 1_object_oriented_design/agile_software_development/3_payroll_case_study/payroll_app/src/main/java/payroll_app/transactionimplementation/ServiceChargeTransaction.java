package payroll_app.transactionimplementation;

import payroll_app.db.PayRollDatabase;
import payroll_app.domain.Affiliation;
import payroll_app.domain.Employee;
import payroll_app.implementation.UnionAffiliation;
import payroll_app.transactionapplication.Transaction;

public class ServiceChargeTransaction implements Transaction {
	private int memberld;
	private long date;
	private double amount;
	
	public ServiceChargeTransaction(int memberld, long date, double amount) {
		this.memberld = memberld;
		this.date = date;
		this.amount = amount;
	}

	@Override
	public void execute() {
		Employee e = PayRollDatabase.getInstance().getUnionMember(memberld);
		Affiliation af = e.getAffiliation();
		UnionAffiliation uaf = (UnionAffiliation) (af);
		if (uaf != null) {
			uaf.addServiceCharge(date, amount);
		}
	}

}
