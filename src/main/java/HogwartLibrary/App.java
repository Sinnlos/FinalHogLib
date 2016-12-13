package HogwartLibrary;
import java.sql.*;

import dao.IRepositoryCatalog;
import dao.RepositoryCatalog;

import dao.uow.UnitOfWork;


//import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	String url = "jdbc:hsqldb:hsql://localhost/workdb";
     
        
    	try {
			Connection connection = DriverManager.getConnection(url, "SA", "" );
			IRepositoryCatalog catalog = new RepositoryCatalog(new UnitOfWork(connection), connection);
			
                          Author author1 = new Author();
                       

                        author1.setId(1);
                        author1.setName("Bathilda");
                        author1.setSurname("Bagshot");
                        
                        catalog.authors().add(author1);
                        
                        Author author2 = new Author();
                        Author author3 = new Author();
                        Author author4 = new Author();
                        Author author5 = new Author();
                        Author author6 = new Author();
                        Author author7 = new Author();
                        Author author8 = new Author();
                        Author author9 = new Author();
                        
                        
                        author2.setId(2);
                        author2.setName("Miranda");
                        author2.setSurname("Goshawk");
                        
                        author3.setId(3);
                        author3.setName("Eduardo");
                        author3.setSurname("Limus");
                        
                        author4.setId(4);
                        author4.setName("Phyllida");
                        author4.setSurname("Spore");
                        
                        author5.setId(5);
                        author5.setName("Arsenius");
                        author5.setSurname("Budge");
                        
                        author6.setId(6);
                        author6.setName("Quentin");
                        author6.setSurname("Trimble");
                        
                        author7.setId(7);
                        author7.setName("Vindictus");
                        author7.setSurname("Viridian");
                        
                        author8.setId(8);
                        author8.setName("Cassandra");
                        author8.setSurname("Vablatsky");
                        
                        author9.setId(9);
                        author9.setName("Inigo");
                        author9.setSurname("Imago");

                        
                        
                        catalog.authors().add(author2);
                        catalog.authors().add(author3);
                        catalog.authors().add(author4);
                        catalog.authors().add(author5);
                        catalog.authors().add(author6);
                        catalog.authors().add(author7);
                        catalog.authors().add(author8);
                        catalog.authors().add(author9);
                        
			Book book1 = new Book();
                        Book book2 = new Book();
                        Book book3 = new Book();
                        Book book4 = new Book();
                        Book book5 = new Book();
                        Book book6 = new Book();
                        Book book7 = new Book();
                        Book book8 = new Book();
                        Book book9 = new Book();

			book1.setISBN("9782452657412");
			book1.setTitle("A History of Magic");
                        book1.setIdBook(1);
                        book1.setAvailability(true);
                        book1.setSection("History");
                        book1.setAuthor(author6);
                       
                        book2.setISBN("9786255282050");
			book2.setTitle("Olde and Forgotten Bewitchments and Charmes");
                        book2.setIdBook(2);
                        book2.setAvailability(false);
                        book2.setSection("History");
			 book2.setAuthor(author1);
                         
                        book3.setISBN("9786297785837");
			book3.setTitle("A Beginner's Guide to Transfiguration");
                        book3.setIdBook(3);
                        book3.setAvailability(false);
                        book3.setSection("Transfiguration");
			 book3.setAuthor(author5);
                         
                        book4.setISBN("9782014505860");
			book4.setTitle("One Thousand Magical Herbs and Fungi");
                        book4.setIdBook(4);
                        book4.setAvailability(false);
                        book4.setSection("Herbology");
			 book4.setAuthor(author7);
                         
                        book5.setISBN("1154646434687");
			book5.setTitle("Advanced Potion-Making");
                        book5.setIdBook(5);
                        book5.setAvailability(true);
                        book5.setSection("Potions");
			 book5.setAuthor(author1);
                         
                        book6.setISBN("9786903566572");
			book6.setTitle("The Essential Defence Against the Dark Arts");
                        book6.setIdBook(6);
                        book6.setAvailability(false);
                        book6.setSection("Defensive/Offensive Spells");
                         book6.setAuthor(author1);
                        
			book7.setISBN("9782011848269");
			book7.setTitle("Book of Spells");
                        book7.setIdBook(7);
                        book7.setAvailability(false);
                        book7.setSection("Restricted Section");
			 book7.setAuthor(author6);
                         
                        book8.setISBN("9782011125896");
			book8.setTitle("Most Potente Potions");
                        book8.setIdBook(8);
                        book8.setAvailability(true);
                        book8.setSection("Restricted Section");
			 book8.setAuthor(author2);
                         
                        book9.setISBN("9783820052783");
			book9.setTitle("Protection Charm Your Mind: A Practical Guide to Counter Legilimens");
                        book9.setIdBook(9);
                        book9.setAvailability(true);
                        book9.setSection("Defensive/Offensive Spells");
			 book9.setAuthor(author3);
                        
			catalog.books().add(book1);
                        catalog.books().add(book2);
                        catalog.books().add(book3);
                        catalog.books().add(book4);
                        catalog.books().add(book5);
                        catalog.books().add(book6);
                        catalog.books().add(book7);
                        catalog.books().add(book8);
                        catalog.books().add(book9);
                        
                        
                       User user1 = new User();
                       
 
                        user1.setId(1);
                        user1.setLogin("ClaudiaRingroyal");
                        user1.setPassword("ClaudiaR12");
                        user1.setName("Claudia");
                        user1.setSurname("Ringroyal");
                        user1.setHouse("Slytherin");
                        user1.setStatus("student");
                        
                        catalog.users().add(user1);
                        
                        
                      User user2 = new User();
                        User user3 = new User();
                        User user4 = new User();
                        User user5 = new User();
                        User user6 = new User();
                        User user7 = new User();
                        User user8 = new User();
                        User user9 = new User();
                        
                        
                        user2.setId(2);
                        user2.setLogin("HarryPotter");
                        user2.setPassword("Potter35");
                        user2.setName("Harry");
                        user2.setSurname("Potter");
                        user2.setHouse("Gryffindor");
                        user2.setStatus("student");
                        
                        user3.setId(3);
                        user3.setLogin("HermioneGranger");
                        user3.setPassword("Granger12");
                        user3.setName("Hermione");
                        user3.setSurname("Granger");
                        user3.setHouse("Gryffindor");
                        user3.setStatus("student");
                        
                        user4.setId(4);
                        user4.setLogin("CedrikDiggory");
                        user4.setPassword("Diggory7");
                        user4.setName("Cedrik");
                        user4.setSurname("Diggory");
                        user4.setHouse("Hufflepuff");
                        user4.setStatus("student");
                        
                        user5.setId(5);
                        user5.setLogin("DracoMalfoy");
                        user5.setPassword("MalfoySlitherin3");
                        user5.setName("Draco");
                        user5.setSurname("Malfoy");
                        user5.setHouse("Slytherin");
                        user5.setStatus("student");
                        
                        user6.setId(6);
                        user6.setLogin("SeverusSnape");
                        user6.setPassword("SevSnape10");
                        user6.setName("Severus");
                        user6.setSurname("Snape");
                        user6.setHouse("Slytherin");
                        user6.setStatus("teacher");
                        
                        user7.setId(7);
                        user7.setLogin("BlaiseZabini");
                        user7.setPassword("Zabini89");
                        user7.setName("Blaise");
                        user7.setSurname("Zabini");
                        user7.setHouse("Slytherin");
                        user7.setStatus("student");
                        
                        user8.setId(8);
                        user8.setLogin("IrmaPince");
                        user8.setPassword("IrmaPince142");
                        user8.setName("Irma");
                        user8.setSurname("Pince");
                        user8.setHouse("Ravenclaw");
                        user8.setStatus("librarian");
                        
                        user9.setId(9);
                        user9.setLogin("LunaLovegood");
                        user9.setPassword("LoveLuna");
                        user9.setName("Luna");
                        user9.setSurname("Lovegood");
                        user9.setHouse("Ravenclaw");
                        user9.setStatus("student");
                        

                       
                        catalog.users().add(user2);
                        catalog.users().add(user3);
                        catalog.users().add(user4);
                        catalog.users().add(user5);
                        catalog.users().add(user6);
                        catalog.users().add(user7);
                        catalog.users().add(user8);
                        catalog.users().add(user9);
                        
                        
                       History history1 = new History();
                      
                        
                        history1.setId(1);
                        history1.setHire(false);
                        history1.setTooLongHire(false);
                        history1.setReservation(true);
                        history1.setPunishment(0);
                        
                        
                        
                        catalog.histories().add(history1);
                        
                        
                        History history2 = new History();
                        History history3 = new History();
                        History history4 = new History();
                        History history5 = new History();
                        History history6 = new History();
                        History history7 = new History();
                        History history8 = new History();
                        History history9 = new History();
                        
                        
                        history2.setId(2);
                        history2.setHire(true);
                        history2.setPunishment(2);
                        history2.setReservation(false);
                        history2.setTooLongHire(true);
                        
                        history3.setId(3);
                        history3.setHire(false);
                        history3.setPunishment(14);
                        history3.setReservation(true);
                        history3.setTooLongHire(false);
                        
                        history4.setId(4);
                        history4.setHire(true);
                        history4.setPunishment(0);
                        history4.setReservation(true);
                        history4.setTooLongHire(false);
                        
                        history5.setId(5);
                        history5.setHire(true);
                        history5.setPunishment(20);
                        history5.setReservation(false);
                        history5.setTooLongHire(false);
                        
                        history6.setId(6);
                        history6.setHire(true);
                        history6.setPunishment(1);
                        history6.setReservation(true);
                        history6.setTooLongHire(true);
                        
                        history7.setId(7);
                        history7.setHire(false);
                        history7.setPunishment(3);
                        history7.setReservation(true);
                        history7.setTooLongHire(false);
                        
                        history8.setId(8);
                        history8.setHire(false);
                        history8.setPunishment(4);
                        history8.setReservation(true);
                        history8.setTooLongHire(false);
                        
                        history9.setId(9);
                        history9.setHire(true);
                        history9.setPunishment(7);
                        history9.setReservation(false);
                        history9.setTooLongHire(true);
                        
                        
                       
                        catalog.histories().add(history2);
                        catalog.histories().add(history3);
                        catalog.histories().add(history4);
                        catalog.histories().add(history5);
                        catalog.histories().add(history6);
                        catalog.histories().add(history7);
                        catalog.histories().add(history8);
                        catalog.histories().add(history9);
                        
                        
                      InstanceBook instanceBook1 = new InstanceBook();
                      
                      instanceBook1.setId(1);
                      instanceBook1.setIdBook(book4.getIdBook());
                      instanceBook1.setIdUser(0);
                      instanceBook1.setCondition(true);
                      
                      catalog.instancebooks().add(instanceBook1);
                        

			//List<Book> janki = catalog.books().withAuthor("janek");
			
	        System.out.println( "changes saved" );
			
	        catalog.saveAndClose();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
        System.out.println( "Koniec" );
        
    }
}
