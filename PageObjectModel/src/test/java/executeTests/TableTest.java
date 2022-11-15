package executeTests;

import org.testng.annotations.Test;

import Pages.TablePage;
import basePackage.BaseClass;
import utilityPackage.ExcelUtilityClass;

public class TableTest extends BaseClass

{
	TablePage tablepage;
@Test
public void printallNames()
{
	tablepage=new TablePage(driver);
	tablepage.clickOnTable();
}
@Test
public void verifyNames()
{
	tablepage=new TablePage(driver);
	tablepage.clickOnTable();
	tablepage.printNames();
}
@Test
public void verifyDesignation()
{
	tablepage=new TablePage(driver);
	tablepage.clickOnTable();
	tablepage.get_EmployeeDesignation("Cedric Kelly");
	ExcelUtilityClass excelutilityclass=new ExcelUtilityClass();
	excelutilityclass.printData(0,0);
}
}
