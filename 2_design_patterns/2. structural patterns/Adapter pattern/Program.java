package javaTest2;

import javax.jws.WebService;

import org.omg.PortableServer.AdapterActivator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String webHost = "https://.....com";
		WebService service = new WebService(webhost);
		WebAdapter adapter = new WebAdapter();
		adapter.connect(service);
		WebClient client = new WebClient(adapter);
		client.doWork();
	}

}
