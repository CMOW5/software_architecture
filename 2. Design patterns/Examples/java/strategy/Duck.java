package design_patterns;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	/**
	 * behavior setter to change the fly behavior
	 * of a duck 
	 * @param fb
	 */
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	/**
	 * behavior setter to change the quack behavior
	 * of a duck 
	 * @param qb
	 */
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	public void swim () {
		System.out.println("All ducks float, even decoys!");
	}

}
