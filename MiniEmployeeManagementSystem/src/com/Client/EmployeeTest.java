package com.Client;

import java.util.Scanner;

import com.Controller.DepartmentDetails;
import com.Controller.Employee;
import com.Controller.Managerdetails;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Employee[]arr=new Employee[5];
		int index=0;
		
		
		arr[index++]=new Employee("Om", 01, new DepartmentDetails("cse"), new Managerdetails("Jay"));
		arr[index++]=new Employee("Sai", 02, new DepartmentDetails("cse"), new Managerdetails("Shree"));
		arr[index++]=new Employee("Ram", 03, new DepartmentDetails("cse"), new Managerdetails("Ram"));
		

		while(true) {
			System.out.println("\t** Welcome To Employee Management System **");
			System.out.println("\t 1: Add Employee \n" + "\t 2: Display All Employee \n" + "\t 3: Exit \n" );
			System.out.println("----------------------------------------------------------------------------");
			
			
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:

				if (index < arr.length) {
					System.out.print("Enter Employee Name: ");
					String name = sc.next();
					System.out.print("Enter Employee ID: ");
					int id = sc.nextInt();
					
					boolean idExists = false;
                    for (int i = 0; i < index; i++) {
                        if (arr[i].getEmp_id() == id) {
                            idExists = true;
                            break;
                        }
                    }

                    if (idExists) {
                        System.out.println("Employee ID already exists. Please enter a unique ID.");
                    }
                    else {
					
					System.out.print("Enter Department Name: ");
					String deptName = sc.next();
					System.out.print("Enter Manager Name: ");
					String managerName = sc.next();
                    

					arr[index++] = new Employee(name, id, new DepartmentDetails(deptName), new Managerdetails(managerName));
					System.out.println("Employee added successfully.");
                    }	} else {
					System.out.println("Employee list is full. Cannot add more employees.");
				}
				break;

			case 2:
				for (Employee Emp : arr) {
					if (Emp != null) {
						System.out.println("Employee Name :" + Emp.getEmp_name());
						System.out.println("Employee Id :" + Emp.getEmp_id());
						System.out.println("Department :" + Emp.getDept().getDepartment_name());
						System.out.println("Manager :" + Emp.getMng().getManager_name());
						System.out.println("-------------------------------------------------------------------");
					}
				}
				break;

			case 3:

				System.out.println("Exiting the program.");
				sc.close();
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}

	

	
	}


