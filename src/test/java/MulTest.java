import static org.junit.Assert.*;

import org.junit.Test;

import Tests.UnitTesting;

public class MulTest {

	@Test
	
	public void testmul() {
		UnitTesting obj1 = new UnitTesting();
		int output = UnitTesting.mul(5,5);
		assertEquals(25,output);
	}
	
}
