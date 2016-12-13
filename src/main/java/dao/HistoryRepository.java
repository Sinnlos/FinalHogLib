/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import HogwartLibrary.History;
import java.sql.Connection;
import java.sql.SQLException;
import dao.mappers.IMapResultSetIntoEntity;
import dao.uow.IUnitOfWork;
import java.util.List;

public class HistoryRepository extends RepoBase<History> implements IHistoryRepository{


	public HistoryRepository(Connection connection, IMapResultSetIntoEntity mapper, IUnitOfWork uow) {

		super(connection, mapper, uow);


	}

	

	@Override
	protected String tableName() {

		// TODO Auto-generated method stub

		return "History";

	}

	@Override
	protected String createTableSql() {

		// TODO Auto-generated method stub

		return "CREATE TABLE History("

				+ "id bigint GENERATED BY DEFAULT AS IDENTITY,"

				+ "hire boolean,"
                        
                                + "tooLongHire boolean,"
                        
                                + "reservation boolean,"
                        
                                + "punishment int"

				+ ")";

	}

	@Override
	protected String insertSql() {

		// TODO Auto-generated method stub

		return "INSERT INTO History (id, hire, tooLongHire, reservation, punishment) VALUES (?, ?, ?, ?, ?)";

	}

	@Override
        protected String deleteSql() {

		// TODO Auto-generated method stub

		return "DELETE FROM History WHERE id = ?";

	}

	@Override
	protected String updateSql() {

		// TODO Auto-generated method stub

		return "UPDATE History SET id = ?, hire = ?, tooLongHire = ?, reservation = ?, punishment = ? WHERE id = ?";

	}

	@Override
	protected String selectByIdSql() {

		// TODO Auto-generated method stub

		return "SELECT * FROM History WHERE id=?";

	}

	@Override
	protected String selectAllSql() {

		// TODO Auto-generated method stub

		return "SELECT * FROM History";

	}

	

	@Override
        protected void setupInsert(History entity) throws SQLException {

		insert.setInt(1, entity.getId());

		insert.setBoolean(2, entity.getHire());
                
                insert.setBoolean(3, entity.getTooLongHire());
                
                insert.setBoolean(4, entity.getReservation());
                
                insert.setInt(5, entity.getPunishment());

		

	}



	@Override
	protected void setupUpdate(History entity) throws SQLException {

		update.setInt(1, entity.getId());
                

		update.setBoolean(2, entity.getHire());

                update.setBoolean(3, entity.getTooLongHire());
                
                update.setBoolean(4, entity.getReservation());
                
                update.setInt(5, entity.getPunishment());

                update.setInt(6, entity.getId());

	}


	public List<History> withUser(String user) {

		// TODO Auto-generated method stub

		return null;

	}

	public List<History> withBook(String book) {

		// TODO Auto-generated method stub

		return null;

	}

}
