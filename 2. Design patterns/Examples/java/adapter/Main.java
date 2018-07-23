package adapter;

public class Main {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey); // makes look a turkey like a duck
		
		turkey.gobble();
		turkey.fly();
		
		duck.quack();
		duck.fly();
		
		turkeyAdapter.quack();
		turkeyAdapter.fly();

	}

}
