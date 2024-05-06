package com.lld.parkinglot;

public class ParkingLot {

	private String id;
	private VehicleType type;
	private boolean isOccupied;

	public ParkingLot(String id, VehicleType type) {
        this.id = id;
        this.type = type;
        this.isOccupied = false;
    }

	public void occupySpot() {
		isOccupied = true;
	}

	public void freeSpot() {
		isOccupied = false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

}
