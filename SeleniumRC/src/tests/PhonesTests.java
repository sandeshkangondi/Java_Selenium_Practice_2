package tests;

import pagelib.*;
import org.junit.*;
import org.junit.Before;

public class PhonesTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	CredoHome h = new CredoHome();
	Phones p = new Phones();
	Zip z = new Zip();
	String btnaddtocart="//div[@id='versionB']/div/div[2]/div4/div/a";
	
	@Test
	public void testaddPhoneToCart()
	{
	h.openHome();
	h.checkMenu("link=Phones");
	h.openPhonesPage("link=all phones");
	p.checkPhonePresent("Sony ABC");
	p.addPhoneTocart(btnaddtocart);
	
	}
}
