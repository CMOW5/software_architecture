package payroll_app.transactions;

import payroll_app.affiliations.Affiliation;
import payroll_app.affiliations.UnionAffiliation;
import payroll_app.db.PayRollDatabase;
import payroll_app.models.Employee;

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
