/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.mvc.Controller;

import hotel.mvc.Model.Room;
import java.sql.ResultSet;

/**
 *
 * @author Abdullah Haque <abdullah.nurul.haque@g.bracu.ac.bd>
 */
public class roomController {

    public static ResultSet getAllRooms() {
        Room genricRoom = new Room();
        return genricRoom.getAllRooms();
    }

    public static ResultSet getRoomsbyRoomNum(String roomnum) {
        Room manager = new Room();
        
        return manager.getRoomsbyNum(roomnum);
    }
    
    public static ResultSet getRoomsbyBedType(String bedtype) {
        Room manager = new Room();
        
        return manager.getRoomsbyBedType(bedtype);
    }
    
    public static ResultSet getRoomsbyAvailableBedType(String bedtype) {
        Room manager = new Room();
        
        return manager.getRoomsbyAvailableBedType(bedtype);
    }
}
