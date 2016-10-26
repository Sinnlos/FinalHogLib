package domain;

public interface Expression {

	Money reduce(Bank bank,String currency);
	Expression plus(Expression money);

}
