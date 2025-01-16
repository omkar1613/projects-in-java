package com.controller;

public class Car extends Vehicle {
	

	int numOfDoors;

	public Car(String brand, int speed, int numOfDoors) {
		super(brand, speed);
		this.numOfDoors = numOfDoors;
	}

	
	@Override
	public String toString() {
		return "Car [numOfDoors=" + numOfDoors + ", brand=" + brand + ", speed=" + speed + "]";
	}


	@Override
	public void Start() {
		System.out.println("Start The Car");
	}
	
	

	
	
	


}
