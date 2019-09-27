package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.Utils;

public class LoginDataChecker {
	
	@Test
	public void getXL_Data() throws EncryptedDocumentException, FileNotFoundException, IOException	{
		
		Utils.XL_Read("Sheet1", 0, 0);
	}
	
	
	@Test
	public void getXL_DataAll() throws FileNotFoundException, IOException, Exception 
	{
	 int rowCount = Utils.XL_RowCount("Sheet1");
	 for(int i=1;i<rowCount;i++)
	 {
		 Utils.XL_Read("Sheet1", i, 1);
	 }
	 
	}
	
}
