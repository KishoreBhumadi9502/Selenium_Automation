package com.cyclos;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utils {
	FileInputStream fio;
	XSSFWorkbook wb;
	XSSFSheet s;

	String filepath = "D:\\Qualitythought\\com.cyclos\\TestData.xlsx";

	public Utils() throws IOException {
		fio = new FileInputStream(filepath);
		wb = new XSSFWorkbook(fio);
		s = wb.getSheet("Sheet1");
	}

	public String getcellvalue(int row, int column) {
		return s.getRow(row).getCell(column).getStringCellValue();

	}
}
