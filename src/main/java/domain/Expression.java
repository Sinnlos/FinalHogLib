package domain;

public interface Expression {

	Money reduce(Bank bank,String currency);

}
