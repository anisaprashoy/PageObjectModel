package utilityPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilityClass 
{
	XSSFSheet sheet;
	XSSFWorkbook workbook;
	
	XSSFRow row;
	XSSFCell cell;
	
	public void printData(int r,int c)
	{
		String x=null;
		try 
		{
			String path="/Users/prashoy/Desktop/Auto_All_In_One/Team.xlsx";
			File src=new File(path);
			FileInputStream fi=new FileInputStream(src);
			workbook=new XSSFWorkbook(fi);
			sheet=workbook.getSheet("Nameandcourse");
			
			row=sheet.getRow(r);
			cell=row.getCell(c);
			
			switch (cell.getCellType()) {
			case STRING: {
				
				x = cell.getStringCellValue();
				break;
			}
			case NUMERIC: {
				long d = (long) cell.getNumericCellValue();
				x=String.valueOf(d);
				
			}
			default:
			}
			System.out.println("data="+x);
					
			
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
	}
}
