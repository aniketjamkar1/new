package Automationthings;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demodatepicker {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\Chrome_100 V\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    WebElement text = driver.findElement(By.xpath("//input[@id='datepicker2']"));
	    text.click();
	   
	    WebElement month = driver.findElement(By.xpath("//select[@title='Change the month']"));
	     Select mo =new Select(month);
	     mo.selectByVisibleText("June");
	     
	     WebElement year = driver.findElement(By.xpath("//select[@title='Change the year']"));
	     Select ye= new Select(year);
	     ye.selectByVisibleText("2013");
	     
//	   List<WebElement> date = driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr[4]/td[1]"));
//	    Select dt = new Select((WebElement) date);
//	    dt.selectByVisibleText("17");
	
	
	     String date = "18";
	     
	     List<WebElement> alldate = driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr/td"));
	     for(WebElement el:alldate) {
		     String dt=el.getText();
		  if(dt.equals(date)) {
			  el.click();
			  break;
		  }
	      }
	
	
	
	
	
	
	}

}
