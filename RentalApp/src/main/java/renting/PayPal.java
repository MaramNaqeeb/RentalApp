package renting;

class PayPal implements PaymentMethod {
	private double moneyAmount;
	private String email;

	public PayPal(String email) {
		this.email = email;
	}

	@Override

	public double getAmount() { // I use the getAmount() method to get the money amount after setting it to the
								// new value in the pay() method

		return moneyAmount;

	}

	@Override
	public void pay(double moneyAmount) {
		this.moneyAmount = moneyAmount;
	}

}
