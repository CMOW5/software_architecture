package state;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("you cant insert, the machine is Sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("you cant eject, you havent inserted a quarter yet");
	}

	@Override
	public void turnCrank() {
		System.out.println("you turned the crank, but there are not gumballs");
	}

	@Override
	public void dispense() {
		System.out.println("no gumball dispensed");
	}
	
}
