/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import HogwartLibrary.Book;
import HogwartLibrary.InstanceBook;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import dao.mappers.IMapResultSetIntoEntity;
import dao.uow.IUnitOfWork;


public class InstaceBookRepository extends RepoBase<InstanceBook> implements IInstanceBookRepository{

	public InstaceBookRepository(Connection connection,

						  IMapResultSetIntoEntity mapper, IUnitOfWork uow) {

		super(connection, mapper, uow);

	}

	@Override
	protected String tableName() {

		// TODO Auto-generated method stub

		return "InstaceBook";

	}

	@Override
	protected String createTableSql() {

		// TODO Auto-generated method stub

		return "CREATE TABLE InstaceBook("

				+ "id bigint GENERATED BY DEFAULT AS IDENTITY,"
                        
                                + "idBook bigint not null,"

				+ "idUser bigint null," 

				+ "condition boolean"
                        

				+ ")  " 
                        
                                + "ALTER TABLE InstanceBook" +
                                "ADD FOREIGN KEY (idBook) " +
                                "REFERENCES Book(idBook)"
                                + "ALTER TABLE InstanceBook" +
                                "ADD FOREIGN KEY (idUser) " +
                                "REFERENCES User(id)"
                                ;
                               

	}

	@Override
	protected String insertSql() {

		// TODO Auto-generated method stub

		return "INSERT INTO InstaceBook (id, idBook, idUser, condition) VALUES (?, ?, ? ,?)";

	}

	@Override
        protected String deleteSql() {

		// TODO Auto-generated method stub

		return "DELETE FROM InstaceBook WHERE id = ?";

	}

	@Override
	protected String updateSql() {

		// TODO Auto-generated method stub

		return "UPDATE InstaceBook SET id = ?, idBook = ?, idUser = ?, condition = ?  WHERE id = ?";

	}

	@Override
	protected String selectByIdSql() {

		// TODO Auto-generated method stub

		return "SELECT * FROM InstaceBook WHERE id=?";

	}

	@Override
	protected String selectAllSql() {

		// TODO Auto-generated method stub

		return "SELECT * FROM InstaceBook";

	}

	

	@Override
        protected void setupInsert(InstanceBook entity) throws SQLException {

                insert.setInt(1, entity.getId());
                
		insert.setInt(2, entity.getIdBook());

		insert.setInt(3, entity.getIdUser());

		insert.setBoolean(4, entity.getCondition());
                
	

	}



	@Override
	protected void setupUpdate(InstanceBook entity) throws SQLException {

		 update.setInt(1, entity.getId());
                
		update.setInt(2, entity.getIdBook());

		update.setInt(3, entity.getIdUser());

		update.setBoolean(4, entity.getCondition());



	}

	public List<InstanceBook> withBook(String book) {

		// TODO Auto-generated method stub

		return null;

	}

	public List<InstanceBook> withUser(String user) {

		// TODO Auto-generated method stub

		return null;

	}

}