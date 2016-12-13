/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

import HogwartLibrary.Book;
/**
 * Created by Lenovo on 12.12.2016.
 */
public interface IBookRepository extends IRepository<Book> {

    public List<Book> withAuthor(String author);
    public List<Book> withHistory(String history);
}
