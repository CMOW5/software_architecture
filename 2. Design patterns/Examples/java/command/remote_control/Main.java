package command;

public class Main {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		CeilingFan ceilingFan = new CeilingFan("room 1");
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		CeilingFanHighCommand fanHigh = new CeilingFanHighCommand(ceilingFan);
		
		remote.setCommand(0, lightOn, lightOff);
		remote.setCommand(1, lightOn, fanHigh);
		
		System.out.println(remote);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.undoButtonWasPushed();
		
		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);
		remote.undoButtonWasPushed();
		
		remote.onButtonWasPushed(2);
		remote.offButtonWasPushed(2);
		
		// macro commands
		Command[] partyOn = {lightOn, fanHigh};
		Command[] partyOff = {lightOff, fanHigh};
		
		MacroCommand partyOnmacro = new MacroCommand(partyOn);
		MacroCommand partyOffmacro = new MacroCommand(partyOff);
		remote.setCommand(3, partyOnmacro, partyOffmacro);
		remote.onButtonWasPushed(3);
		remote.offButtonWasPushed(3);
	}

}
