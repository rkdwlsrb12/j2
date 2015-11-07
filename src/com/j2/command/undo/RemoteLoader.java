package com.j2.command.undo;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		 
		Light DiningRoomLight = new Light("Dining Room");
		GarageDoor gate1Garage=new GarageDoor(1);
		DVD DiningRoomDVD=new DVD("Dining Room");

		LightOnCommand DiningRoomLightOn = new LightOnCommand(DiningRoomLight);
		LightOffCommand DiningRoomLightOff = new LightOffCommand(DiningRoomLight);
		
		GarageDoorOpenCommand gate1GarageOpen=new GarageDoorOpenCommand(gate1Garage);
		GarageDoorCloseCommand gate1GarageClose=new GarageDoorCloseCommand(gate1Garage);
		
		DVDOnCommand  DiningRoomDVDOn=new  DVDOnCommand( DiningRoomDVD);
		DVDOffCommand  DiningRoomDVDOff=new DVDOffCommand( DiningRoomDVD);
		
		remoteControl.setCommand(0, DiningRoomLightOn, DiningRoomLightOff);
		
		remoteControl.setCommand(1, gate1GarageOpen, gate1GarageClose);
		
		remoteControl.setCommand(2, DiningRoomDVDOn, DiningRoomDVDOff);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		
		System.out.println(remoteControl);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		
		System.out.println(remoteControl);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(2);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
	
	}

}
