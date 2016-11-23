package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class RepositoryBase {


	protected Connection connection;

	protected Statement createTable;

	protected PreparedStatement insert;
	protected PreparedStatement delete;
	protected PreparedStatement update;
	protected PreparedStatement selectById;
	protected PreparedStatement selectAll;
	

	protected RepositoryBase(Connection connection) {
		this.connection = connection;
		
		try {
			createTable = connection.createStatement();
			createTableIfNotExists();
			insert = connection.prepareStatement(insertSql());
			delete = connection.prepareStatement(deleteSql());	
			update = connection.prepareStatement(updateSql());
			selectById = connection.prepareStatement(selectByIdSql());
			selectAll = connection.prepareStatement(selectAllSql());
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void createTableIfNotExists()
			throws SQLException {
		boolean tableExists = false;
		ResultSet rs = connection.getMetaData().getTables(null, null, null, null);
		while(rs.next()){
			if(rs.getString("TABLE_NAME").equalsIgnoreCase(tableName())){
				tableExists=true;
				break;
			}
		}
		if(!tableExists)
			createTable.executeUpdate(createTableSql());
	}

	protected abstract String tableName();
	protected abstract String createTableSql();
	protected abstract String insertSql();
	protected abstract String deleteSql();
	protected abstract String updateSql();
	protected abstract String selectByIdSql();
	protected abstract String selectAllSql();
}
