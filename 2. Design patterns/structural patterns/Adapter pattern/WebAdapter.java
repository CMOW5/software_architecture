package javaTest2;

import javax.jws.WebService;

public class WebAdapter implements WebRequester {
	
	private WebService service;
	
	public void connect(WebService currentService){
		this.service = currentService;
	}

	@Override
	public int request(Object request) {
		// TODO Auto-generated method stub
		JSON result = this.toJson(request);
		Json response = service.request(result);
		if (response != null) {
			return 200; //ok
		}
		return 500; //error
	}
	
	private JSON toJson(Object input) { .. } 

}
