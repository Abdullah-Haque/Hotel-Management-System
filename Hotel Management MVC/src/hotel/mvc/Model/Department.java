/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.mvc.Model;
import hotel.mvc.Controller.conn;
import java.sql.ResultSet;
/**
 *
 * @author ............
 */
public class Department {

    private String department;
    private String budget;

    
    public ResultSet getAllDept(){
        try {
            conn c = new conn();

            String displayCustomersql = "select * from department";
            ResultSet rs = c.s.executeQuery(displayCustomersql);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
