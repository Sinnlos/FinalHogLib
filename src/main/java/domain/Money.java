package domain;

public abstract class Money {
	
	protected int amount;
	public String currency;
	public boolean equals(Object other){
		Money money = (Money)other;
		return money.amount == this.amount 
				&& getClass().equals(other.getClass());
	}

	public static Money dollar(int i) {
		return new Dollar(i, "USD");
	}

	public static Money franc(int i) {
		return new Franc(i, "CHF");
	}
	
	public abstract Money times(int multiplier);
	
	public  String currency(){
		return currency;
		
	};
}
