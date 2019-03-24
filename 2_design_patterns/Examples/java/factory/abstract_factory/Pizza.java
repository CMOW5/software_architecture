package factory;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	// this is where we are going to collect the ingredients needed for the 
	// pizza, which of course will come from the ingredient factory
	abstract void prepare(); 
	
	public void bake() {
		System.out.println("Bake for 25 min at 350");
	};
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	};
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	};
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
