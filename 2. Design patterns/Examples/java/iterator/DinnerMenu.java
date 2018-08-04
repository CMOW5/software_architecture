package iterator;

import java.util.Iterator;

public class DinnerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("dinner item 1 name", "dinner item 1 description", true, 2);
		addItem("dinner item 2 name", "dinner item 2 description", false, 3);
		addItem("dinner item 3 name", "dinner item 3 description", false, 4);
		addItem("dinner item 4 name", "dinner item 4 description", false, 5);
	}
	
	public void addItem(String name, 
						String description, 
						boolean vegetarian, 
						double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry the menu is full");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}
	public Iterator createIterator() {
		return new DinnerMenuIterator(menuItems);
	}
}
