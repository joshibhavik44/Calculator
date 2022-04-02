import static org.junit.Assert.*;

import Tests.UnitTesting;

public class Test {

	@org.junit.Test
	public void test() {
	int output = UnitTesting.add(15, 20);
	assertEquals(35,output);
	}

}
