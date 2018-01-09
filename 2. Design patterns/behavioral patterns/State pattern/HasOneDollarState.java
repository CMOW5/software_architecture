package javaTest2;

public class HasOneDollarState implements State {
	
	@Override
	public void insertDollar(VendingMachine vendingMachine) {
		System.out.println("already have one dollar");
	}

	@Override
	public void ejectMoney(VendingMachine vendingMachine) {
		System.out.println("returning money");
		vendingMachine.doReturnMoney();
		vendingMachine.setState(vendingMachine.getIdleState());
	}

	@Override
	public void dispense(VendingMachine vendingMachine) {
		System.out.println("releasing product");
		
		if (vendingMachine.getCount() > 1 ) {
			vendingMachine.doReleaseProduct();
			vendingMachine.setState(vendingMachine.getIdleState());
		} else {
			vendingMachine.doReleaseProduct();
			vendingMachine.setState(vendingMachine.getOutOfStockState());
		}
	}
	

}
