package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;

public class HostelReservationSystem {
	public static void main(String[] args) {
		System.out.println("Welcom to Hotel Reservation System !!");
		ArrayList<Hotels> hotelList = new ArrayList<>();
		Hotels[] addHotels = {
				new Hotels("Lakewood", 110),
				new Hotels("Bridgewood", 160),
				new Hotels("Ridgewood", 220)
		};
		
		for(Hotels hotel : addHotels) {
			hotelList.add(hotel);
		}
		
		Iterator<Hotels> itr = hotelList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
