package com.lld.flightbooking;

import java.time.LocalDate;
import java.util.Date;

public class FlightTicketBookingSystem {

	public static void main(String[] args) {
		FlightBookingManagementSystem fbms = new FlightBookingManagementSystem();
		addPassengers(fbms);
		addAircraft(fbms);
		addFlight(fbms);
		addCrew(fbms);
		System.out.println(fbms.toString());
	}

	private static void addPassengers(FlightBookingManagementSystem fbms) {
		Passenger passenger = new Passenger("Keerthi Kumar N", "ABCDF123");
		fbms.addPassengers(passenger);
	}

	private static void addAircraft(FlightBookingManagementSystem fbms) {
		fbms.addAircraft(new Aircraft("1234", "Emirates", 375));
	}

	private static void addFlight(FlightBookingManagementSystem fbms) {
		fbms.addFlight(new Flight(4566, fbms.getAircraft(), new Date(), new Date(), "BLR", "DEL"));
	}

	private static void addCrew(FlightBookingManagementSystem fbms) {
		fbms.addCrew(new Crew("Ms. Test", 444));
	}

}
