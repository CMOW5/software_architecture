package composite;

import java.util.Iterator;

public class NullIterator implements Iterator {
	@Override
	public Object next() {
		return null;
	}
	
	@Override
	public boolean hasNext() {
		return false;
	}
}
