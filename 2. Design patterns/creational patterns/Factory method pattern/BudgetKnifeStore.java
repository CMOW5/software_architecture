package javaTest2;

public class BudgetKnifeStore extends KnifeStore {

	@Override
	Knife createKnife(String type) {
		// TODO Auto-generated method stub
		if (type.equals("steak")) {
			return new BudgetSteakKnife();
		} else if (type.equals("chefs")) {
			return new BudgetChefsKnife();
		} 
		//..more types
		else
			return null;
	}
	
}
