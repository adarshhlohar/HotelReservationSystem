package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcom to Hotel Reservation System !!");

		/*
		 * UC-1Ability to add Hotel in a Hotel Reservation System with Name and rates
		 * for Regular Customer... Create an ArrayList to store hotels
		 */
		ArrayList<Hotels> hotelList = new ArrayList<>();

		/*
		 * UC-3 Added A weekend rate for regular customer Create an array of Hotels to
		 * add to the list
		 */
		Hotels[] addHotels = { 
				new Hotels("Lakewood", 110, 90, 3,80,80), 
				new Hotels("Bridgewood", 150, 50, 4,110,50),
				new Hotels("Ridgewood", 220, 150, 5,100,40)
				};

		/*
		 * Add hotels to the ArrayList
		 */
		for (Hotels hotel : addHotels) {
			hotelList.add(hotel);
		}

		/*
		 * Use an Iterator to iterate over the hotels and print their details
		 */
		Iterator<Hotels> itr = hotelList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		/*
		 * UC-2 Ability to find the cheapest Hotel Example usage of the
		 * FindingHotelWithRequirement service to find and print the name of the hotel
		 * with the minimum rate for regular customers from the provided list of hotels.
		 * This demonstrates how to utilize the 'cheapestHostel' method.
		 */
		FindingHotelWithRequirement hotelService = new FindingHotelWithRequirement();

		String[] date = { "2020-09-10", "2020-09-11" };
		hotelService.cheapestHostelForGivenDate(hotelList, date);

		/*
		 * UC-3 to find the cheapest Hotel for a given Date Range based on weekday and
		 * weekend with the minimum rate for regular customers from the provided list of
		 * hotels. This demonstrates how to utilize the 'cheapestHostelwithrespect
		 * weekend and weekday' method.
		 */
		String[] date2 = { "2020-09-11", "2020-09-12" };
		hotelService.findingHotelsBasedOnWeekdayAndWeekend(hotelList, date2);

		
		hotelService.cheapestBestRatedHotel(hotelList,date2);
		
		/*
		 * UC-7 find the Best Rated Hotel for a given Date Range
		 */
		hotelService.findBestRatedHotels(hotelList, date2);
	}
}
