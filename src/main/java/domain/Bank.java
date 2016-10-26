package domain;

import java.util.Hashtable;


public class Bank {
	
	Hashtable rates = new Hashtable();

	public Money reduce(Expression expression, String currency) {
		
		return expression.reduce(this, currency);
		
	}

	public void addRate(String currencyFrom, String currencyTo, int rate) {
		rates.put(new Pair(currencyFrom,currencyTo),new Integer(rate));
	}

	public int rate(String currency, String to) {
		
		return 0;
	}

	
}

class Pair {
	public String currencyFrom;
	public String currencyTo;
	
	Pair(String currencyFrom, String currencyTo){
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
	}
	
	public boolean equals(Object other){
		if(other instanceof Pair){
			Pair pair = (Pair)other;
			if(pair == this){
				return true;
			}
			else{
				if( (pair.currencyFrom == this.currencyFrom)
						&& (pair.currencyTo == this.currencyTo) )
					return true;
			}
		}
		return false;
	}
	
	public int hashCode(){
		return 0;
	}
	
}
