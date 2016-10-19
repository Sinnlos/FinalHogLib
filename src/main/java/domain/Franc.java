package domain;

public class Franc extends Money {

	public Franc(int amount, String currency) {
		this.amount=amount;
		this.currency=currency;
	}

	public Franc times(int multiplier) {
		return new Franc(this.amount*multiplier, this.currency);
	}

	
	

}
