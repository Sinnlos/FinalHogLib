package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.IRepository;
import domain.model.Account;
import domain.model.Person;

public class AccountMapper implements IMapResultSetIntoEntity<Account>{

	IRepository<Person> personRepo;
	
	
	
	public IRepository<Person> getPersonRepo() {
		return personRepo;
	}



	public void setPersonRepo(IRepository<Person> personRepo) {
		this.personRepo = personRepo;
	}



	public Account map(ResultSet rs) throws SQLException {
		Account account = new Account();
		account.setId(rs.getInt("id"));
		account.setPersonId(rs.getInt("personid"));
		account.setAmount(rs.getDouble("amount"));
		account.setCurrency(rs.getString("currency"));
		if(personRepo!=null)
		account.setPerson(this.personRepo.get(account.getPersonId()));
		
		return account;
	}

}