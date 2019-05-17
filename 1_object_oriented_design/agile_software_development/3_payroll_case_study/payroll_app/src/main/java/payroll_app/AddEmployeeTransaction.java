package payroll_app;

public abstract class AddEmployeeTransaction implements Transaction {
	
	private int itsEmpid;
	private	String itsName;
	private String itsAddress;
	
	public AddEmployeeTransaction(int empid, String name, String address) {
		
	}
	
	public abstract PaymentClassification GetClassification();
	public abstract PaymentSchedule GetSchedule();
		
	@Override
	public void execute() {
		
	}
}
