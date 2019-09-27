package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils implements AutoConstant {
	
	
	public static void takeScreenShot(WebDriver driver,String name)
	
	{			
		TakesScreenshot ts=(TakesScreenshot) driver;
				
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target= new File(SCREENSHOT_PATH+name+".png");
		
				
	}	
	
	public static void XL_Read(String sheetname, int rowNum, int cellNum) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		
		Workbook wb = WorkbookFactory.create(new FileInputStream(XL_INPUT_PATH));
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowNum);
		Cell cell = row.getCell(cellNum, MissingCellPolicy.CREATE_NULL_AS_BLANK);
		
		String cellValue1 = String.valueOf(cell.getStringCellValue().toString());
		String cellValue = cell.getStringCellValue().toString();
		System.out.println(cellValue);	
				
	}
	
	public static void XL_Write() 
	{
		
	}
	
	public static int XL_RowCount(String sheetName) throws Exception, FileNotFoundException, IOException {
		
		int rowCount = WorkbookFactory.create(new FileInputStream(XL_INPUT_PATH)).getSheet(sheetName).getLastRowNum();
		return rowCount;
		
	}
}
