package javaTest2;
/*
public final class State {
	
	private State(){}
	
	//all potential vending machine states as singletons
	public final static State Idle = new State();
	public final static State HasOneDollar = new State();
	public final static State OutOfStock = new State();
}
*/

public interface State {
	public void insertDollar(VendingMachine vendingMachine);
	public void ejectMoney(VendingMachine vendingMachine);
	public void dispense(VendingMachine vendingMachine);
}
