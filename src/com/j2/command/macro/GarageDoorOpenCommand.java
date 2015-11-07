package com.j2.command.macro;

public class GarageDoorOpenCommand implements Command{
	GarageDoor garagedoor;
	int level;
	
	public GarageDoorOpenCommand(GarageDoor garagedoor){
	    this.garagedoor=garagedoor;
		}
	
	public void undo() {
		garagedoor.openScale(level);
	}

	public void execute(){
	level=garagedoor.getLevel();
    garagedoor.open(); 
	}
  
}