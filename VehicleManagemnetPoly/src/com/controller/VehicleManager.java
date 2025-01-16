package com.controller;

import java.util.Scanner;

public class VehicleManager {
	Scanner sc=new Scanner(System.in);
	Vehicle[] arr=new Vehicle[10];
	 int index=0;
	
	public static int Vehicle;
	
	public void addVehicle(int choice)
	{
		if(choice==1) {
			System.out.println("1. Add Car \n2. Add Bike ");
			int ch1=sc.nextInt();
			
			if(ch1==1)
			{
				System.out.println("Car Details :");
				System.out.println("Enter Brand:-");
				String Brand=sc.next();
				boolean found=false;
				
				for(Vehicle obj:arr)
				{
					try
					{
						if(obj!=null && obj.brand.equalsIgnoreCase(Brand))
						{
							found =true;
							throw new DuplicateVehicleFoundException("Duplicate brand name found for car!!!");
						}
					}
					catch (DuplicateVehicleFoundException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				
				if(!found)
				{
					System.out.println("Enter additional details of car such as Speed and number of doors:");
					int Speed =sc.nextInt();
					int Numdoors=sc.nextInt();
					arr[index ++]=new Car(Brand, Speed, Numdoors);
					System.out.println("Car Add Succesfully :");
				}
				
				
			}
			if(ch1==2)
			{
				System.out.println("Bike Details :");
				System.out.println("Enter Brand ");
				String Brand=sc.next();
				boolean found=false;
				
				for(Vehicle obj:arr)
				{
					try
					{
						if(obj!=null && obj.brand.equalsIgnoreCase(Brand))
						{
							found =true;
							throw new DuplicateVehicleFoundException("Duplicate brand name found for bike!!!");
						}
					}
					catch (DuplicateVehicleFoundException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				
				if(!found)
				{
					System.out.println("Enter additional details of bike such as Speed and number of gear:");
					int Speed =sc.nextInt();
					boolean gear=sc.hasNext();
					
					arr[index ++]=new Bike(Brand, Speed, gear);
					System.out.println("bike Add Succesfully :");
				}

				
				
			}
		}
	}
	
	public void displayVehicle() {
		for(Vehicle obj :arr)
		{
			if(obj !=null) {
				System.out.println(obj.toString());
			}
		}
	}
	
	public void startVehicle() {
		System.out.println("Start");
	}
	
	

}
