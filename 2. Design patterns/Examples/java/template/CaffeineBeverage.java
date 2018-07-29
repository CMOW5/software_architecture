package template;

public abstract class CaffeineBeverage {
	/* template method */
	void prepareRecipe() {
		boildWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	public abstract void brew(); // implemented by subclasses
	
	public abstract void addCondiments(); // implemented by subclasses
	
	void boildWater() {
		System.out.println("Boling water..");
	}
	
	void pourInCup() {
		System.out.println("Pouring in Cup..");
	}
	
	// this is a hook because the subclass can
	// override this method, but doesn't have to
	boolean customerWantsCondiments() {
		return true;
	}
}
