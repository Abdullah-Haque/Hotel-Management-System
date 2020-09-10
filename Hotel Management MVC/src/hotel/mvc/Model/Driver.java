/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.mvc.Model;

import hotel.mvc.Controller.conn;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ............
 */
public class Driver {

    private String brand;

    public Driver(String brand) {
        this.brand = brand;
    }

    public Driver() {
    }

    public ResultSet getAllDrivers() {
        String SQL = "select * from driver";
        try {

            conn c = new conn();
            ResultSet rs = c.s.executeQuery(SQL);
            return rs;
        } catch (SQLException ss) {
            ss.printStackTrace();
        }

        return null;
    }
    
    public ResultSet getDriversbyBrand() {
        String SQL = "select * from driver where brand = '" + this.brand + "'";
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
