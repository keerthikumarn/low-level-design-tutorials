package com.lld.flightbooking;

import java.util.ArrayList;
import java.util.List;

public class FlightBookingManagementSystem {

	private List<Flight> flights;
	private List<Passenger> passengers;
	private List<Crew> crewMembers;
	private List<Aircraft> aircrafts;

	public FlightBookingManagementSystem() {
		this.flights = new ArrayList<Flight>();
		this.passengers = new ArrayList<Passenger>();
		this.crewMembers = new ArrayList<Crew>();
		this.aircrafts = new ArrayList<Aircraft>();
	}

	public void addFlight(Flight flight) {
		flights.add(flight);
	}

	public void addPassengers(Passenger passenger) {
		passengers.add(passenger);
	}

	public void addCrew(Crew crew) {
		crewMembers.add(crew);
	}

	public void addAircraft(Aircraft aircraft) {
		aircrafts.add(aircraft);
	}
	
	public Aircraft getAircraft() {
		return this.aircrafts.get(0);
	}

	@Override
	public String toString() {
		return "FlightBookingManagementSystem [flights=" + flights + ", passengers=" + passengers + ", crewMembers="
				+ crewMembers + ", aircrafts=" + aircrafts + "]";
	}

}
