package com.microservices2.models;

public class Time {

	private String formattedTime;

	public Time(String formattedTime) {
		this.formattedTime = formattedTime;
	}
	
	public String getFormattedTime() {
		return formattedTime;
	}
}
