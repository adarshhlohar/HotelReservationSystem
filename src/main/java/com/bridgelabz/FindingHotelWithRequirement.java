package com.bridgelabz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindingHotelWithRequirement {

	/**
	 * Finds and prints the name of the hotel with the minimum rate on the weekdays
	 * for regular customers in the provided list of hotels.
	 * 
	 * @param hotel The list of hotels to search for the cheapest one.And the Dates
	 */
	int totalAmount = 0;
	
	/*
	 * finding the cheapest hotel at given date 
	 */
	public void cheapestHostelForGivenDate(List<Hotels> hotel, String[] date) {
		totalAmount = 0;
		// It will Iterating through the date
		for (int i = 0; i < date.length; i++) {

			// If the date is weekday it will finding the cheapest Hotel
			if (dateIsWeekday(date[i])) {
				cheapestHotelOnWeekdays(hotel, date[i]);
			} else {
				System.out.println("we Are finding for weekdays only the given rates");
			}
		}
		System.out.println("And the total amount is " + totalAmount);
	}

	/*
	 * UC-4 Finding the cheapest Hotel for a given Date Range based on weekday and
	 * weekend In this method we can finding the cheapest hotel for a given date the
	 * given date is weekday it will find best hotels in weekday if the given date
	 * is on weekend it will find the cheapest hotel on weekend
	 * 
	 * @param hotel The list of hotels to search for the cheapest one.And the Dates
	 */
	public void findingHotelsBasedOnWeekdayAndWeekend(ArrayList<Hotels> hotel, String[] date) {
		totalAmount = 0;
		// first we can iterating through the dates
		for (int i = 0; i < date.length; i++) {
			// I am checking the date if the date is weekend or weekday
			if (dateIsWeekday(date[i])) {
				// If the date is weekday we can finding the cheapest hotel on weekday by using
				// below method
				cheapestHotelOnWeekdays(hotel, date[i]);
			} else {
				cheapestHotelOnWeekend(hotel, date[i]);
			}
		}
		System.out.println("And the total amount is " + totalAmount);
	}

	public void findBestRatedHotels(ArrayList<Hotels> hotel, String[] date) {
		totalAmount = 0;
		for (int i = 0; i < date.length; i++) {
			if (dateIsWeekday(date[i])) {
				hotelWithBestRatedWeekday(hotel, date[i]);
			}else {
				hotelWithBestRatedWeekend(hotel, date[i]);
			}
		}
		System.out.println("And the total amount is " + totalAmount);
	}

	/*
	 * The function dateIsWeekday it will check the the date if the date is saturday
	 * or sunday it will be weekend it return false And other days are weekday it
	 * will return the true we use the function for checking the date is weekday or
	 * weekend
	 */
	public boolean dateIsWeekday(String date) {
		LocalDate currentDate = LocalDate.parse(date);
		DayOfWeek day = currentDate.getDayOfWeek();
		if (day.equals(DayOfWeek.SUNDAY) || day.equals(DayOfWeek.SATURDAY)) {
			return false;
		} else {
			return true;
		}
	}

	/*
	 * The cheapest hotel in weekdays we are using same in the use case 4 if the
	 * given date is weekday and we are finding the cheapest hotel we can call the
	 * function where we need
	 */
	void cheapestHotelOnWeekdays(List<Hotels> hotel, String date) {
		/*
		 * create an iterator to traverse the list of hotels
		 */
		Iterator<Hotels> iterator = hotel.iterator();

		// Ensure that there is at least one hotel in the list
		if (iterator.hasNext()) {
			// Initialize the first hotel as the one with the minimum rate
			Hotels hotelWithMinRate = iterator.next();
			int minRate = hotelWithMinRate.getratesForRegularInWeekday();

			// Iterate through the remaining hotels
			while (iterator.hasNext()) {
				// Get the current hotel
				Hotels currentHotel = iterator.next();
				int currentRate = currentHotel.getratesForRegularInWeekday();

				// Update the hotelWithMinRate if the current hotel has a lower rate
				if (currentRate < minRate) {
					// Update the hotelWithMinRate and minRate
					hotelWithMinRate = currentHotel;
					minRate = currentRate;
				}
			}

			// Adding the total amount if found cheapest hotel
			totalAmount += minRate;

			// Now, hotelWithMinRate contains the hotel with the minimum rate for regular
			// customers
			System.out.println("Hotel with the minimum rate for regular customers in weekday: "
					+ hotelWithMinRate.getName() + " For the date " + date + " The min price of hotel is " + minRate);
		}
	}

	/*
	 * The cheapest hotel in weekend we are using same in the use case 4 if the
	 * given date is weekend and we are finding the cheapest hotel we can call the
	 * function where we need
	 */
	void cheapestHotelOnWeekend(List<Hotels> hotel, String date) {
		/*
		 * UC-1
		 * create an iterator to traverse the list of hotels
		 */
		Iterator<Hotels> iterator = hotel.iterator();

		// Ensure that there is at least one hotel in the list
		if (iterator.hasNext()) {
			// Initialize the first hotel as the one with the minimum rate
			Hotels hotelWithMinRate = iterator.next();
			int minRate = hotelWithMinRate.getRatesForRegularInWeekend();

			// Iterate through the remaining hotels
			while (iterator.hasNext()) {
				// Get the current hotel
				Hotels currentHotel = iterator.next();
				int currentRate = currentHotel.getRatesForRegularInWeekend();

				// Update the hotelWithMinRate if the current hotel has a lower rate
				if (currentRate < minRate) {
					// Update the hotelWithMinRate and minRate
					hotelWithMinRate = currentHotel;
					minRate = currentRate;
				}
			}

			// Adding the total amount if found cheapest hotel
			totalAmount += minRate;

			// Now, hotelWithMinRate contains the hotel with the minimum rate for regular
			// customers
			System.out.println("Hotel with the minimum rate for regular customers in weekend: "
					+ hotelWithMinRate.getName() + " For the date " + date + " The min price of hotel is " + minRate);
		}
	}

	void hotelWithBestRatedWeekday(List<Hotels> hotel, String date) {
		/*
		 * create an iterator to traverse the list of hotels
		 */
		Iterator<Hotels> iterator = hotel.iterator();

		if (iterator.hasNext()) {
			// Initialize the first hotel as the one with the minimum rate
			Hotels hotelWithMaxRating = iterator.next();
			int maxRating = hotelWithMaxRating.getRating();

			// Iterate through the remaining hotels
			while (iterator.hasNext()) {
				// Get the current hotel
				Hotels currentHotel = iterator.next();
				int currentRating = currentHotel.getRating();

				// Update the hotelWithMinRate if the current hotel has a lower rate
				if (currentRating > maxRating) {
					// Update the hotelWithMinRate and minRate
					hotelWithMaxRating = currentHotel;
					maxRating = currentRating;
				}
			}
			int maxRate = hotelWithMaxRating.getratesForRegularInWeekday();
			// Adding the total amount if found cheapest hotel
			totalAmount += maxRate;

			// Now, hotelWithMinRate contains the hotel with the minimum rate for regular
			// customers
			System.out.println("Hotel with the best rating is : " + hotelWithMaxRating.getName() + " For the date "
					+ date + " The  price for regular customer at weekday is :" + maxRate);
		}
	}
	
	
	void hotelWithBestRatedWeekend(List<Hotels> hotel, String date) {
		/*
		 * create an iterator to traverse the list of hotels
		 */
		Iterator<Hotels> iterator = hotel.iterator();

		if (iterator.hasNext()) {
			// Initialize the first hotel as the one with the minimum rate
			Hotels hotelWithMaxRating = iterator.next();
			int maxRating = hotelWithMaxRating.getRating();

			// Iterate through the remaining hotels
			while (iterator.hasNext()) {
				// Get the current hotel
				Hotels currentHotel = iterator.next();
				int currentRating = currentHotel.getRating();

				// Update the hotelWithMinRate if the current hotel has a lower rate
				if (currentRating > maxRating) {
					// Update the hotelWithMinRate and minRate
					hotelWithMaxRating = currentHotel;
					maxRating = currentRating;
				}
			}
			int maxRate = hotelWithMaxRating.getRatesForRegularInWeekend();
			// Adding the total amount if found cheapest hotel
			totalAmount += maxRate;

			// Now, hotelWithMinRate contains the hotel with the minimum rate for regular
			// customers
			System.out.println("Hotel with the best rating is : " + hotelWithMaxRating.getName() + " For the date "
					+ date + " The  price for regular customer at weekend is :" + maxRate);
		}
	}

}
