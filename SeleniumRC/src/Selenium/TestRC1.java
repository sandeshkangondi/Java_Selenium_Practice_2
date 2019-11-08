package Selenium;
import org.junit.*;
import com.thoughtworks.selenium.*;
public class TestRC1 {

	Selenium bo = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.credomobile.com/"); // DefaultSelenium is a super class.
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
	public void TestSeleniumRC(){
		bo.start(); // Starts browser session.
		bo.open("/");
		bo.click("link=all phones");
	}
}
