package javaTest2;

public class OrderFulfillment implements IOrder {
	
	private Lsit<Warehouse> warehouses;
	
	public void fulfillOrder(Order order) {
		/* For each item in a customer order, check each warehouse
		 * to see if it is in stock
		 * 
		 * If it is then create a new Order for that warehouse. Else
		 * check the next warehouse
		 * 
		 * Send the all the orders to the warehouse(s) after you finish
		 * iterating over all the items in the original order 
		 */
		
		for (Item item : order.itemList) {
			for (Warehouse warehouse : warehouses) {
				//....
			}
		}
		
		return;
	}

}
