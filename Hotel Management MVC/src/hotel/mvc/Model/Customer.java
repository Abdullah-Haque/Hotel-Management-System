/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.mvc.Model;

import hotel.mvc.Controller.conn;
import hotel.mvc.View.Dashboard;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Alif
 */
public class Customer {

    public Customer(String status, String id, String phone, String number, String job, String gender, String age, String name, String deposit) {
        this.status = status;
        this.id = id;
        this.phone = phone;
        this.number = number;
        this.job = job;
        this.gender = gender;
        this.age = age;
        this.name = name;
        this.deposit = deposit;
    }
    
    public Customer() {
        
    }
    
    
    private String status;
    private String id;
    private String phone;
    private String number;
    private String job;
    private String gender;
    private String age;
    private String name;
    private String deposit;

    public ResultSet GetAllCustomers() {
        try {
            conn c = new conn();

            String displayCustomersql = "select * from Customer";
            ResultSet rs = c.s.executeQuery(displayCustomersql);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
