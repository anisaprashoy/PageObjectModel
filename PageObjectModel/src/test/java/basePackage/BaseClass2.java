package basePackage;
/*
https://groceryapp.uniqassosiates.com/admin
username and password=admin
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass2
{
	public WebDriver driver;
	@BeforeMethod
	public void launchUrl()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		
	}

}
