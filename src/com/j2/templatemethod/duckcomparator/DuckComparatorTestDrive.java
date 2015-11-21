package com.j2.templatemethod.duckcomparator;

import java.util.*;

public class DuckComparatorTestDrive {

	public static void main(String[] args) {
		Duck[] ducks = { 
						new Duck("Homer", 10), 
						new Duck("Meggie", 2),
						new Duck("Bart", 6),
						new Duck("Marge", 7),
						new Duck("Lisa", 4), 
						new Duck("Stewie", 2)
		 };

		System.out.println("Before sorting:");
		display(ducks);

		Arrays.sort(ducks,new DuckComparator());
 
		System.out.println("\nAfter sorting:");
		display(ducks);
	}

	public static void display(Duck[] ducks) {
		for (int i = 0; i < ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}
}