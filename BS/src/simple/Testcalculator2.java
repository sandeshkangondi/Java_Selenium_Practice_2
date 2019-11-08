package simple;

import org.junit.*;
import static org.junit.Assert.*;

public class Testcalculator2 {
	
	Calculator cj1 = new Calculator();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void checkAdd(){
		assertEquals(6, cj1.add(2, 3));
		assertEquals(5, cj1.add(2, 3));
		assertEquals(8, cj1.add(2, 3));
	}
	@Ignore
	public void CheckSubtract(){
		assertEquals(0, cj1.subtract(2, 1));
	}
	@Test
	public void CheckMultiply(){
		assertEquals(5, cj1.multiply(2, 3));
	}
	@Test
	public void CheckDivide(){
		assertEquals(2, cj1.divide(4, 2));
		// for double just give the margin as the third argument
	}	
}