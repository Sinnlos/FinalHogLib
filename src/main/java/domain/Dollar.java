package domain;

public class Dollar extends Money{

	public Dollar(int amount, String currency) {
		this.amount = amount;
		this.currency=currency;
	}

	public Dollar times(int multiplier) {
		Dollar product = new Dollar(amount * multiplier, currency);
		return product;
		
	}

}
