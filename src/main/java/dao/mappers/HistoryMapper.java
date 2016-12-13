/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import HogwartLibrary.History;



    public class HistoryMapper implements IMapResultSetIntoEntity<History>{


	public History map(ResultSet rs) throws SQLException {

		History history = new History();

		history.setId(rs.getInt("ID_History"));

		history.setHire(rs.getBoolean("Hire"));
                
                history.setTooLongHire(rs.getBoolean("TooLongHire"));
                
                history.setReservation(rs.getBoolean("reservation"));
                
                history.setPunishment(rs.getInt("punishment"));

               
                return history;

        }



}
    
