package com.lld.parkinglot;

import java.util.Date;

public class ParkingTicket {

	private String ticketId;
	private Date issuedDateTime;
	private Date paidDateTime;
	private double fee;

	public ParkingTicket(String ticketId) {
		this.ticketId = ticketId;
		this.issuedDateTime = new Date();
	}

	public void paymentDone(double fee) {
		this.paidDateTime = new Date();
		this.fee = fee;
	}
}
