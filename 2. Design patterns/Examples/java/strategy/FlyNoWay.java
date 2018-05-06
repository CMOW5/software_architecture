package design_patterns;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I Can't fly");	
	}
}
