package com.bridgelabz;

public class Hotels {
	private String name;
	private int ratesForRegular;
	
	
	public Hotels(String name, int ratesForRegular) {
		this.name = name;
		this.ratesForRegular = ratesForRegular;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRatesForRegular() {
		return ratesForRegular;
	}


	public void setRatesForRegular(int ratesForRegular) {
		this.ratesForRegular = ratesForRegular;
	}


	@Override
	public String toString() {
		return "Hotels [name=" + name + ", ratesForRegular=" + ratesForRegular + "]";
	}
	
	
}
