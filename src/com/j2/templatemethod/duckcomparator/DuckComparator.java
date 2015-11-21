package com.j2.templatemethod.duckcomparator;

import java.util.Comparator;

public class DuckComparator implements Comparator<Duck> {
	
	public int compare(Duck o1, Duck o2) {
		if (o1.weight < o2.weight) {
			return -1;
		} else if (o1.weight == o2.weight) {
			return 0;
		} else {
			return 1;
		}

	}

	

}
