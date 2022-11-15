package executeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.InputFormPage;
import basePackage.BaseClass;

public class InputFormTest extends BaseClass
{
	InputFormPage inputformpage;
	@Test
	public void inputhomeClick()
	{
		inputformpage=new InputFormPage(driver);
		
		inputformpage.verifyInputFormClickMethod();
		//inputformpage.messageFieldMethod();
	}
	@Test
	
	public void verifyShowmessageFunctionalityMethod()
	{
		
		
		inputformpage=new InputFormPage(driver);
		inputformpage.verifyInputFormClickMethod();
		inputformpage.enterValueAandB("2","3");
		inputformpage.getSum();
		//System.out.println(inputformpage.getSum());
	}
	
	
	
}
