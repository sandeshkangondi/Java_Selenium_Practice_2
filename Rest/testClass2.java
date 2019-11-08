import static org.junit.Assert.*;

import org.junit.Test;

public class testClass2 {
	
	@Test
	public void testPrintNameonEntry() {
		Class2 c2 = new Class2("San");
		assertEquals(c2.getName(), "San" );
	}
}