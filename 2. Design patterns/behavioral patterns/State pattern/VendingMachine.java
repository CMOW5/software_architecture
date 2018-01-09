package javaTest2;

public class VendingMachine {
	
	private State currentState;
	private int count;
	
	public void insertDollar() {
		//Delegates handling to the current state object
		currentState.insertDollar(this); 
	}
	
	public void ejectMoney() {
		currentState.ejectMoney(this); 
	}
	
	public void dispense() {
		currentState.dispense(this); 
	}
	
	//WRONG 
	/*
	public VendingMachine(int count) {
		if (count > 0 ) {
			currentState = State.Idle;
			this.count = count;
		} else {
			currentState = State.OutOfStock;
			this.count = 0;
		}
	}
	
	//handle user events
	public void insertDollar() {
		if (currentState == State.Idle) {
			currentState = State.HasOneDollar;
		} else if (currentState == State.HasOneDollar) {
			doReturnMoney();
			currentState = State.Idle;
		} else if (currentState == State.OutOfStock) {
			doReturnMoney();
		} 
	}
	
	public void ejectMoney() {
		
	}

	public void dispense() {
		
	}
	*/
	
}
