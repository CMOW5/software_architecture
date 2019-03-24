package javaTest2;

public class AuthorizedWebPage extends WebPageDecorator {

	public AuthorizedWebPage(WebPage decoratedPage) {
		super(decoratedPage);
		// TODO Auto-generated constructor stub
	}
	
	public void autorizeUser() {
		//autorize user
	}
	
	public void dispay() {
		super.display(); /* stack behavior (recursive call) */
		this.autorizeUser();
	}

}
