package com.wipro;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Test;
public class TestStringConcat {
	static DailyTasks dt = new DailyTasks();
	@Test
	void teststringConcat() {
		assertEquals("Hello World", dt.stringConcat("Hello ","World"));
	}
	@Test
	void testAdd() {
		assertEquals(5, dt.add(3,2));
	}
}
