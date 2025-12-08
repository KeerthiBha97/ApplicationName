package com.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	public static void main(String[] args) {
		
		
		File f = new File("C:\\Users\\Keerthana\\eclipse\\java-2024-122\\eclipse\\Sel_practicse\\src\\test\\resources\\File.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("TestData");
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Name");
		row1.createCell(1).setCellValue("Address");
		row1.createCell(2).setCellValue("Mobile");
		row1.createCell(3).setCellValue("DOB");
		
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Keerthana");
		row2.createCell(1).setCellValue("Adambakkam");
		row2.createCell(2).setCellValue("9876543110");
		row2.createCell(3).setCellValue("01-02-1997");
		
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("Bharath Kumar");
		row3.createCell(1).setCellValue("Velacherry");
		row3.createCell(2).setCellValue("8965741230");
		row3.createCell(3).setCellValue("06-11-1997");
		
		try {
			FileOutputStream file = new FileOutputStream(f);
			try {
				workbook.write(file);
				file.close();
				workbook.close();
				
				System.out.println("Excel File created successfully");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
