package domain;

public class Money implements Expression {
	
	protected int amount;
	protected String currency;
	
	public Money(int amount, String currency){
		this.amount=amount;
		this.currency=currency;
	}
	
	public boolean equals(Object other){
		Money money = (Money)other;
		return money.amount == this.amount 
				&& money.currency.equals(this.currency);
	}

	public static Money dollar(int i) {
		return new Money(i, "USD");
	}

	public static Money franc(int i) {
		return new Money(i, "CHF");
	}
	
	public Money times(int multiplier){
		return new Money(this.amount*multiplier, currency);
	}
	
	public Expression plus(Expression money){
		return new Sum(this, money);
	}
	
	public  String currency(){
		return currency;
		
	}

	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(this.currency, to);
		return new Money(amount/rate, to);
	};
}



























