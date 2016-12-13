/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mappers;


import java.sql.ResultSet;
import java.sql.SQLException;
import HogwartLibrary.User;

/**
 *
 * @author Lenovo
 */

public class UserMapper implements IMapResultSetIntoEntity<User>{


	public User map(ResultSet rs) throws SQLException {

		User user = new User();

		user.setIdUser(rs.getInt("ID_User"));

		user.setLogin(rs.getString("Login"));

		user.setPassword(rs.getString("Password"));
                
                user.setName(rs.getString("Name"));
                
                user.setSurname(rs.getString("Surname"));
                
                user.setStatus(rs.getString("Status"));
                
                user.setHouse(rs.getString("House"));

               
                return user;

        }



}
