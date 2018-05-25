package command;

public class CeilingFan {
	public static int HIGH = 3;
	public static int MEDIUM = 2;
	public static int LOW = 1;
	public static int OFF = 3;
	String location;
	int speed;
	
	public CeilingFan(String location) {
		this.location = location;
		this.speed = OFF;
	}
	
	public void high() {
		speed = HIGH;
	}
	
	public void medium() {
		speed = MEDIUM;
	}
	
	public void low() {
		speed = LOW;
	}
	
	public void off() {
		speed = OFF;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	

}
