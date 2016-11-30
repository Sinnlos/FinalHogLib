package dao;

import java.util.List;

import domain.model.Account;
import domain.model.Person;

public interface IAccountRepository extends IRepository<Account>{
	public List<Account> byPerson(Person person);
}
