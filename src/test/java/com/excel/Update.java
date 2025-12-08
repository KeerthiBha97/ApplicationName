//package com.excel;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class Update {
//
//	public static void main(String[] args) throws IOException {
//
//		File f = new File("C:\\Users\\Keerthana\\eclipse\\java-2024-122\\eclipse\\Sel_practicse\\src\\test\\resources\\File.xlsx");
//		
//		
//			
//			try {
//				FileInputStream fis = new FileInputStream(f);
//				XSSFWorkbook read_book = new XSSFWorkbook(fis);
//				XSSFSheet read_sheet = read_book.getSheet("TestData");
//				XSSFRow read_row=read_sheet.getRow(1);
//				XSSFCell read_cell = read_row.getCell(0);
//				XSSFCell read_cell1 = read_row.getCell(1);
//				XSSFCell read_cell2 = read_row.getCell(2);
//				XSSFCell read_cell3 = read_row.getCell(3);
//				
//				
//				
//				
//				
//				String readvalue = read_cell.getStringCellValue();
//				String readvalue1 = read_cell1.getStringCellValue();
//				String readvalue2 = read_cell2.getStringCellValue();
//				String readvalue3 = read_cell3.getStringCellValue();
//
//				
//				System.out.print(readvalue +" ");
//				System.out.print(readvalue1+ " ");
//				System.out.print(readvalue2+ " ");
//				System.out.print(readvalue3+ " ");
//				
//				
//				fis.close();
//				
//				
//				
//				FileOutputStream fos = new FileOutputStream(f);
//
//				XSSFRow row=read_sheet.createRow(1);
//				XSSFCell cell = row.createCell(2);
//				cell.setCellValue("1472583690");
//				
//				read_book.write(fos);
//				fos.close();
//				read_book.close();
//				
//				System.out.println("Excel File updated successfully");
//				
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//		
//		
//		/*
//		
//		
//		try {
//			FileInputStream file = new FileInputStream(f);
//			try {
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		*/
//		
//		
//		
//		
//	}
//
//}

package com.excel;

import java.io.*;
import org.apache.poi.xssf.usermodel.*;

public class Update {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\Keerthana\\eclipse\\java-2024-122\\eclipse\\Sel_practicse\\src\\test\\resources\\File.xlsx");

        FileInputStream fis = new FileInputStream(f);

        // Read existing file
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("TestData");

        // Read data
        XSSFRow row = sheet.getRow(1);
        System.out.println(
                row.getCell(0).getStringCellValue() + " " +
                row.getCell(1).getStringCellValue() + " " +
                row.getCell(2).getStringCellValue() + " " +
                row.getCell(3).getStringCellValue()
        );

        fis.close();

        // Update data
        XSSFRow updateRow = sheet.getRow(1);
        if (updateRow == null) updateRow = sheet.createRow(1);

        XSSFCell updateCell = updateRow.getCell(2);
        if (updateCell == null) updateCell = updateRow.createCell(2);

        updateCell.setCellValue("8529637410");

        // Write back to file
        FileOutputStream fos = new FileOutputStream(f);
        workbook.write(fos);

        fos.close();
        workbook.close();

        System.out.println("Excel File updated successfully");
        
        System.out.println(
                row.getCell(0).getStringCellValue() + " " +
                row.getCell(1).getStringCellValue() + " " +
                row.getCell(2).getStringCellValue() + " " +
                row.getCell(3).getStringCellValue()
        );
    }
}

