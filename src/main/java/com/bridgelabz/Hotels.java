package com.bridgelabz;

public class Hotels {
	private String name;
	private int ratesForRegularInWeekday;
	
	
	public Hotels(String name, int ratesForRegularInWeekday) {
		this.name = name;
		this.ratesForRegularInWeekday = ratesForRegularInWeekday;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getratesForRegularInWeekday() {
		return ratesForRegularInWeekday;
	}


	public void setratesForRegularInWeekday(int ratesForRegularInWeekday) {
		this.ratesForRegularInWeekday = ratesForRegularInWeekday;
	}


	@Override
	public String toString() {
		return "Hotels [name=" + name + ", ratesForRegularInWeekday=" + ratesForRegularInWeekday + "]";
	}
	
	
}
