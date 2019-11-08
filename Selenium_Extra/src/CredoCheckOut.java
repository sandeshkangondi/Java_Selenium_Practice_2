import org.junit.*;

import static org.junit.Assert.*;
import com.thoughtworks.selenium.*;

public class CredoCheckOut {
Selenium bo = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.credomobile.com");

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

	@Test
	public void testCheckMainMenu()
	{
			
		assertTrue("Link is not present in the page",bo.isElementPresent("link=Phones"));
		assertTrue("Link is not visible",bo.isVisible("link=Phones"));
				
	}
	@Test
	public void testSubMenuItem()
	{
		bo.mouseOver("link=Phones");
		assertTrue("all phones link is not present", bo.isElementPresent("link=all phones"));
		assertTrue("all phones link is not visible", bo.isVisible("link=all phones"));
	}
	@Test 
	public void checkPhonesList()
	{
		bo.mouseOver("link=Phones");
		bo.click("link=all phones");
		bo.waitForPageToLoad("20000");
		assertEquals("$49.99", bo.getText("//div[@id='versionB']/div/div[2]/div[3]/span"));
	}
}