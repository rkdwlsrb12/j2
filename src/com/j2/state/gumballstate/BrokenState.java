package com.j2.state.gumballstate;

public class BrokenState implements State {
	GumballMachine gumballMachine;
	 
    public BrokenState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
 public void insertQuarter() {
  System.out.println("The machine is broken so it ate your quarter, sorry!");
  gumballMachine.setState(gumballMachine.getBrokenState());
 }
 
 public void insertNotQuarter() {
	 System.out.println("Dont try to trick me! You inserted a WRONG coin");
	 gumballMachine.setState(gumballMachine.getBrokenState());
		
	}
 
 public void ejectQuarter() {
	 System.out.println("Your WRONG coin returned");
     gumballMachine.setState(gumballMachine.getNoQuarterState());
 }
 
 public void turnCrank() {
  System.out.println("You turned, but there's no quarter");
  }
 
 public void dispense() {
  System.out.println("You need to put a right coin!");
 } 
 
 public String toString() {
  return "broken because you put WRONG coin in the machine";
 }

}
