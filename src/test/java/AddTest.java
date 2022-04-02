import static org.junit.Assert.*;

import org.junit.Test;

import Tests.UnitTesting;

public class AddTest {

	@Test
	public void testAdd() {
		UnitTesting obj1 = new UnitTesting();
		int output = UnitTesting.add(5,5);
		assertEquals(10,output);
		int output1 = UnitTesting.add(-25,5);
		assertEquals(-20,output1);
	}
}
