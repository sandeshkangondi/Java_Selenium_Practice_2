
import static org.junit.Assert.*;

import org.junit.*;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;


public class credo1 {

	Selenium bo = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.credomobile.com");
	credo1 c1 = new credo1();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		bo.start();
		bo.open("/");
		bo.windowMaximize();
	}

	@After
	public void tearDown() throws Exception {
		//bo.close();
	}
	
	public void testMouseOver(String menu, String submenu){
		String men= menu;
		String submen = submenu;
		bo.mouseOver(men);
		assertTrue("all phones not visible", bo.isVisible(submen));
		assertTrue("all phones not present", bo.isElementPresent(submen));	
	}
	
	@Test // TC_1
	public void testMouseOverfor(){
		c1.testMouseOver("link=Phones","link=all phones");
		c1.testMouseOver("link=Plans","link=family plans");
		c1.testMouseOver("link=Support","link=new members");		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
