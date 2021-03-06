package com.j2.singleton.chocolatethreadsafe;

public class ChocolateController{
  public static void main(String args[]){
     ChocolateBoiler boiler= ChocolateBoiler.getInstance();
     boiler.fill();
     boiler.boil();
     boiler.drain();
     
     ChocolateBoiler boiler2= ChocolateBoiler.getInstance();
     boiler2.fill();
     boiler2.boil();
     boiler2.drain();
     
     ChocolateBoiler boiler3= ChocolateBoiler.getInstance();
     boiler3.fill();
     boiler3.boil();
     boiler3.drain();
  }
}
     