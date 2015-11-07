package com.j2.command.macro;

public class TVOnCommand implements Command{
	TV tv;
	int level;
	
	public TVOnCommand(TV tv){
	    this.tv=tv;
		}
	
	public void undo() {
		tv.volumnLevel(level);
	}

	public void execute(){
	level=tv.getLevel();
    tv.on(); 
	}
}
