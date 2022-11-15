package executeTests;

import org.testng.annotations.Test;
import Pages.LogInPage_2;
import basePackage.BaseClass2;

public class LoginTest_2 extends BaseClass2
{
	LogInPage_2 loginpage_2;
	@Test
	public void sendUsernameAndPassword()
	{
		loginpage_2=new LogInPage_2(driver);
		loginpage_2.sendPasswordAndUsername();
		
		
	}
	
}