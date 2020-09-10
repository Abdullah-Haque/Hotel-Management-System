/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.mvc.Controller;
import hotel.mvc.Model.Customer;
import java.sql.ResultSet;
/**
 *
 * @author Abdullah Haque <abdullah.nurul.haque@g.bracu.ac.bd>
 */
public class customerController {
    public static ResultSet GetAllCustomers(){
        Customer c1 = new Customer();
       
        return c1.GetAllCustomers();
    }
}
