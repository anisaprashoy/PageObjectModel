package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilityPackage.UtilityClass;

public class InputFormPage 

{

	UtilityClass utilityclass;
	WebDriver driver;
	By input_form=By.xpath("//a[contains(text(),'Input Form')]");
	By enter_A=By.xpath("//input[contains(@id,'value-a')]");
	By enter_B=By.xpath("//input[contains(@id,'value-b')]");
	By text_get=By.xpath("//div[@id='message-two']");
	public InputFormPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verifyInputFormClickMethod()
	{
		//WebElement inputFormLink=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		WebElement inputFormLink=driver.findElement(input_form);
		inputFormLink.click();
	}
	public void enterValueAandB(String a,String b)
	{
		WebElement enterA=driver.findElement(enter_A);
		
		enterA.sendKeys(a);
		WebElement enterB=driver.findElement(enter_B);
		enterB.sendKeys(b);
		WebElement button=driver.findElement(By.xpath("//button[contains(@id,'button-two')]"));
		button.click();	
	}
	public void getSum()
	{
		utilityclass=new UtilityClass(driver);
		WebElement textget=driver.findElement(text_get);
		
		
		
	}

}
