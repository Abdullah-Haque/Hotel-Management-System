package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.ResultSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hotel.mvc.Controller.conn;

import hotel.mvc.Model.Driver;

class DriverTest {

	@BeforeEach
	void setUp() throws Exception {
	}

//	@Test
//	void testDriverString() {
//		fail("Not yet implemented");
//	}

//	@Test
//	void testDriver() {
//		fail("Not yet implemented");
//	}

	@Test
	void testGetAllDrivers() {
		try {
			conn c = new conn();
			Driver d1 = new Driver();
//			Boolean bool = login.isValidUser();
			String displayCustomersql = "select * from driver";
            ResultSet rs1 = c.s.executeQuery(displayCustomersql);
            ResultSet rs2 = d1.getAllDrivers();
            
            assertTrue(conn.ResultSetCompare(rs1,rs2));
            
		} catch (Exception e) {
			fail("Problemo");

		}
	}

	@Test
	void testGetDriversbyBrand() {
		try {
			conn c = new conn();
			Driver d2 = new Driver("Benz");
//			Boolean bool = login.isValidUser();
			String displayCustomersql = "select * from driver where brand = '" + d2.getBrand() + "'";
            ResultSet rs3 = c.s.executeQuery(displayCustomersql);
            ResultSet rs4 = d2.getDriversbyBrand();
            
            assertTrue(conn.ResultSetCompare(rs3,rs4));
            
		} catch (Exception e) {
			fail("Problemo");

		}
	}

}
