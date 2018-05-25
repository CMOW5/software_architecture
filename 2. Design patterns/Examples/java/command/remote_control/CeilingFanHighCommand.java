package command;

public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
		System.out.println("ceiling fan is high");
	}

	@Override
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
			System.out.println("speed set to high");
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
			System.out.println("speed set to medium");
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
			System.out.println("speed set to low");
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
			System.out.println("speed set to off");
		}
	}
	
	

}
