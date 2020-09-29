package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import hotel.mvc.Controller.conn;

class connTest {
	private conn c1;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testConn() {
		assertDoesNotThrow(()->{
		c1 = new conn();
		});
		assertNotNull(c1.c,"Please check for connection issues");
		
	}

}
