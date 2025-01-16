package com.client;

import java.util.Scanner;

import com.controller.VehicleManager;

public class MainAPP {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		VehicleManager obj=new VehicleManager();
		
		while(true)
		{
			System.out.println("------------------------------------------------------");
			System.out.println("\t WELCOME TO VEHICLE MANAGEMENT SYSTEM");
			System.out.println("------------------------------------------------------");
			System.out.println("Menus : \n \t 1. Add Vehicle \n"+"\t 2. Display Vehicle \n"+"\t 3. Start Vehicle \n"+"\t 4. Exit \n");
			System.out.println("------------------------------------------------------");
			System.out.println("Choose Opetion From above menu :");
			
			int choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1:
				obj.addVehicle(choice);
				break;
				
			case 2:
				obj.displayVehicle();
				break;
				
			case 3:
				obj.startVehicle();
				break;
				
			case 4:
				
				System.out.println("Exits");
				System.exit(0);		
			}	
		}
	}
}
