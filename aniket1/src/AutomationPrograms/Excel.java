package AutomationPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	
	public static void main(String[] args) throws IOException {
      
		FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Downloads\\Test Case Template.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell= row.getCell(0);
		
		System.out.println(sheet.getRow(9).getCell(0));
		System.out.println(sheet.getRow(9).getCell(1));		
		System.out.println(sheet.getRow(9).getCell(2));
		System.out.println(sheet.getRow(9).getCell(3));
		System.out.println(sheet.getRow(9).getCell(4));



		System.out.println(sheet.getRow(9).getCell(5));
		System.out.println(sheet.getRow(9).getCell(6));

		System.out.println(sheet.getRow(9).getCell(7));
		System.out.println(sheet.getRow(9).getCell(8));
		System.out.println(sheet.getRow(9).getCell(9));
		System.out.println(sheet.getRow(9).getCell(10));

		
		
		
		
		 
		
	}

}
