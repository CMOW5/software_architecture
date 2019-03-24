package command;

/* invoker */
public class SimpleRemoteControl {
	Command slot;
	
	//Command[] onCommands;
	// Command[] offCommands;
	
	public SimpleRemoteControl() {}
	
	public void setCommand(Command command) {
		this.slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
