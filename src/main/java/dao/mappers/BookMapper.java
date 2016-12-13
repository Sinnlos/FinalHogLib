/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mappers;


import java.sql.ResultSet;
import java.sql.SQLException;

import HogwartLibrary.Book;


    public class BookMapper implements IMapResultSetIntoEntity<Book>{


	public Book map(ResultSet rs) throws SQLException {

	Book book = new Book();

        book.setIdBook(rs.getInt("ID_Book"));

        book.setISBN(rs.getString("ISBN"));

        book.setTitle(rs.getString("Title"));

        book.setSection(rs.getString("Section"));

        book.setAvailability(rs.getBoolean("Availability"));

               
                return book;

        }



}