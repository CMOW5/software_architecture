package payroll_app.implementation;

public class ServiceCharge {

	private long date;
	private double amount;
	
	public ServiceCharge(long date, double amount) {
		this.date = date;
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

}
