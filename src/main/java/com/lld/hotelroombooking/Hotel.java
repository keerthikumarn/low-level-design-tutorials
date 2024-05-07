package com.lld.hotelroombooking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private String hotelName;
	private List<Room> rooms;
	private List<Booking> bookings;

	public Hotel(String hotelName) {
		this.hotelName = hotelName;
		this.rooms = new ArrayList<>();
		this.bookings = new ArrayList<>();
	}

	public Booking bookRoom(String roomNumber, Customer customer, LocalDate checkIn, LocalDate checkOut) {
		Room room = rooms.stream().filter(hRoom -> hRoom.roomNo().equals(roomNumber) && hRoom.isBooked()).findFirst()
				.orElse(null);
		if (room != null) {
			Booking booking = new Booking(room, customer, checkIn, checkOut);
			bookings.add(booking);
			return booking;
		}
		return null;
	}

	public void addRoom(Room room) {
		this.rooms.add(room);
	}

}
  