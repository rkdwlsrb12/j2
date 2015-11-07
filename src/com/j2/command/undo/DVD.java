package com.j2.command.undo;

public class DVD {
	String location;
	int level;

	public void volumnLevel(int level) {
		this.level = level;
		if (level == 0) {
			off();
		}
		else {
			System.out.println("DVD Player is on and a level of volumn to " + level + "%");
		}
	}
	public int getLevel() {
		return level;
	}

	public DVD(String location){
		this.location=location;
	}
  
  public void on(){
	  level=100;
    System.out.println("DVD Player is on");
  }
  
   public void off(){
	level=0;
    System.out.println("DVD Player is off");
  }
}
