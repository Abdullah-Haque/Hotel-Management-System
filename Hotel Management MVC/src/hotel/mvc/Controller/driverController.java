/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.mvc.Controller;

import hotel.mvc.Model.Driver;
import java.sql.ResultSet;

/**
 *
 * @author Abdullah Haque <abdullah.nurul.haque@g.bracu.ac.bd>
 */
public class driverController {

    public static ResultSet getAllDrivers() {
        Driver genricDriver = new Driver();
        return genricDriver.getAllDrivers();
    }

    public static ResultSet getDriversbyBrand(String brand) {
        Driver brandDriver = new Driver(brand);

        return brandDriver.getDriversbyBrand();
    }
}
