/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HogwartLibrary;

import java.util.List;



public class Book implements IHaveId{

    int id;
    int idBook;
    int idHistory;
    String ISBN;
    String title;
    String section;
    boolean availability;
    private Author author;
    
    
    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdBook() {
        return idBook;
    }
    
    public int getIdHistory() {
        return idHistory;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setIdHistory(int idHistory) {
        this.idHistory = idHistory;
    }
    
    
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
  

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getSection() {
        return section;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
