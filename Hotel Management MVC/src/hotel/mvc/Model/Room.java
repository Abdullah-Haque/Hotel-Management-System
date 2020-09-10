/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.mvc.Model;

import hotel.mvc.Controller.conn;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ............
 */
public class Room {

    private String bed_type;
    private String availability;
    private String clean_status;
    private String budget;
    private String room_number;
    private String price;

    public Room(String bed_type, String availability, String clean_status, String budget, String room_number, String price) {
        this.bed_type = bed_type;
        this.availability = availability;
        this.clean_status = clean_status;
        this.budget = budget;
        this.room_number = room_number;
        this.price = price;
    }

    public Room() {
    }

    public ResultSet getAllRooms() {
        String SQL = "select * from room";
        try {

            conn c = new conn();
            ResultSet rs = c.s.executeQuery(SQL);
            return rs;
        } catch (SQLException ss) {
            ss.printStackTrace();
        }

        return null;
    }

    public ResultSet getRoomsbyNum(String roomnum) {
        String SQL = "select * from room where room_number = '" + roomnum + "'";
        try {

            conn c = new conn();
            ResultSet rs = c.s.executeQuery(SQL);
            return rs;
        } catch (SQLException ss) {
            ss.printStackTrace();
        }

        return null;
    }
    
    public ResultSet getRoomsbyBedType(String bedtype) {
        String SQL = "select * from room where bed_type =  '" + bedtype + "'";
        try {

            conn c = new conn();
            ResultSet rs = c.s.executeQuery(SQL);
            return rs;
        } catch (SQLException ss) {
            ss.printStackTrace();
        }

        return null;
    }
    
    public ResultSet getRoomsbyAvailableBedType(String bedtype) {
        String SQL = "select * from room where availability = 'Available' AND  bed_type = '" + bedtype + "'";
        try {

            conn c = new conn();
            ResultSet rs = c.s.executeQuery(SQL);
            return rs;
        } catch (SQLException ss) {
            ss.printStackTrace();
        }

        return null;
    }
}
