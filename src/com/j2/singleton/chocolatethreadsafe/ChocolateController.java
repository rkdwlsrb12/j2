package com.j2.singleton.chocolatethreadsafe;

public class ChocolateController{
  public static void main(String args[]){
     ChocolateBoiler boiler= ChocolateBoiler.getInstance();
     boiler.fill();
     boiler.drain();
     boiler.boil();
     
     ChocolateBoiler boiler2= ChocolateBoiler.getInstance();
     boiler2.fill();
     boiler2.drain();
     boiler2.boil();
     
     ChocolateBoiler boiler3= ChocolateBoiler.getInstance();
     boiler3.fill();
     boiler3.drain();
     boiler3.boil();
  }
}
     