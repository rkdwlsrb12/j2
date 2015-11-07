package com.j2.command.undo;

public class DVDOnCommand implements Command{
	DVD dvd;
	int level;
	
	public DVDOnCommand(DVD dvd){
	    this.dvd=dvd;
		}
	
	public void undo() {
		dvd.volumnLevel(level);
	}

	public void execute(){
	level=dvd.getLevel();
    dvd.on(); 
	}
}
