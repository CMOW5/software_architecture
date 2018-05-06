package design_patterns;

public class Main {
	
	public static void main(String args[]) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		// dynamically changing the flying behavior
		model.setFlyBehavior(new FlyRocketBehavior());
		model.performFly();
	}

}
