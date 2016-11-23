package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.AccountRepository;
import dao.EnumDictionaryRepository;
import dao.PersonRepository;
import dao.HistoryLogRepository;
import dao.mappers.AccountMapper;
import dao.mappers.EnumDirectoryMapper;
import dao.mappers.HistoryLogMapper;
import dao.mappers.IMapResultSetIntoEntity;
import dao.mappers.PersonMapper;
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
			IMapResultSetIntoEntity<Person> personMapper = new PersonMapper();
			IMapResultSetIntoEntity<HistoryLog> historyMapper = new HistoryLogMapper();
			IMapResultSetIntoEntity<EnumDictionary> enumsMapper = new EnumDirectoryMapper();
			IMapResultSetIntoEntity<Account> accountMapper = new AccountMapper();
			
			PersonRepository repo = new PersonRepository(connection, personMapper);
			HistoryLogRepository repo1 = new HistoryLogRepository(connection, historyMapper);
			AccountRepository accountRepo = new AccountRepository(connection,accountMapper);
			EnumDictionaryRepository enumRepo = new EnumDictionaryRepository(connection,enumsMapper);
			
			Person janek = new Person();
			janek.setName("Jan");
			janek.setSurname("Kowalski");

	        System.out.println( "zapisuje janka" );
			repo.add(janek);
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
        System.out.println( "Koniec" );
        
    }
}
