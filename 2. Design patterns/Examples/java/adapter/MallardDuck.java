package adapter;

public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Quak");
	}

	@Override
	public void fly() {
		System.out.println("Im flying");
	}
	

}
