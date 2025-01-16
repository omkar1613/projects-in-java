package com.controller;

public class Bike extends Vehicle{
	boolean hasGear;

	public Bike(String brand, int speed, boolean hasGear) {
		super(brand, speed);
		this.hasGear = hasGear;
	}

	
	
	@Override
	public String toString() {
		return "Bike [hasGear=" + hasGear + ", brand=" + brand + ", speed=" + speed + "]";
	}



	@Override
	public void Start() {
		System.out.println("Start the Bike");
	}

}
