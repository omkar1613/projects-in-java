package Controller;

public class CreditCardPayment implements Payment {

	@Override
	public void processPayment(double amount) {
		System.out.println(amount+ "  This much amount has been processed successful by using Credit Card");
		
		
	}

}
