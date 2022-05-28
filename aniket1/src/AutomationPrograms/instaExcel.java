package AutomationPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instaExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		
        FileInputStream fm=new FileInputStream("C:\\Users\\Dell\\Desktop\\name.xlsx");
        String login = WorkbookFactory.create(fm).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
        username.sendKeys(login);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		FileInputStream ps=new FileInputStream("C:\\Users\\Dell\\Desktop\\name.xlsx");
		String pass = WorkbookFactory.create(ps).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		password.sendKeys(pass);
		
		
	}

}
