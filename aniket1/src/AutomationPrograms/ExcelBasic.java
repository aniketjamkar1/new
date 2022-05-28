package AutomationPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelBasic {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream xfile = new FileInputStream("C:\\Users\\Dell\\Downloads\\Test Case Template.xlsx");
		String tcdata = WorkbookFactory.create(xfile).getSheet("Test Cases").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(tcdata);
		
		
	}

}
