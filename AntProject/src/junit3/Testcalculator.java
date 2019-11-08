package junit3;

import junit.framework.*; // needs more than testcase

public class Testcalculator extends TestCase {
	
	Calculator cj = new Calculator();
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testAdd(){
		assertEquals(6, cj.add(2, 3));
		assertEquals(5, cj.add(2, 3));
		assertEquals(8, cj.add(2, 3));
		//System.out.println("ANT");
	}
	
	public void testSubtract(){
		assertEquals(0, cj.subtract(2, 1));
	}
	
	public void testMultiply(){
		assertEquals(6, cj.multiply(2, 3));
	}
	
	public void testDivide(){
		assertEquals(2, cj.divide(4, 2));
	}
	
	public void testX(){
		fail("testing failed"); 
	}
}
