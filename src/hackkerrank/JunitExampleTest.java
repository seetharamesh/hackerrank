package hackkerrank;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitExampleTest {
	@Test
	public void testAdd() {
		int a = 10, b = 10;
		JunitExample ju = new JunitExample();
		assertEquals(20, ju.add(a, b));
	}

	@Test
	public void testSubtract() {
		int a = 20, b = 10;
		JunitExample ju = new JunitExample();
		assertEquals(10, ju.subtract(a, b));
	}

}
