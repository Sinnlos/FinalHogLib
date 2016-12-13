/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mappers;
import java.sql.ResultSet;
import java.sql.SQLException;

import HogwartLibrary.InstanceBook;
public class InstanceBookMapper implements IMapResultSetIntoEntity<InstanceBook>{
    
    
    
	public InstanceBook map(ResultSet rs) throws SQLException {

	InstanceBook instanceBook = new InstanceBook();

        instanceBook.setId(rs.getInt("ID"));

        instanceBook.setIdBook(rs.getInt("IdBook"));

        instanceBook.setIdUser(rs.getInt("IdUser"));

        instanceBook.setCondition(rs.getBoolean("Condition"));

           
                return instanceBook;

        }


}
