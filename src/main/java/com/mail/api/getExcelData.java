package com.mail.api;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class getExcelData {
	
	private Workbook workbook=null;
	private Sheet sheet=null;
	private static String projectPath=System.getProperty("user.dir");
	public final static getExcelData ecxelData=new getExcelData(projectPath+"//src//test//resources//testData.xls");
	
	private getExcelData(String excelPath) {
		try {
			workbook=Workbook.getWorkbook(new File(excelPath));
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getCell(String sheetName,String columnName,String rowName){
		int row=0;
		int column=0;
		
		sheet=workbook.getSheet(sheetName);
		
		for(int i=0;i<sheet.getColumns();i++){
			if(columnName.equals(sheet.getCell(i, 0).getContents().trim())){
				column=i;
				break;
			}
		}

		for(int i=0;i<sheet.getRows();i++){
			if(rowName.equals(sheet.getCell(0, i).getContents().trim())){
				row=i;
				break;
			}
		}
		
		return sheet.getCell(column, row).getContents().trim();
	}
}
