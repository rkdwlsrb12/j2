package com.j2.adapter.enumrator;

import java.util.*;

public class Enumerator {
	public static void main (String args[]) {
		
		Vector v = new Vector(Arrays.asList(args));
		
		Enumeration enumeration = v.elements();
		
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
		Iterator iterator = v.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
