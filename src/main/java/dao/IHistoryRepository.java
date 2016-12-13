/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import HogwartLibrary.History;

import java.util.List;

/**
 * Created by Lenovo on 12.12.2016.
 */
public interface IHistoryRepository extends IRepository<History>{

    public List<History> withUser(String user);
    public List<History> withBook(String book);
}
