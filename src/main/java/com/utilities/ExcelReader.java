package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	 static XSSFSheet sheet;

	 public static void setExcelFile(String path,String sheetname) throws IOException {
			
	        FileInputStream fis=new FileInputStream(path);
			
			XSSFWorkbook wbook=new XSSFWorkbook(fis);
			sheet=wbook.getSheet(sheetname);
			fis.close();
		}
		public static String getData(int rowNo,String coloumnName) {
			if (sheet == null) {
		        System.out.println("Excel sheet is not initialized.");
		        return "";
		    }
		
			XSSFRow row=sheet.getRow(0);
			XSSFCell cell=null;
			int coloumnnum=-1;
			try {
			for(int i=0;i<row.getLastCellNum();i++) {
				if(row.getCell(i).getStringCellValue().toString().trim().equals(coloumnName)) {
					coloumnnum=i;
				
				}
			}
					
			}catch (NullPointerException e) {
				e.printStackTrace();
				System.out.println("entered coloumn name is not avilable in excel data file");
			}
			//String value=sheet.getRow(rowNo).getCell(coloumnnum).getStringCellValue().toString().trim();
			//return value;
		    XSSFCell cell1 = sheet.getRow(rowNo).getCell(coloumnnum);

		    
		    if (cell1 != null) {
		        switch (cell1.getCellType()) {
		            case STRING:
		                return cell1.getStringCellValue().trim();
		            case NUMERIC:
		                return String.valueOf(cell1.getNumericCellValue());
		            case BOOLEAN:
		                return String.valueOf(cell1.getBooleanCellValue());
		            default:
		                return "";
		        }
		    } else {
		        return "";
		    }
			}
}
		
		


