package domain;

public class Bank {

	public Money reduce(Expression expression, String currency) {
		
		return expression.reduce(currency);
		
	}

	public void addRate(String currencyFrom, String currencyTo, int rate) {
		// TODO Auto-generated method stub
		
	}

}
