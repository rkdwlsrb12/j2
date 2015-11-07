package com.j2.command.undo;

public class GarageDoor{
	int doorNumber;
	int level;

	public void openScale(int level) {
		this.level = level;
		if (level == 0) {
			shut();
		}
		else {
			System.out.println("Garage Door is open to " + level + "%");
		}
	}
	public int getLevel() {
		return level;
	}

	public GarageDoor(int doorNumber){
		this.doorNumber=doorNumber;
	}
  
  public void open(){
	  level=100;
    System.out.println("Garage Door is open");
  }
  
   public void shut(){
	level=0;
    System.out.println("Garage Door is shut down");
  }
}