package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	
public WebDriver driver;
	
	By email=By.cssSelector("[id='user_email']");
	By sendMeInstructions=By.cssSelector("[type='submit']");
	
	
	
	
	
	
	
	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	public WebElement getEmail()
	{
		return driver.findElement(email);
		System.out.println("#1");
		System.out.println("#2");
		System.out.println("#3");
		
	}
	
	public WebElement sendMeInstructions()
	{
		return driver.findElement(sendMeInstructions);
	}
	
	

	
	
}
