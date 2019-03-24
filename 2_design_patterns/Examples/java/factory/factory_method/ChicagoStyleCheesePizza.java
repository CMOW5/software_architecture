package factory;

public class ChicagoStyleCheesePizza extends Pizza  {
	
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style sauce and cheese pizza";
		dough = "extra thick crust dough";
		sauce = "Tomato sauce";
		toppings.add("Shredded mozzarella cheese");
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	
	
}
