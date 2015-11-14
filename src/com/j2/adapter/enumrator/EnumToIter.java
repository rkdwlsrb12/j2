package com.j2.adapter.enumrator;

import java.util.*;

public class EnumToIter implements Iterator {
	Enumeration enumeration;
 
	public EnumToIter(Enumeration enumeration) {
		this.enumeration = enumeration;
	}
 
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}
 
	public Object next() {
		return enumeration.nextElement();
	}
 
	public void remove() {
		throw new UnsupportedOperationException();
	}
}