package observer;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	/**
	 * we don't have to keep track of our observers anymore,
	 * or manage their registration and removal (the superclass
	 * will handle that)
	 */
	public WeatherData() {
		
	}
	
	/**
	 * the setChanged() method is meant to give you more
	 * flexibility in how you update observers by allowing you
	 * to optimize the notifications. (sometimes you don't want
	 * to send notifications constantly -the data has slightly changed- )
	 */
	public void measurementsChanged() {
		setChanged(); /* this call is necessary to signify that	
				         the state has changed and that notifyObservers		
					     when called, should update its observers
					     if notifyObservers() is called without first	
					     calling setChanged(), the observers will NOT be
					     notified.
					   */
		// pull model -> the observers retrieve the data they need
		// from the weatherData object
		notifyObservers(); // this method clears the changed Flag
		// notifyObservers(arg); -> if you want to use the PUSH model, send
		// the data to the observers in the arg object
	}
	
	/* we are using the PULL model, so
	 * the observers will use these methods
	 * to pull the data they need 
	 */
	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	
	
}
