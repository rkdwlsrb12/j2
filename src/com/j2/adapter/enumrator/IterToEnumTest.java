package com.j2.adapter.enumrator;

import java.util.*;

public class IterToEnumTest {
	public static void main (String args[]) {
		
		ArrayList l = new ArrayList(Arrays.asList(args));
		
		Enumeration enumeration = new IterToEnum(l.iterator());
		
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}