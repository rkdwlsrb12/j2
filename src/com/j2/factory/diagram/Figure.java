package com.j2.factory.diagram;

public abstract class Figure {
	String name;
	Regularity regularity;
	Shade shade;

	void setName(String name) {
	    this.name = name;
	}
	String getName() {
	    return name;
	}
	abstract void prepare();
	public String toString() {
	    StringBuffer result = new StringBuffer();
	    result.append("---- " + name + " ----\n");
	    if (regularity != null) {
	        result.append(regularity);
	        result.append("\n");
	    }
	    if (shade != null) {
	        result.append(shade);
	        result.append("\n");
	    }
	 
	    return result.toString();
	}
	

}
