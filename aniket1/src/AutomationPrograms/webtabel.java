package AutomationPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtabel {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/mutual-funds");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		  
		   String heading = driver.findElement(By.xpath("//table[contains(@class,'dataTable')]/thead/tr")).getText();
		    System.out.println(heading);
		 	
		  int row = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		  System.out.println(row);
		  int column = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();		
		  System.out.println(column);
		 
		  for(int r=1;r<=row;r++) {
			for(int c=1;c<=column;c++) {
				
				String data = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
				
			System.out.print(" "+data);
			} 
			 System.out.println();
		   }
		
		 
		 
	}

}
