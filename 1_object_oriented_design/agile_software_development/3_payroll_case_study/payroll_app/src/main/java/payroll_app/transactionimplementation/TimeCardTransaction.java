package payroll_app.transactionimplementation;

import java.util.NoSuchElementException;

import payroll_app.db.PayRollDatabase;
import payroll_app.domain.Employee;
import payroll_app.domain.PaymentClassification;
import payroll_app.implementation.HourlyClassification;
import payroll_app.implementation.TimeCard;
import payroll_app.transactionapplication.Transaction;

public class TimeCardTransaction implements Transaction {

	private int empId;
	private long date;
	private double hours;
	
	public TimeCardTransaction(long date, double hours, int empId) {
		this.empId = empId;
		this.date = date;
		this.hours = hours;
	}
	
	@Override
	public void execute() {
		Employee e = PayRollDatabase.getInstance().getEmployee(empId);
		if (e != null) {
			PaymentClassification pc = e.getClassification();
			HourlyClassification hc = (HourlyClassification) (pc);
			if (hc != null) {
				hc.addTimeCard(new TimeCard(date, hours));
			} else {
				throw new UnsupportedOperationException("Tried to add timecard to non-hourly employee");
			}
		} else {
			throw new NoSuchElementException("No such employee.");
		}
	}
}
