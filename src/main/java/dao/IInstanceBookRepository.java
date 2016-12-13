/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import HogwartLibrary.InstanceBook;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface IInstanceBookRepository extends IRepository<InstanceBook> {
    
     public List<InstanceBook> withBook(String book);
    public List<InstanceBook> withUser(String usery);
    
}
