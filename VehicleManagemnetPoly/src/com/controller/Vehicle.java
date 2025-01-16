package com.controller;

public class Vehicle {
	String brand;
	int speed;
	
	
	public Vehicle(String brand, int speed) {
		
		this.brand = brand;
		this.speed = speed;
	}


	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", speed=" + speed + "]";
	}
	
	public void Start() {
		System.out.println("Start The Vehicle ");
	}
	
	
	

}
