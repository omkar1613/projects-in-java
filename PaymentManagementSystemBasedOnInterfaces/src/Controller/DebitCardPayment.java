package Controller;

public class DebitCardPayment implements Payment {

	@Override
	public void processPayment(double amount) {
		System.out.println(amount+"  This much amount has been processed successful by using Debit Card");
		
		// TODO Auto-generated method stub
		
	}

}
