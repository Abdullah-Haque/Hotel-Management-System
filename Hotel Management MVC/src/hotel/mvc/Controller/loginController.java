/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.mvc.Controller;

import hotel.mvc.Model.Login;

/**
 *
 * @author Abdullah Haque <abdullah.nurul.haque@g.bracu.ac.bd>
 */
public class loginController {
    public static boolean isValidLogin(String username, String password){
        Login loginmodel = new Login(username, password);
        return loginmodel.isValidUser();
    } 
}
