package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.Account;

public class AccountMapper implements IMapResultSetIntoEntity<Account>{

	public Account map(ResultSet rs) throws SQLException {
		Account p = new Account();
		p.setId(rs.getInt("id"));
		p.setPersonId(rs.getInt("personid"));
		p.setAmount(rs.getDouble("amount"));
		p.setCurrency(rs.getString("currency"));
		
		return p;
	}

}