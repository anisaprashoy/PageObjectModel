package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage_2 
{
	WebDriver driver;
	
	@FindBy(xpath = "//input[contains(@name,'username')]")
	WebElement userName;
	
	@FindBy(xpath = "//input[contains(@name,'password')]")
	WebElement password;
	
	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	WebElement signIn;
	
	
	public LogInPage_2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void sendPasswordAndUsername()
	{
		userName.sendKeys("admin");
		password.sendKeys("admin");
		signIn.click();
	}
}
