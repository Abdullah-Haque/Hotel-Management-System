package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.ResultSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hotel.mvc.Controller.conn;
import hotel.mvc.Model.Employee;
import java.sql.SQLException;
class EmployeeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

//	@Test
//	void testEmployeeStringStringStringStringStringStringStringString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testEmployee() {
//		fail("Not yet implemented");
//	}

	@Test
	void testGetAllEmployee() {
		try {
			conn c = new conn();
			Employee e1 = new Employee();
//			Boolean bool = login.isValidUser();
			String displayCustomersql = "select * from employee";
            ResultSet rs1 = c.s.executeQuery(displayCustomersql);
            ResultSet rs2 = e1.getAllEmployee();
            
            assertTrue(conn.ResultSetCompare(rs1,rs2));
            
		} catch (Exception e) {
			fail("Problemo");

		}
	}

	@Test
	void testGetAllManagers() {
		try {
			conn c = new conn();
			Employee e2 = new Employee();
//			Boolean bool = login.isValidUser();
			String displayCustomersql = "select * from employee where job = 'Manager'";
            ResultSet rs3 = c.s.executeQuery(displayCustomersql);
            ResultSet rs4 = e2.getAllManagers();
            
            assertTrue(conn.ResultSetCompare(rs3,rs4));
            
		} catch (SQLException e) {
			e.printStackTrace();
			fail("Problemo");

		}
	}

}
