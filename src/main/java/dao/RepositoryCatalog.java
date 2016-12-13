package dao;

import java.sql.Connection;
import java.sql.SQLException;

import dao.mappers.InstanceBookMapper;
import dao.mappers.AuthorMapper;
import dao.mappers.HistoryMapper;
import dao.mappers.UserMapper;
import dao.mappers.BookMapper;
import dao.uow.IUnitOfWork;

public class RepositoryCatalog implements IRepositoryCatalog{

	IUnitOfWork uow;
	Connection connection;
	
	
	public RepositoryCatalog(IUnitOfWork uow, Connection connection) {
		super();
		this.uow = uow;
		this.connection = connection;
	}

	
	public IUserRepository users() {
		return new UserRepository(connection, new UserMapper(), uow);
	}

	public IAuthorRepository authors() {
		return new AuthorRepository(connection, new AuthorMapper(), uow);
	}

	public IHistoryRepository histories() {
		return new HistoryRepository(connection, new HistoryMapper(), uow);
	}

        public IBookRepository books() {

                 return new BookRepository(connection, new BookMapper(), uow);

    }
        
        public IInstanceBookRepository instancebooks() {

                 return new InstaceBookRepository(connection, new InstanceBookMapper(), uow);

    }

	public void saveAndClose() {
		try{
		uow.commit();
		connection.close();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		
	}

}
