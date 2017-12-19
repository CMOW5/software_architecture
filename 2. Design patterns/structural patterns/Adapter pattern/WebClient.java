package javaTest2;

public class WebClient {
	
	private WebRequester webRequester;
	
	public WebClient(WebRequester webRequester){
		this.webRequester = webRequester;
	}
	
	private Object makeObject() { ... } //make an object
	
	public void doWork(){
		Object object = makeObject();
		int status = webRequester.request(object);
		
		if (status == 200){
			// ok
		} else {
			// not ok
		}
		return;
	}

}
