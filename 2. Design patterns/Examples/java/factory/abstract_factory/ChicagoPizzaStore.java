package factory;

public class ChicagoPizzaStore extends PizzaStore {
	
	@Override
	Pizza createPizza(String type) {
		
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
				new ChicagoPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese pizza");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam pizza");
		} 
		
		return pizza;
		
	}
	
}
