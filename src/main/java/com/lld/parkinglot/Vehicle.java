package com.lld.parkinglot;

public abstract class Vehicle {
	
	private String licenseNumber;
    protected VehicleType type;
    
    public Vehicle(String licenseNumber, VehicleType type) {
        this.licenseNumber = licenseNumber;
        this.type = type;
    }

}
