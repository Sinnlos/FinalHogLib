package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.model.Account;
import domain.model.Person;

public class AccountRepository extends RepositoryBase {
	
public AccountRepository(Connection connection) {
	super(connection);
}

		
	public Account get(int accountId){
		try{
			
			selectById.setInt(1, accountId);
			ResultSet rs = selectById.executeQuery();
			while(rs.next()){
				Account result = new Account();
				result.setId(rs.getInt("id"));
				result.setPersonId(rs.getInt("person_id"));
				result.setAmount(rs.getDouble("amount"));
				result.setCurrency(rs.getString("currency"));
				return result;
			}
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		return null;
	}

	public List<Account> getAll(){
		try{
			List<Account> result = new ArrayList<Account>();
			ResultSet rs = selectAll.executeQuery();
			while(rs.next()){
				Account a = new Account();
				a.setId(rs.getInt("id"));
				a.setPersonId(rs.getInt("person_id"));
				a.setAmount(rs.getDouble("amount"));
				a.setCurrency(rs.getString("currency"));
				result.add(a);
			}
			return result;
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		return null;
	}
	
	public void delete(Account a){
		try{
			delete.setInt(1, a.getId());
			delete.executeUpdate();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
	
	public void add(Account a){
		try{
			insert.setString(1, a.getCurrency());
			insert.setDouble(2, a.getAmount());
			insert.setInt(3, a.getPersonId());
			insert.executeUpdate();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
	
	public void update(Account a){
		try{
			update.setString(1, a.getCurrency());
			update.setDouble(2, a.getAmount());
			update.setInt(3, a.getPersonId());
			update.executeUpdate();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
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
	
}
