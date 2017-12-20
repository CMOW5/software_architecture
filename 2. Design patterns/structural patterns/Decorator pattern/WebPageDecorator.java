package javaTest2;

public abstract class WebPageDecorator implements WebPage {
	protected WebPage page; /* only one instance */

	public WebPageDecorator(WebPage page) {
		this.page = page;
	}
	
	public void display(){
		this.page.display();
	}
	
	
}
