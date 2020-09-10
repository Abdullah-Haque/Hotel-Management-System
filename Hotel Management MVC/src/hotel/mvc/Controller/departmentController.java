/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.mvc.Controller;
import java.sql.ResultSet;
import hotel.mvc.Model.Department;

/**
 *
 * @author Abdullah Haque <abdullah.nurul.haque@g.bracu.ac.bd>
 */
public class departmentController {
    public static ResultSet getAllDepartments(){
        Department depmodel = new Department();
        return depmodel.getAllDept();
    } 
}
