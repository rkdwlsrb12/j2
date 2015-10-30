package com.j2.singleton.printspooler;

public class BlackPrint extends PrintSpooler{
	 
	 private BlackPrint() {
	  super();
	 }
	 
	 public static String showType(){
			return "It is a black print";
		}
	 }
