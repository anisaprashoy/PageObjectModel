package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickersPage 
{
	WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Date Pickers')]")
	WebElement date_Click;
	@FindBy(xpath  ="//input[contains(@id,'single-input-field')]")
	WebElement calender_click;
	@FindBy(xpath  ="//th[@class='prev']")
	WebElement prev;
	@FindBy(xpath="//th[@class=\"next\"]")
	WebElement next;
	@FindBy(xpath="//th[@class='datepicker-switch'])[1]") //"//div[@class='datepicker-days']//table[@class='table-condensed']//thead//th[@class='datepicker-switch']"
	WebElement month_year;
	
	//constructor
	public DatePickersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnDatePickers()
	{
		 date_Click.click();
	}
	public void clickCalander()
	{
		calender_click.click();
	}
	public void selectDate(String date)
	{
		String split[]=date.split("/");
		String year=split[2];
		String mth=split[1];
		String day=split[0];
		//System.out.println(split);
		int monthNo=Integer.parseInt(mth);//String value to int value
		String month=null;
		switch (monthNo) 
		{
		case 01:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		default:
			break;
		}	

		
	String month_year=month+" "+year;
	while(true)	
	{
		String actualmonth=driver.findElement(By.xpath("//th[@class='datepicker-switch'][1]")).getText();
		if(actualmonth.equals(month_year))
			break;
		else if(monthNo>11)
		{
			next.click();
		}
		else
		{
			prev.click();
		}
	}
	WebElement dayelement=driver.findElement(By.xpath("//td[@class='day' and text()='"+day+"']"));
			dayelement.click();
}
}
