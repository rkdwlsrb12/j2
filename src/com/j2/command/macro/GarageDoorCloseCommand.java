package com.j2.command.macro;

public class GarageDoorCloseCommand implements Command{
	GarageDoor garagedoor;
	int level;
	
	public GarageDoorCloseCommand(GarageDoor garagedoor){
	    this.garagedoor=garagedoor;
		}
	
	public void undo() {
		garagedoor.openScale(level);
	}

	public void execute(){
	level=garagedoor.getLevel();
    garagedoor.shut(); 
	}
  
}