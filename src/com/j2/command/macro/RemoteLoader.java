package com.j2.command.macro;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light("Dining Room");
		DVD dvd = new DVD("Dining Room");
		GarageDoor garagedoor1 = new GarageDoor(1);
		TV tv=new TV("Dining Room");
		
		LightOnCommand lightOn = new LightOnCommand(light);
		DVDOnCommand dvdOn = new DVDOnCommand(dvd);
		TVOnCommand tvOn = new TVOnCommand(tv);
		GarageDoorOpenCommand garageDoor1Open = new GarageDoorOpenCommand(garagedoor1);
		LightOffCommand lightOff = new LightOffCommand(light);
		DVDOffCommand dvdOff = new DVDOffCommand(dvd);
		TVOffCommand tvOff = new TVOffCommand(tv);
		GarageDoorCloseCommand garageDoor1Close = new GarageDoorCloseCommand(garagedoor1);

		Command[] switchAllOn = { lightOn, dvdOn,tvOn, garageDoor1Open};
		Command[] switchAllOff = { lightOff, dvdOff,tvOff, garageDoor1Close};
  
		MacroCommand switchAllOncro = new MacroCommand(switchAllOn);
		MacroCommand switchAllOffMacro = new MacroCommand(switchAllOff);
 
		remoteControl.setCommand(0, switchAllOncro, switchAllOffMacro);
  
		System.out.println(remoteControl);
		System.out.println("--- Selecting Macro On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Selecting Macro Off---");
		remoteControl.offButtonWasPushed(0);

	}

}
