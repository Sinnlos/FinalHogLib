package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.AccountRepository;
import dao.EnumDictionaryRepository;
import dao.PersonRepository;
import dao.HistoryLogRepository;
import domain.model.Person;

public class App 
{
    public static void main( String[] args )
    {
    	String url = "jdbc:hsqldb:hsql://localhost/workdb";
    	try {
			Connection connection = DriverManager.getConnection(url);
			PersonRepository repo = new PersonRepository(connection);
			HistoryLogRepository repo1 = new HistoryLogRepository(connection);
			AccountRepository accountRepo = new AccountRepository(connection);
			//EnumDictionaryRepository enumRepo = new EnumDictionaryRepository(connection);
			
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
