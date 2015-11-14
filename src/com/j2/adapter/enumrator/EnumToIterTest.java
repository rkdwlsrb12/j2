package com.j2.adapter.enumrator;

import java.util.*;

public class EnumToIterTest {
	public static void main (String args[]) {
		
		Vector v = new Vector(Arrays.asList(args));
		
		Iterator iterator = new EnumToIter(v.elements());
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}