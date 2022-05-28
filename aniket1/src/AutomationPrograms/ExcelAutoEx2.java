		package AutomationPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelAutoEx2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		
	for(int i=0;i<=7;i++) {
		for(int j=0;j<=1;j++) {
	FileInputStream file = new FileInputStream("C:\\Users\\Dell\\Desktop\\name.xlsx");
	String data = WorkbookFactory.create(file).getSheet("Sheet2").getRow(i).getCell(j).getStringCellValue();
	System.out.print(data+"  ");
	 }System.out.println();
	}
	
//		FileInputStream file;
//	 file = new FileInputStream("C:\\Users\\Dell\\Desktop\\name.xlsx");
//     int rows = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
//	 file = new FileInputStream("C:\\Users\\Dell\\Desktop\\name.xlsx");
//     int coloms = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
//	
//	System.out.println(rows);
//	System.out.println(coloms);
//	
//	
//	for(int i=0;i<=rows;i++) {
//		for(int j=0;j<coloms;j++) {
//	 file = new FileInputStream("C:\\Users\\Dell\\Desktop\\name.xlsx");
//	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
//	System.out.print(data+"  ");
//	 }System.out.println();
//	}
	
	
	
	
	
	
	
	}
}
