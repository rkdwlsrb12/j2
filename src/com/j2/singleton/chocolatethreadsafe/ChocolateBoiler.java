package com.j2.singleton.chocolatethreadsafe;

public class ChocolateBoiler{
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled;
  private ChocolateBoiler(){}
  public static synchronized ChocolateBoiler getInstance(){
	  if (uniqueInstance == null) {
			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueInstance = new ChocolateBoiler();
		}
		System.out.println("Returning instance of Chocolate Boiler");
		System.out.println("numCalled "+numCalled++);
		return uniqueInstance;
  }
  public void fill(){
    if(isEmpty()){
      empty=false;
      boiled=false;
    }
  }
    public boolean isEmpty(){
      return empty;
    }
    
    public void drain() {
		if (!isEmpty() && isBoiled()) {
			
			empty = true;
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			
			boiled = true;
		}
	}
  
	
 
	public boolean isBoiled() {
		return boiled;
	}
}
    