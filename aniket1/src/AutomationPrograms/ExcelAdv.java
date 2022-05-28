package AutomationPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelAdv {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//how to store the multiple data store in arraylist 
		
//		ArrayList al=new ArrayList();  // declare the arraylist
//		
//		
//		//multiple data
//		for(int i=0;i<=7;i++) {
//		
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\name.xlsx");
	     String id = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		//double mobile = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(2).getNumericCellValue();
		System.out.println(id);
//		//System.out.println(mobile);
//		
//		al.add(id);  //store the data arraylist
//		}
//		System.out.println("The size of arraylist is "+al.size());
		
		
		//for(int i=1;i<=7;i++)
		
//			FileInputStream mfile=new FileInputStream("C:\\Users\\Dell\\Desktop\\name.xlsx");
//			double mobile = WorkbookFactory.create(mfile).getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();
//			System.out.println(mobile);
//			
		
	
	
	
	
	}

}

