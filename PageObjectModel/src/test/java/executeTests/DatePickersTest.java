package executeTests;

import org.testng.annotations.Test;

import Pages.DatePickersPage;
import Pages.TablePage;
import basePackage.BaseClass;

public class DatePickersTest extends BaseClass
{
	DatePickersPage datepickerspage;
	@Test
	public void clickOnDatePickers()
	{
		datepickerspage=new DatePickersPage(driver);
		datepickerspage.clickOnDatePickers();
		datepickerspage.clickCalander();
		String date="5/11/2021";
		datepickerspage.selectDate(date);
	
	}
}
