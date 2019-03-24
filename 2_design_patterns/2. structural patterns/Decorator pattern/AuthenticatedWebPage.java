package javaTest2;


public class AuthenticatedWebPage extends WebPageDecorator {

	public AuthenticatedWebPage(WebPage decoratedPage) {
		super(decoratedPage);
		// TODO Auto-generated constructor stub
	}
	
	public void authenticateUser() {
		//authenticate user
	}
	
	public void dispay() {
		super.display(); /* stack behavior (recursive call) */
		this.authenticateUser();
	}

}
