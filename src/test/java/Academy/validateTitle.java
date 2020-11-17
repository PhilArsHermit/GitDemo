package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class validateTitle extends base{
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		log.info("Navigated to Home page");
		driver.get(prop.getProperty("url"));
	}
@Test
	
	public void validateAppTitle() throws IOException
	{
		
		LandingPage l=new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COU123RSES");
		log.info("Successfully validated Text Message");
		
		
	
	}
@AfterTest
public void teardown()

{
	driver.close();
}
	


}
