package iterator;

import java.util.Iterator;

/**
 * this class is needed because arrays doesn't have iterators like 
 * ArrayList or HashMaps
 * 
 * @author cristian
 *
 */
public class DinnerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;
		
	public DinnerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem item = items[position];
		position++;
		return item;
	}

}
