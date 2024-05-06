package com.lld.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

	private List<ParkingFloor> parkingFloors;
	private List<ParkingTicket> issuedTickets;

	public ParkingLot() {
		this.parkingFloors = new ArrayList<>();
		this.issuedTickets = new ArrayList<>();
	}

	public ParkingSpot findAvailableSpot(VehicleType type) {
		return null;
	}

	public ParkingTicket issueTicket(Vehicle vehicle) {
		ParkingSpot spot = findAvailableSpot(vehicle.getType());
		if (spot != null) {
			spot.occupySpot();
			ParkingTicket ticket = new ParkingTicket(generateTicketId());
			issuedTickets.add(ticket);
			return ticket;
		}
		return null;
	}

	public void processPayment(ParkingTicket ticket, double fee) {
		ticket.paymentDone(fee);
	}

	private String generateTicketId() {
		return "TICKET_" + System.currentTimeMillis();
	}
}
