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
public class Login {

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    private String username;
    private String password;

    public boolean isValidUser() {
        //connection stuff goes here
        //query build
        String query = "select * from dbname where ....";

        try {

            conn c1 = new conn();
            String u = this.username;
            String v = this.password;

            String q = "select * from login where username='" + u + "' and password='" + v + "'";

            ResultSet rs = c1.s.executeQuery(q);
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

}
