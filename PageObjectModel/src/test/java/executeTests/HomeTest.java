package executeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import Pages.HomePage;
import basePackage.BaseClass;

public class HomeTest extends BaseClass 
{
	HomePage homepage;
@Test
public void verifyObsquraLogoPresent()
{
	
	System.out.println(driver);
	driver.getCurrentUrl();
	homepage=new HomePage();
	homepage.giveDriver(driver);
	Assert.assertTrue(homepage.is_ObsquraLogoDisplayed());
	
	
}
@Test
public void verifyObquraHomePageTitle()
{
	
	homepage=new HomePage();
	String actualResult=homepage.titleOfHome();
	String expectedResult="Obsqura Testing";
	Assert.assertEquals(actualResult,expectedResult,"This is Failed");	
}
}
