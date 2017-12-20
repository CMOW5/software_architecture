package javaTest2;

public class Program {

	public static void main(String[] args) {
		WebPage myPage = new BasicWebPage();
		myPage = new AuthorizedWebPage(myPage); //add behavior
		myPage = new AuthenticatedWebPage(myPage); //add behavior
		myPage.display();
	}
}
