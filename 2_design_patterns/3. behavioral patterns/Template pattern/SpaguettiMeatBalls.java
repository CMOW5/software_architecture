package javaTest2;

public class SpaguettiMeatBalls extends PastaDish {
	
	@Override
	void addPasta() {
		System.out.println("Add spaguetti");
		
	}

	@Override
	void addSauce() {
		System.out.println("Add tomatto sauce");
	}

	@Override
	void addProtein() {
		System.out.println("Add meatballs");		
	}

	@Override
	void addGarnish() {
		System.out.println("Add parmesan cheese");
	}

}
