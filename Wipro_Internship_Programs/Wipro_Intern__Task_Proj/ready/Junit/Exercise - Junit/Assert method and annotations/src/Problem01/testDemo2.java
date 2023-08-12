package practice;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class testDemo2 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
	Demo2 d2 = new Demo2();
	@SuppressWarnings("static-access")
	@Test
	void testPalindromeCheck() {
		assertEquals(true,d2.palindromeCheck("abba"));
	}
}
