package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityPackage.UtilityClass;

public class TablePage 
{
	WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Table')]")
	
	WebElement table_link;
	public TablePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickOnTable()
	{
		table_link.click();
	}
	public void printNames()
	{
		UtilityClass utilityclass=new UtilityClass(driver);
		//utilityclass.get_textOfElements("//tbody/tr/td[1]");
		utilityclass.getTextOfElements("//tbody/tr/td[1]");
		List<String>text=new ArrayList<String>();
		text=utilityclass.getTextOfElements("//tbody/tr/td[1]");
		System.out.println("text="+text);
	}
	public void get_EmployeeDesignation(String name)
	{
		List<String>names=new ArrayList<String>();
		UtilityClass utilityclass=new UtilityClass(driver);
		int pos=0;
	
		names=utilityclass.getTextOfElements("//tbody//tr//td[1]");
		System.out.println(names);
	 	for(pos=0;pos<names.size();pos++)
		{
			if (name.equals(names.get(pos)))
			{
				pos++;
				break;
			}
		}
		WebElement position=driver.findElement(By.xpath("//tbody//tr["+pos+"]//td[2]"));
		System.out.println("position="+position.getText());
		
		//Cedric Kelly d=tbody//tr[4]//td[2]
	}
}
