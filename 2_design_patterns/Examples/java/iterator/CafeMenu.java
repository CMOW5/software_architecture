package iterator;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
	Hashtable menuItems = new Hashtable<>();
	
	public CafeMenu() {
		addItem("CafeMenu item 1 name", "CafeMenu item 1 description", true, 2);
		addItem("CafeMenu item 2 name", "CafeMenu item 2 description", false, 3);
		addItem("CafeMenu item 3 name", "CafeMenu item 3 description", false, 4);
		addItem("CafeMenu item 4 name", "CafeMenu item 4 description", false, 5);
	}
	
	public void addItem(String name, 
						String description, 
						boolean vegetarian, 
						double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
	
	public Iterator createIterator() {
		return menuItems.values().iterator();
	}
	
	

}
