package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;

public class HostelReservationSystem {
	public static void main(String[] args) {
		System.out.println("Welcom to Hotel Reservation System !!");
		
		/*UC-1Ability to add Hotel in a Hotel Reservation System with Name and rates for Regular Customer...
		 * Create an ArrayList to store hotels
		 */
		ArrayList<Hotels> hotelList = new ArrayList<>();
		
		/*
		 * Create an array of Hotels to add to the list
		 */
		Hotels[] addHotels = {
				new Hotels("Lakewood", 110),
				new Hotels("Bridgewood", 160),
				new Hotels("Ridgewood", 220)
		};
		
		/*
		 * Add hotels to the ArrayList
		 */
		for(Hotels hotel : addHotels) {
			hotelList.add(hotel);
		}

		/*
		 * Use an Iterator to iterate over the hotels and print their details
		 */
		Iterator<Hotels> itr = hotelList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		/*
		 * UC-2 Ability to find thecheapest Hotel 
		 * Example usage of the FindingHotelWithRequirement service to find and print the name
		 * of the hotel with the minimum rate for regular customers from the provided list of hotels.
		 * This demonstrates how to utilize the 'cheapestHostel' method.
		 */
		FindingHotelWithRequirement service = new FindingHotelWithRequirement();
		String[] date = {"2020-09-10","2020-09-11"};
		
		service.cheapestHostelForGivenDate(hotelList,date);
		
		
	}
}
