package com.lld.hotelroombooking;

public record Room(String roomNo, String roomType, boolean isBooked) {

	public Room(String roomNo, String roomType, boolean isBooked) {
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.isBooked = isBooked;
	}

	public Room bookRoom() {
		return new Room(this.roomNo, this.roomType, true);
	}

	public Room vacateRoom() {
		return new Room(this.roomNo, this.roomType, false);
	}
}
