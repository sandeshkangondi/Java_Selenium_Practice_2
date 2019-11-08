package pagelib;

import com.thoughtworks.selenium.*;
import static org.junit.Assert.*;

public class CredoHome {
	
	Selenium bo = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.credomobile.com");
	
	public void openHome()
	{
		bo.start();
		bo.open("/");
		//assertEquals("", bo.getTitle());
		
	}

	public void checkMenu(String menu)
	{
		
	}
	
	public void checkSubMenu(String menu, String submenu)
	{
		
	}
	
	public void openPhonesPage(String phonetype)
	{
		
	}
	
	public void openPlansPage(String plan)
	{
		
	}
}
