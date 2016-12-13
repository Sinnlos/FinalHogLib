/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException; 
import HogwartLibrary.Author;
import java.util.List;
import dao.mappers.IMapResultSetIntoEntity;
import dao.uow.IUnitOfWork;

public class AuthorRepository extends RepoBase<Author> implements IAuthorRepository {

	public AuthorRepository(Connection connection, 

			IMapResultSetIntoEntity mapper, IUnitOfWork uow) {

		super(connection, mapper, uow);
	

	}

	

	@Override
	protected String tableName() {

		// TODO Auto-generated method stub

		return "Author";

	}

	@Override
	protected String createTableSql() {

		// TODO Auto-generated method stub

		return "CREATE TABLE Author("

				+ "id bigint GENERATED BY DEFAULT AS IDENTITY,"

				+ "name VARCHAR(20)," 

				+ "surname VARCHAR(20),"

				+ ")";

	}

	@Override
	protected String insertSql() {

		// TODO Auto-generated method stub

		return "INSERT INTO Author (id, name, surname) VALUES (?, ?, ?)";

	}

	@Override
        protected String deleteSql() {

		// TODO Auto-generated method stub

		return "DELETE FROM Author WHERE id = ?";

	}

	@Override
	protected String updateSql() {

		// TODO Auto-generated method stub

		return "UPDATE Author SET id = ?, name = ?, surname = ? WHERE id = ?";

	}

	@Override
	protected String selectByIdSql() {

		// TODO Auto-generated method stub

		return "SELECT * FROM Author WHERE id=?";

	}

	@Override
	protected String selectAllSql() {

		// TODO Auto-generated method stub

		return "SELECT * FROM Author";

	}

	

	@Override
        protected void setupInsert(Author entity) throws SQLException {

		insert.setInt(1, entity.getId());

		insert.setString(2, entity.getName());

		insert.setString(3, entity.getSurname());

		

	}



	@Override
	protected void setupUpdate(Author entity) throws SQLException {

		update.setDouble(1, entity.getId());

		update.setString(2, entity.getName());

		update.setString(3, entity.getSurname());



	}


	public List<Author> withBook(String book) {

		// TODO Auto-generated method stub

		return null;

	}

}