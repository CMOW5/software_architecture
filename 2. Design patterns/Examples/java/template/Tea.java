package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage {
	@Override
	public void brew() {
		System.out.println("Steeping the tea");
		
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding lemon");
	}
}
