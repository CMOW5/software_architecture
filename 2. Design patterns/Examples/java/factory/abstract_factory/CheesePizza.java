package factory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	void prepare() {
		System.out.println("preparing " + name);
		// ask the factory to produce an ingredient
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
 
}
