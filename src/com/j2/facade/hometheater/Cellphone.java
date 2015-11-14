package com.j2.facade.hometheater;

import java.util.*;

public class Cellphone {
	String description;
	long currentTime;
	
	public Cellphone(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}

	
	public void showTime() {
		currentTime = System.currentTimeMillis();
		System.out.println(description + " shows the current time \"" + new Date(currentTime) + "\"");
	}

	public void showAfterTime() {
		currentTime = System.currentTimeMillis()+300000;
		System.out.println(description + " shows the current time \"" + new Date(currentTime) + "\"");
	}
	
	public String toString() {
		return description;
	}
}