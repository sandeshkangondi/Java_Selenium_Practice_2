package Selenium;
import static org.junit.Assert.*;
import org.junit.*;
import com.thoughtworks.selenium.*;

public class TestRC2 {
	Selenium bo = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.credomobile.com/");
	TestRC2 tc = new TestRC2();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		bo.start(); // Starts browser session.
		bo.open("/");
		bo.windowMaximize();
	}

	@After
	public void tearDown() throws Exception {
		bo.close();
	}

	@Test
	public void TestSeleniumRC2(){
		
		assertTrue("Link is not present in the page " ,bo.isElementPresent("Link=Phones"));
		assertTrue("Link is visible", bo.isVisible("Link=Phones"));
		}
	@Test
	public void testCheckMainMenu(){
		tc.isElementVisible("link=Phones");
	}
	
	@Test
	public void testSubMenuItem(){
		bo.mouseOver("Link=Phones");
		assertTrue("all phones link is not present",bo.isElementPresent("Link=Phones"));
		assertTrue("all phones link is not visible",bo.isVisible("Link=Phones"));
	}
	@Test
	public void checkPhonesList(){
		bo.mouseOver("Link=Phones");
		bo.click("Link=Phones");
		bo.waitForPageToLoad("20000");
		assertEquals("$49.99", bo.getText("//div[@id='versionB]/div/div[2]div[3]/span"));	
	}
		
	public boolean isElementPresent(String element){
		if (!bo.isElementPresent(element){
			System.out.println("Element"+element+"is not present in the page");
			return false;
		}
		return true;
		
		boolean isElementVisible(String element){
			if(!bo.isElementPresent(element)){
				System.out.println("Elemetnt"+element+"is not present in the page");
				return(false);
			}
			if(!bo.isVisible(element)){
				System.out.println("Elemetnt"+element+"is not visible in the page");
				return(false);
			}
			return(true);
		}
	
	@Test
	public boolean checkVisibleElementText(String Element, String value){
		if (!isElementVisible(Element)){
			return false;
		}
		assertEquals(expValue, bo.getText(Element));
		return true;	
	}
	}