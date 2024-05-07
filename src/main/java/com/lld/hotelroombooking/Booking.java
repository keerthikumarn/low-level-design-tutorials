package com.lld.hotelroombooking;

import java.time.LocalDate;

public class Booking {

	private Room room;
	private Customer customer;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;

	public Booking(Room room, Customer customer, LocalDate checkIn, LocalDate checkOut) {
		this.room = room;
		this.customer = customer;
		this.checkInDate = checkIn;
		this.checkOutDate = checkOut;
		room.bookRoom();
	}

	// Method to complete booking
	public Room completeBooking() {
		return room.vacateRoom();
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

}
