package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.ResultSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hotel.mvc.Controller.conn;
import hotel.mvc.Model.Department;

class DepartmentTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetAllDept() {
		try {
			conn c = new conn();
			Department depart = new Department();
//			Boolean bool = login.isValidUser();
			String displayCustomersql = "select * from department";
            ResultSet rs1 = c.s.executeQuery(displayCustomersql);
            ResultSet rs2 = depart.getAllDept();
            
            assertTrue(conn.ResultSetCompare(rs1,rs2));
            
		} catch (Exception e) {
			fail("Problemo");

		}
	}

}
