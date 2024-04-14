package com.rgp.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	
	public String readDataFromConfigFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.properties");
		Properties p = new Properties();
		p.load(fis);		
		String data = p.getProperty(key);
		return data;
		
	}
	
public String ReadDataFromExcel(String s, int row, int cell) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(s).getRow(row).getCell(cell).getStringCellValue();
	return data;
}

public void WriteDataIntoExcel(String Sheet, int Row, int Cell, String Value) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(Sheet).getRow(Row).getCell(Cell).setCellValue(Value);
	FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
	
}
	
	
	
	
	

}
