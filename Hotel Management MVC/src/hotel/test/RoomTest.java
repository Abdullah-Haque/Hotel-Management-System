package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.ResultSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hotel.mvc.Controller.conn;
//import hotel.mvc.Model.Department;
import hotel.mvc.Model.Room;
import java.sql.SQLException;

class RoomTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	

	@Test
	void testGetAllRooms() {
		try {
			conn c = new conn();
			Room r1 = new Room();
//			Boolean bool = login.isValidUser();
			String displayCustomersql = "select * from room";
            ResultSet rs1 = c.s.executeQuery(displayCustomersql);
            ResultSet rs2 = r1.getAllRooms();
            
            assertTrue(conn.ResultSetCompare(rs1,rs1));
            
		} catch (Exception e) {
			fail("Problemo");

		}
	}

	@Test
	void testGetRoomsbyNum() {
		try {
			conn c = new conn();
			Room r1 = new Room("101");
//			Boolean bool = login.isValidUser();
			String displayCustomersql = "select * from room where room_number = '" + r1.getRoom_number() + "'";
            ResultSet rs1 = c.s.executeQuery(displayCustomersql);
            ResultSet rs2 = r1.getRoomsbyNum("101");
            
            assertTrue(conn.ResultSetCompare(rs1,rs2));
            
		} catch (Exception e) {
			fail("Problemo");

		}
	}
//
	@Test
	void testGetRoomsbyBedType() {
		try {
			conn c = new conn();
			Room r1 = new Room("Single Bed");
//			Boolean bool = login.isValidUser();
			String displayCustomersql = "select * from room where room_number = '" + r1.getBed_type() + "'";
            ResultSet rs1 = c.s.executeQuery(displayCustomersql);
            ResultSet rs2 = r1.getRoomsbyBedType("Single Bed");
            
            assertTrue(conn.ResultSetCompare(rs1,rs2));
            
		} catch (Exception e) {
			fail("Problemo");

		}
	}

	@Test
	void testGetRoomsbyAvailableBedType() {
		try {
			conn c = new conn();
			Room r1 = new Room("Single Bed");
//			Boolean bool = login.isValidUser();
			String displayCustomersql = "select * from room where availability = 'Available' AND  bed_type = '" + r1.getBed_type() + "'";
            ResultSet rs1 = c.s.executeQuery(displayCustomersql);
            ResultSet rs2 = r1.getRoomsbyAvailableBedType("Single Bed");
            
            assertTrue(conn.ResultSetCompare(rs1,rs2));
            
		} catch (SQLException e) {
			e.printStackTrace();
			fail("Problemo");

		}
	}

}
