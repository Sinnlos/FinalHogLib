package dao;


import java.util.List;
import HogwartLibrary.Author;
/**
 * Created by Lenovo on 12.12.2016.
 */
public interface IAuthorRepository extends IRepository<Author> {

    public List<Author> withBook(String book);
}


