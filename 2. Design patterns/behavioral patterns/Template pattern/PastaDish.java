package javaTest2;

public abstract class PastaDish {
	
	//template method
	final void makeRecipe() {
		boildWater();
		addPasta();
		cookPasta();
		drainAndPlate();
		addSauce();
		addProtein();
		addGarnish();
	}
	
	abstract void addPasta();
	abstract void addSauce();
	abstract void addProtein();
	abstract void addGarnish();
	
	private void boildWater() {
		System.out.println("Boiling water");
	}
	
	private void cookPasta() {
		System.out.println("Cooking Pasta");
	}
	
	private void drainAndPlate() {
		System.out.println("drain and plate");
	}
	
}
