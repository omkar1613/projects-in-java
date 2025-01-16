package Client;

import java.util.Scanner;

import Controller.CreditCardPayment;
import Controller.DebitCardPayment;
import Controller.Payment;
import Controller.UPIPayment;



public class MainApp {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Payment Payment=null;
	
	
	
	while(true) {
		System.out.println("Menu");
	    System.out.println("___________________________________________________________________________");
		System.out.println("\t 1 : Pay Using Credit Card ");
		System.out.println("\t 2 : Pay Using Debit Card ");
		System.out.println("\t 3 : Pay Using UPI  ");
		System.out.println("\t 4 : Exit ");
	    System.out.println("___________________________________________________________________________");
	    
	    System.out.println("Enter Your Choice :");
	    int choice=sc.nextInt();
	    
	    switch(choice) {
	    
	    case 1 :
	    	try {
	    	System.out.println("___________________________________________________________________________");
	    	System.out.println("----Welcome to Credit Card Payment---- ");
	    	Payment=new CreditCardPayment();
	    	System.out.println("Enter Your Amount :");
	    	double ammount=sc.nextInt();
	    	
	    	if(ammount<0) {
	    		throw new NegativeInputException();
	    	}else {
	    		
	    		Payment.processPayment(ammount);
	    	}
	    	}catch (NegativeInputException e) {
	 
	    	e.printStackTrace();
				
	    	}
	    	
	    	break;
	    	
	    	
	    case 2:
	    	try {
	    	System.out.println("----Welcome to Debit Card Payment---- ");
	    	Payment=new DebitCardPayment();
	    	System.out.println("Enter Your Amount :");
	    	double ammount1=sc.nextInt();
	    	
	    	if(ammount1<0) {
	    		throw new NegativeInputException();
	    	}
	    	
	    	else {
	    		Payment.processPayment(ammount1);
	    		
	    	}
	    	}
	    	catch (NegativeInputException e) {
	    		e.printStackTrace();
				// TODO: handle exception
			}
	    	
	    	break;
	    	
	    case 3:
	    	try {
	    	System.out.println("----Welcome to UPI Payment---- ");
	    	Payment=new UPIPayment();
	    	System.out.println("Enter Your Amount :");
	    	double ammount2=sc.nextInt();
	    	if(ammount2<0) {
	    	throw new NegativeInputException();
	    	}
	    	else
	    {
		    	Payment.processPayment(ammount2);

	    	}
	    		
	    	}
	    	catch (NegativeInputException e) {
				e.printStackTrace();
			}
	    	break;
	    	
	    case 4:
	    	System.out.println("Thanx For using App");
	    	System.exit(0);
	    
	    
	    
	    }
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
}