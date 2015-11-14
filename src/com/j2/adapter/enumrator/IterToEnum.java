package com.j2.adapter.enumrator;

import java.util.*;

public class IterToEnum implements Enumeration {
	Iterator iterator;
 
	public IterToEnum(Iterator iterator) {
		this.iterator = iterator;
	}
 
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}
 
	public Object nextElement() {
		return iterator.next();
	}
}
