package dao;

import java.sql.Connection;
import java.sql.SQLException;

import dao.mappers.AccountMapper;
import domain.model.Account;
import domain.model.Person;

public class AccountRepository extends RepositoryBase<Account> {
	
	public AccountRepository(Connection connection, 
			AccountMapper mapper,
			IRepository<Person> personRepo) {
		super(connection, mapper);
		mapper.setPersonRepo(personRepo);	
	}
	
	@Override
	protected String tableName() {
		// TODO Auto-generated method stub
		return "account";
	}
	@Override
	protected String createTableSql() {
		// TODO Auto-generated method stub
		return "CREATE TABLE account("
				+ "id bigint GENERATED BY DEFAULT AS IDENTITY,"
				+ "person_id INT,"
				+ "amount DECIMAL," 
				+ "currency VARCHAR(20),"
				+ ")";
	}
	@Override
	protected String insertSql() {
		// TODO Auto-generated method stub
		return "INSERT INTO account(person_id, amount, currency) VALUES (?, ?, ?)";
	}
	@Override
	protected String deleteSql() {
		// TODO Auto-generated method stub
		return "DELETE FROM account WHERE ID = ?";
	}
	@Override
	protected String updateSql() {
		// TODO Auto-generated method stub
		return "UPDATE account SET person_id = ?, amount = ?, currency = ? WHERE ID = ?";
	}
	@Override
	protected String selectByIdSql() {
		// TODO Auto-generated method stub
		return "SELECT * FROM account WHERE id=?";
	}
	@Override
	protected String selectAllSql() {
		// TODO Auto-generated method stub
		return "SELECT * FROM account";
	}
	
	@Override
	protected void setupInsert(Account entity) throws SQLException {
		insert.setDouble(1, entity.getAmount());
		insert.setString(2, entity.getCurrency());
		update.setInt(3, entity.getPersonId());
		
	}

	@Override
	protected void setupUpdate(Account entity) throws SQLException {
		update.setDouble(1, entity.getAmount());
		update.setString(2, entity.getCurrency());
		update.setInt(3, entity.getPersonId());

}
}
