package com.qa.registration.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtill {

	//Step 1 -pth of excel ->give ->("./" before the file name),copy file name from src
	public static final String TEST_DATA_SHEET_PATH="./src/main/resource/TestData/RegistrationData.xlsx";
	public static Workbook book;
	public static Sheet sheet;
	
	
	//Step 2 -Create method with sheet name and datat type
	//step 3 -Read the file-FileInputStream
	//step 4->create class of workbookn and variable too
	//stp 5->Create class and variable of sheet and provide the sheetname(not hardcore)
	//step 6->proide name of array and create the object of array and in 2D array provie the values last values of excel
	//step 7->for loop for both 2D arrya
	//step 8-> in data array store the values
	public static Object[][] getTestData(String SheetName) {
		
		Object data[][]=null;
		try {
			FileInputStream ip= new FileInputStream(TEST_DATA_SHEET_PATH);
			try {
			book =WorkbookFactory.create(ip);
			sheet= book.getSheet(SheetName);
				
			data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			
			for(int i=0;i<sheet.getLastRowNum();i++) {
				for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				
					data[i][j]=sheet.getRow(i+1).getCell(j).toString();
					
					
				}
			}	
				
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	
	
}
