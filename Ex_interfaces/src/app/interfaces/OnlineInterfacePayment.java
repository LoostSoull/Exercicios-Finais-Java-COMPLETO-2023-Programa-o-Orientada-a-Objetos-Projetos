package app.interfaces;

public interface OnlineInterfacePayment {

	public double paymentFee(double amount);
	public double interest(double amount, int months);
}
