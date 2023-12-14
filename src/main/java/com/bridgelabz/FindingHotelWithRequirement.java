package com.bridgelabz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class FindingHotelWithRequirement {

	/**
	 * Finds and prints the name of the hotel with the minimum rate on the weekadys for regular
	 * customers in the provided list of hotels.
	 * 
	 * @param hotel The list of hotels to search for the cheapest one.And the Dates
	 */
	public void cheapestHostelForGivenDate(List<Hotels> hotel, String[] date) {

		int totalAmount = 0;
		//It will Iterating throw the date 
		for (int i = 0; i < date.length; i++) {

//			If the date is weekday it will finding the cheapest Hotel
			if (dateIsWeekday(date[i])) {
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
					
					//Adding the total amount if found cheapest hotel
					totalAmount += minRate;

					// Now, hotelWithMinRate contains the hotel with the minimum rate for regular
					// customers
					System.out.println("Hotel with the minimum rate for regular customers: "
							+ hotelWithMinRate.getName() + "For the date " + date[i]);
				}
			}
		}
		System.out.println("And the total amount is " + totalAmount);
	}

	public boolean dateIsWeekday(String date) {
		LocalDate currentDate = LocalDate.parse(date);
		DayOfWeek day = currentDate.getDayOfWeek();
		if (day.equals(DayOfWeek.SUNDAY) || day.equals(DayOfWeek.SATURDAY)) {
			return false;
		} else {
			return true;
		}
	}
}
