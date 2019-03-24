package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
	MenuComponent allmenus;
	
	public Waitress(MenuComponent allmenus) {
		this.allmenus = allmenus;
	}
	
	public void printMenu() {
		allmenus.print();
	}
	
	public void printVegetarianMenu() {
		Iterator iterator = allmenus.createIterator();
		System.out.println("\nVegetarian Menu\n------");
		while(iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {}
		}
	}
}
