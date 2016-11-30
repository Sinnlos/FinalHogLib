package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import dao.AccountRepository;
import dao.EnumDictionaryRepository;
import dao.IRepositoryCatalog;
import dao.PersonRepository;
import dao.HistoryLogRepository;
import dao.RepositoryCatalog;
import dao.mappers.AccountMapper;
import dao.mappers.EnumDirectoryMapper;
import dao.mappers.HistoryLogMapper;
import dao.mappers.IMapResultSetIntoEntity;
import dao.mappers.PersonMapper;
import dao.uow.UnitOfWork;
import domain.model.Account;
import domain.model.EnumDictionary;
import domain.model.HistoryLog;
import domain.model.Person;

public class App 
{
    public static void main( String[] args )
    {
    	String url = "jdbc:hsqldb:hsql://localhost/workdb";
    	try {
			Connection connection = DriverManager.getConnection(url);
			IRepositoryCatalog catalog = new RepositoryCatalog(new UnitOfWork(connection), connection);
			
			Person janek = new Person();
			janek.setName("Jan");
			janek.setSurname("Kowalski");
			
			catalog.people().add(janek);
			
			List<Person> janki = catalog.people().withName("janek");
			
	        System.out.println( "zapisuje janka" );
			
	        catalog.saveAndClose();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
        System.out.println( "Koniec" );
        
    }
}
