package com.j2.singleton.printspooler;

public class PrintSpooler {
	 protected static PrintSpooler uniqueInstance;
	 protected static int numCalled=1;
	 
	 
	 protected PrintSpooler() {}
	 
	 public static synchronized PrintSpooler getInstance() throws Exception{
	  if (uniqueInstance == null) {
	   uniqueInstance = new PrintSpooler();
	   System.out.println("Opening "+ (numCalled++)+"bunjjae"+" spooler");
	   System.out.println("Printer opened");
	  }
	  else
		  throw new Exception( "Opening "+(numCalled++)+"bunjjae"+ " spooler"+"\n"+"Only print one at a time");
	  return uniqueInstance;
	 }
	 public static String showType(){
			return "Color doesn't matter!";
		}
	
}
