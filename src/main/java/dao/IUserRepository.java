/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import HogwartLibrary.User;

import java.util.List;

/**
 * Created by Lenovo on 12.12.2016.
 */
public interface IUserRepository extends IRepository<User>{

    public List<User> withHistory(String history);
}
