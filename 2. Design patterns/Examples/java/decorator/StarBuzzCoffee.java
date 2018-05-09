package decorator;

public class StarBuzzCoffee {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2); // wrap it with a mocha
		beverage2 = new Mocha(beverage2); // wrap it with a second mocha
		beverage2 = new Whip(beverage2); // wrap it with a whip
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	}
}
