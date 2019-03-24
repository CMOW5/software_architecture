package proxy;

import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		PersonBean joe = new PersonBeanImpl("Joe", "Male", "Joe interests");
		PersonBean ownerProxy = getOwnerProxy(joe);
		
		System.out.println("Name = " + ownerProxy.getName());
		ownerProxy.setInterests("Bowling, go");
		System.out.println("Interest set from owner proxy= " + 
				ownerProxy.getInterests());
		try {
			ownerProxy.setHotOrNotRating(7);
		} catch (Exception e) {
			System.out.println("Cant set rating from owner proxy");
		}
		
		System.out.println("Rating is = " + 
				ownerProxy.getHotOrNotRating());
		
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		
		System.out.println("Name = " + nonOwnerProxy.getName());
		
		System.out.println("Interest set from owner proxy= " + 
				ownerProxy.getInterests());
		try {
			nonOwnerProxy.setInterests("Bowling, go");
		} catch (Exception e) {
			System.out.println("Cant set interests from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(7);
		System.out.println("Rating is = " + 
				ownerProxy.getHotOrNotRating());
		
	}
	
	public static PersonBean getOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new OwnerInvokationHandler(person));
	}
	
	public static PersonBean getNonOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new NonOwnerInvocationHandler(person));
	}

}
