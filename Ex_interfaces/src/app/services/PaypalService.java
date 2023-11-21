package app.services;

import app.interfaces.OnlineInterfacePayment;

public class PaypalService implements OnlineInterfacePayment{

	@Override
	public double paymentFee(double amount) {
		// TODO Auto-generated method stub
		return amount * 0.02;
	}

	@Override
	public double interest(double amount, int months) {
		// TODO Auto-generated method stub
		return amount * 0.01 * months;
	}

}
