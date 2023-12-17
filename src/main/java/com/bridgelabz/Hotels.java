package com.bridgelabz;

public class Hotels {
	private String name;
	private int ratesForRegularInWeekday;
	private int ratesForRegularInWeekend;
	private int rating;
	private int rateForRewardCustomerInWeekday;
	private int rateForRewardCustomerInWeekend;

	public Hotels(String name, int ratesForRegularInWeekday, int ratesForRegularInWeekend, int rating, int rateForRewardCustomerInWeekday,int rateForRewardCustomerInWeekend) {
		this.name = name;
		this.ratesForRegularInWeekday = ratesForRegularInWeekday;
		this.ratesForRegularInWeekend = ratesForRegularInWeekend;
		this.rating = rating;
		this.rateForRewardCustomerInWeekday = rateForRewardCustomerInWeekday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRatesForRegularInWeekday() {
		return ratesForRegularInWeekday;
	}

	public void setRatesForRegularInWeekday(int ratesForRegularInWeekday) {
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

	public int getRateForRewardCustomerInWeekday() {
		return rateForRewardCustomerInWeekday;
	}

	public void setRateForRewardCustomerInWeekday(int rateForRewardCustomerInWeekday) {
		this.rateForRewardCustomerInWeekday = rateForRewardCustomerInWeekday;
	}

	public int getRateForRewardCustomerInWeekend() {
		return rateForRewardCustomerInWeekend;
	}

	public void setRateForRewardCustomerInWeekend(int rateForRewardCustomerInWeekend) {
		this.rateForRewardCustomerInWeekend = rateForRewardCustomerInWeekend;
	}

	@Override
	public String toString() {
		return "Hotels [name=" + name + ", ratesForRegularInWeekday=" + ratesForRegularInWeekday
				+ ", ratesForRegularInWeekend=" + ratesForRegularInWeekend + ", rating=" + rating
				+ ", rateForRewardCustomerInWeekday=" + rateForRewardCustomerInWeekday
				+ ", rateForRewardCustomerInWeekend=" + rateForRewardCustomerInWeekend + "]";
	}

	


}
