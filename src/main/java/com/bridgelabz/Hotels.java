package com.bridgelabz;

public class Hotels {
	private String name;
	private int ratesForRegularInWeekday;
	private int ratesForRegularInWeekend;
	
	
	public Hotels(String name, int ratesForRegularInWeekday,int ratesForRegularInWeekend) {
		this.name = name;
		this.ratesForRegularInWeekday = ratesForRegularInWeekday;
		this.ratesForRegularInWeekend = ratesForRegularInWeekend;
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

	

	public int getRatesForRegularInWeekend() {
		return ratesForRegularInWeekend;
	}


	public void setRatesForRegularInWeekend(int ratesForRegularInWeekend) {
		this.ratesForRegularInWeekend = ratesForRegularInWeekend;
	}


	@Override
	public String toString() {
		return "Hotels [name=" + name + ", ratesForRegularInWeekday=" + ratesForRegularInWeekday
				+ ", ratesForRegularInWeekend=" + ratesForRegularInWeekend + "]";
	}

	
}
