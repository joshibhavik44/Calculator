import static org.junit.Assert.*;

import org.junit.Test;

import Tests.UnitTesting;

public class DivTest {

	@Test
	
	public void testdiv() {
		UnitTesting obj1 = new UnitTesting();
		double output = UnitTesting.div(15,5);
		assertEquals(3.0000,output,.0005);
	}
}
