package com.j2.singleton.printspooler;

public class PrintMain {

	public static void main(String[] args) {
		try{PrintSpooler non = PrintSpooler.getInstance();
		String n=PrintSpooler.showType();
		System.out.println(n);
		}catch(Exception e){
			System.out.println(e.getMessage());
			String n=PrintSpooler.showType();
			System.out.println(n);
		}
		
		try{PrintSpooler black = BlackPrint.getInstance();
			String b=BlackPrint.showType();
			System.out.println(b);
		}catch(Exception e){
			System.out.println(e.getMessage());
			String b=BlackPrint.showType();
			System.out.println(b);
		}
		
		try{PrintSpooler color = ColorPrint.getInstance();
			String c=ColorPrint.showType();
			System.out.println(c);
		}catch(Exception e){	
			System.out.println(e.getMessage());	
			String c=ColorPrint.showType();
			System.out.println(c);
		}
		
		
		

	}

}
