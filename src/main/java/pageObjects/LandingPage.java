package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signin=By.xpath("//span[contains(text(),'Login')]");
	By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	By popup=By.xpath("//button[text()='NO THANKS']");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public LoginPage getLogin()
	{
		 driver.findElement(signin).click();
		 LoginPage lp=new LoginPage(driver);
		 return lp;
	}
	
	public WebElement getNavigationBar()
	{
		System.out.println("Trying to identify navigation bar");
		System.out.println("Still Trying to identify navigation bar");
		System.out.println("Again Trying to identify navigation bar");
		return driver.findElement(NavBar);
	}
	
	public int getPopUpSize()
	{
		
		return driver.findElements(popup).size();
	}
	
	public WebElement getPopUp()
	{
		return driver.findElement(popup);
	}

	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}

}
