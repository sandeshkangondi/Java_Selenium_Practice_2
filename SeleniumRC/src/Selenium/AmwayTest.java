package Selenium;

import org.junit.*;

import com.thoughtworks.selenium.*;
public class AmwayTest {
	Selenium bo = new DefaultSelenium("localhost", 4444, "*firefox", "https://www.amway.com/");
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
	public void testAmway(){
		bo.start();
		bo.open("/");
		bo.click("Link=Beauty");
	}
}
