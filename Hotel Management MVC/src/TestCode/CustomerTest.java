package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.ResultSet;

import hotel.mvc.Controller.conn;
import hotel.mvc.Model.Customer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hotel.mvc.Model.Login;
//import org.apache.jena.sparql.resultset.ResultSetCompare;


class CustomerTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	

	

	@Test
	void testGetAllCustomers() {
		try {
			conn c = new conn();
			Customer cus1 = new Customer();
//			Boolean bool = login.isValidUser();
			String displayCustomersql = "select * from Customer";
            ResultSet rs1 = c.s.executeQuery(displayCustomersql);
            ResultSet rs2 = cus1.GetAllCustomers();
            
            assertTrue(conn.ResultSetCompare(rs1,rs2));
            
		} catch (Exception e) {
			fail("Problemo");

		}
	}

}
