package com.j2.command.macro;

public class DVDOffCommand implements Command{
	DVD dvd;
	int level;
	
	public DVDOffCommand(DVD dvd){
	    this.dvd=dvd;
		}
	
	public void undo() {
		dvd.volumnLevel(level);
	}

	public void execute(){
	level=dvd.getLevel();
    dvd.off(); 
	}
}
