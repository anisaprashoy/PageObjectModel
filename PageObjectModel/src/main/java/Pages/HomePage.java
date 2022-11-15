package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage 
{
	WebDriver driver;
	/*
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	*/
	public void giveDriver(WebDriver driver)
	{
		this.driver=driver;
	}
	public boolean is_ObsquraLogoDisplayed()
	{
	
		WebElement logo=driver.findElement(By.xpath("//div[@class='top-logo']//img[@src='images/logo.png']"));
		return logo.isDisplayed();
	
	}
	public String titleOfHome()
	{
		String titlehome=driver.getTitle();
		return titlehome;
	}

}
