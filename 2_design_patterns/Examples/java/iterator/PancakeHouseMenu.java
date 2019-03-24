package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
	ArrayList menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		
		addItem("PancakeHouseMenu item 1 name", "PancakeHouseMenu item 1 description", true, 2);
		addItem("PancakeHouseMenu item 2 name", "PancakeHouseMenu item 2 description", false, 3);
		addItem("PancakeHouseMenu item 3 name", "PancakeHouseMenu item 3 description", false, 4);
		addItem("PancakeHouseMenu item 4 name", "PancakeHouseMenu item 4 description", false, 5);
	}
	
	public void addItem(String name, 
						String description, 
						boolean vegetarian, 
						double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public Iterator createIterator() {
		return menuItems.iterator();
	}

}
