package utilityPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityClass 
{
	WebDriver driver;
	//utility clas for
	//constructor
	public UtilityClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public String get_textOfElements(WebElement element)
	{
		return element.getText();
	}
	
	public List<String> getTextOfElements(String textget)
	{
		List<String> text=new ArrayList<String>();
		List<WebElement>element=driver.findElements(By.xpath(textget));
		for(WebElement elementObj:element)
		{
			text.add(elementObj.getText());
		}
		return text;
	}
	//utility clas for Login
	 public void pressLogin()
	 {
		 
	 }
 
}
