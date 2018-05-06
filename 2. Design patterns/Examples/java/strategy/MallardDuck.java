package design_patterns;

public class MallardDuck extends Duck {

	
	/**
	 * a mallard duck uses the Quack class to handle
	 * its quack, so when permformQuack is called,
	 * the responsibility for the quack is delegated
	 * to the Quack object and we get a real quack
	 */
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings(); //behavior type
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real duck!");
		
	}
	
}
