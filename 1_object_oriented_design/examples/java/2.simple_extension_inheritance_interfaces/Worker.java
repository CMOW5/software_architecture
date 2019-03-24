package demo;

import java.util.Currency;

interface Timesheet{}
interface Invoice{}
class Money {public Money (double val, Currency c) {}}

interface Payable {
	void pay();
}

public abstract class Worker implements Payable {
	private String name;
	public Worker(String name) {
		this.name = name;
	}
	public void pay() {
		Money due = getAmountDue();
	};
	abstract protected Money getAmountDue(); /* template method */
}

class Employee extends Worker {
	private Timesheet[] unpaidTimesheets;
	public Employee(String name) {super(name);}
	public void attachTimesheet(Timesheet i) {}
	protected Money getAmountDue() {
		return new Money(2.3, Currency.getInstance("USD"));
	}
}

class Contractor extends Worker {
	public Contractor(String name) {super(name);}
	private Invoice[] invoiceDue;
	public void attachInvoice(Invoice i) {}
	@Override
	protected Money getAmountDue() {
		return new Money(2.3, Currency.getInstance("USD"));
	};
}

class AccountsPayable {
	Payable [] creditors;
	
	public void PayEveryBody() {
		for (Payable creditor: creditors) {
			creditor.pay();
		}
	}
}
