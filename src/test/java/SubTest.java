import static org.junit.Assert.*;

import org.junit.Test;

import Tests.UnitTesting;

public class SubTest {

	@Test

	public void testsub() {
		UnitTesting obj1 = new UnitTesting();
		int output = UnitTesting.sub(5,5);
		assertEquals(0,output);
	}
}
