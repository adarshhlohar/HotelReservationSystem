package com.bridgelabz;

import java.util.Iterator;
import java.util.List;

public class FindingHotelWithRequirement {

	/**
	 * Finds and prints the name of the hotel with the minimum rate for regular customers
	 * in the provided list of hotels.
	 *
	 * @param hotel The list of hotels to search for the cheapest one.
	 */
	public void cheapestHostel(List<Hotels> hotel) {
		
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

			// Now, hotelWithMinRate contains the hotel with the minimum rate for regular
			// customers
			System.out.println("Hotel with the minimum rate for regular customers: " + hotelWithMinRate.getName());
		}
	}
}
