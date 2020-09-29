package test;

import hotel.mvc.Model.Login;


import static org.junit.jupiter.api.Assertions.*;

import java.sql.ResultSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoginTest {
	
	@BeforeEach
	void setUp() throws Exception {
	}

//	@Test
//	void testLogin() {
//		fail("Not yet implemented");
//	}

	@Test
	void testIsValidUser() {
		try {
			Login login = new Login("admin", "12345");
			Boolean bool = login.isValidUser();

			assertTrue(bool);

		} catch (Exception e) {
			fail("Problemo");

		}
	}

	@Test
	void testcreateUser() {
		try {
			Login login = new Login("super", "duper");
			int rs = login.createUser();

			assertNotEquals(rs,0);

		} catch (Exception e) {
			fail("Problemo");

		}

	}
}
