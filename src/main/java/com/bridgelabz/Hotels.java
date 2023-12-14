package com.bridgelabz;

public class Hotels {
	private String name;
	private int ratesForRegularInWeekday;
	private int ratesForRegularInWeekend;
	private int rating;

	public Hotels(String name, int ratesForRegularInWeekday, int ratesForRegularInWeekend, int rating) {
		this.name = name;
		this.ratesForRegularInWeekday = ratesForRegularInWeekday;
		this.ratesForRegularInWeekend = ratesForRegularInWeekend;
		this.rating = rating;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Hotels [name=" + name + ", ratesForRegularInWeekday=" + ratesForRegularInWeekday
				+ ", ratesForRegularInWeekend=" + ratesForRegularInWeekend + ", rating=" + rating + "]";
	}

}
