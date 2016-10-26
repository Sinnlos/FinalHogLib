package domain;

import java.util.Hashtable;

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

public class Bank {
	
	Hashtable currencyRateTable = new Hashtable();

	public Money reduce(Expression expression, String currency) {
		
		return expression.reduce(currency);
		
	}

	public void addRate(String currencyFrom, String currencyTo, int rate) {
		
		currencyRateTable.put(new Pair(currencyFrom,currencyTo), rate);
		
	}

}
