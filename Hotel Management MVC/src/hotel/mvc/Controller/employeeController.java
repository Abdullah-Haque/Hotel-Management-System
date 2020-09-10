/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.mvc.Controller;

import hotel.mvc.Model.Employee;
import java.sql.ResultSet;

/**
 *
 * @author Abdullah Haque <abdullah.nurul.haque@g.bracu.ac.bd>
 */
public class employeeController {

    public static ResultSet getAllEmployees() {
        Employee genricEmployee = new Employee();
        return genricEmployee.getAllEmployee();
    }

    public static ResultSet getEmployeesbyManager() {
        Employee manager = new Employee();

        return manager.getAllManagers();
    }
}
