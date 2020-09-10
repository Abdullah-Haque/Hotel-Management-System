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
public class Employee {

    private String email;
    private String aadhar;
    private String phone;
    private String salary;
    private String job;
    private String gender;
    private String age;
    private String name;

    public Employee(String email, String aadhar, String phone, String salary, String job, String gender, String age, String name) {
        this.email = email;
        this.aadhar = aadhar;
        this.phone = phone;
        this.salary = salary;
        this.job = job;
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    public Employee() {
    }
    public ResultSet getAllEmployee() {
        String SQL = "select * from employee";
        try {

            conn c = new conn();
            ResultSet rs = c.s.executeQuery(SQL);
            return rs;
        } catch (SQLException ss) {
            ss.printStackTrace();
        }

        return null;
    }
    
    public ResultSet getAllManagers() {
        String SQL = "select * from employee where job = 'manager'";
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
