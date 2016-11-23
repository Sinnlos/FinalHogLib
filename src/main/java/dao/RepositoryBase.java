package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import domain.model.IHaveId;
import domain.model.Person;

public abstract class RepositoryBase<TEntity extends IHaveId> {


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


	public void add(TEntity entity){
		try{
			setupInsert(entity);
			insert.executeUpdate();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		
	}
	public void update(TEntity entity){
		try{
			setupUpdate(entity);
			update.executeUpdate();
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		
	}

	public void delete(TEntity entity){
		try{
			delete.setInt(1, entity.getId());
			delete.executeUpdate();
		}catch(SQLException ex){
			ex.printStackTrace();
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
	

	protected abstract void setupInsert(TEntity entity) throws SQLException;
	protected abstract void setupUpdate(TEntity entity) throws SQLException;
	protected abstract String tableName();
	protected abstract String createTableSql();
	protected abstract String insertSql();
	protected abstract String deleteSql();
	protected abstract String updateSql();
	protected abstract String selectByIdSql();
	protected abstract String selectAllSql();
}
