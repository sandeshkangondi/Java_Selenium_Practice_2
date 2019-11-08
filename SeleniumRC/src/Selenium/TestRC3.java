package Selenium;


import org.junit.*;
import static org.junit.Assert.*;
import com.thoughtworks.selenium.*;

public class TestRC3 {
	Selenium sn = new DefaultSelenium("localhost",4444,"*firefox","http://www.credomobile.com"); //DefaultSelenium is superclass of Selenium

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		sn.start();  //start browser session.
		sn.open("/");
		sn.windowMaximize();
	}

	@After
	public void tearDown() throws Exception {
		sn.close();
	}
	
	@Test
	public void TestSnRC(){
	
		
		//sn.click("link=all phones");       // click at for image with mapping
		assertTrue("link is not present",sn.isElementPresent("link=Phones"));
		
		sn.click("subnavAllPhones");
		sn.waitForPageToLoad("20000");
		sn.click("xpath=//div[@id='versionB']/div[5]/div[2]/div[4]/a"); //add BB to cart
		String text = sn.getText("xpath=//div[@id='versionB']/div[5]/div[2]/div[3]/span");
		System.out.println(text);
		sn.waitForPageToLoad("20000");
		sn.type("xpath=//*[contains(@id, 'textZip')]","94587");  // enter Zip code
		sn.click("xpath=//*[contains(@id, 'imgZipGoBtn')]");      // submit zip code
		sn.waitForPageToLoad("200000");
		//text = sn.getText("xpath=//div[@id='individualPlans']/table/tbody/tr[2]/td[5]");
		System.out.println(text);
		assertEquals(text, sn.getText("//table[@id='cartDetails']/tbody/tr[4]/td[2]"));
		sn.click("//div[@id='individualPlans']/table/tbody/tr[2]/td[6]/a");
		sn.waitForPageToLoad("20000");
	}
	
	@Test
	public void testSubMenu(){
		sn.mouseOver("link=Phones");
		assertTrue("link is not present",sn.isElementPresent("link=Phones"));
		assertTrue("link all phones is not visible",sn.isVisible("link=all phones"));
	}
	
	@Test
	public void checkPhoneList(){
		sn.mouseOver("link=Phones");
		sn.click("link=all phones");
		sn.waitForPageToLoad("20000");
		assertEquals("$49.99",sn.getText(""));
		
	}
	
	/*@Test
	public boolean isElementVisible(String element){
		if(!sn.isElementPresent(element)){
			System.out.println("Elemetnt"+element+"is not present in the page");
			return(false);
		}
		if(!sn.isVisible(element)){
			System.out.println("Elemetnt"+element+"is not visible in the page");
			return(false);
		}
		return(true);
	}*/
}