package composite;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		MenuComponent pancakeHouseMenu 
			= new Menu("Pancake house menu", "Breakfast");
		
		MenuComponent dinnerMenu 
			= new Menu("Dinner menu", "Lunch");	
		
		MenuComponent cafeMenu 
			= new Menu("Cafe menu", "Dinner");
		
		MenuComponent dessertMenu 
			= new Menu("Dessert menu", "dessert of course!!");
	
		MenuComponent allmenus 
			= new Menu("All menus", "all menus combined");
		
		pancakeHouseMenu.add(new MenuItem(
				"pancakeHouseMenu item 1 name", 
				"pancakeHouseMenu item 1 description", 
				false, 2)
				);
		
		pancakeHouseMenu.add(new MenuItem(
				"pancakeHouseMenu item 2 name", 
				"pancakeHouseMenu item 2 description", 
				false, 2)
				);
		
		dinnerMenu.add(new MenuItem(
				"dinnerMenu item 1 name", 
				"dinnerMenu item 1 description", 
				true, 2)
				);
		
		dinnerMenu.add(new MenuItem(
				"dinnerMenu item 2 name", 
				"dinnerMenu item 2 description", 
				false, 2)
				);
		
		cafeMenu.add(new MenuItem(
				"cafeMenu item 1 name", 
				"cafeMenu item 1 description", 
				false, 2)
				);
		
		cafeMenu.add(new MenuItem(
				"cafeMenu item 2 name", 
				"cafeMenu item 2 description", 
				false, 2)
				);
		
		dessertMenu.add(new MenuItem(
				"dessertMenu item 1 name", 
				"dessertMenu item 1 description", 
				false, 2)
				);
		
		dessertMenu.add(new MenuItem(
				"dessertMenu item 2 name", 
				"dessertMenu item 2 description", 
				false, 2)
				);
		
		dinnerMenu.add(dessertMenu); // adding a menu to a menu (Composite)
		allmenus.add(pancakeHouseMenu);
		allmenus.add(dinnerMenu);
		allmenus.add(cafeMenu);
		
		Waitress waitress = new Waitress(allmenus);
		waitress.printMenu();
		waitress.printVegetarianMenu();

	}

}
