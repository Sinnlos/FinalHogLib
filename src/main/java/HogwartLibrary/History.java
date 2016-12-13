/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HogwartLibrary;

/**
 *
 * @author Lenovo
 */
public class History implements IHaveId {

    int id;
    int idHistory;
    int bookId; // instance 
    // id user
    boolean hire;
    boolean tooLongHire;
    boolean reservation;
    int punishment;


  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdHistory() {
        return idHistory;
    }

    public void setIdHistory(int idHistory) {
        this.idHistory = idHistory;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public boolean getHire() {
        return hire;
    }

    public void setHire(boolean hire) {
        this.hire = hire;
    }

    public boolean getTooLongHire() {
        return tooLongHire;
    }

    public void setTooLongHire(boolean tooLongHire) {
        this.tooLongHire = tooLongHire;
    }

    public boolean getReservation() {
        return reservation;
    }

    public void setReservation(boolean reservation) {
        this.reservation = reservation;
    }

    public int getPunishment() {
        return punishment;
    }

    public void setPunishment(int punishment) {
        this.punishment = punishment;
    }

}
