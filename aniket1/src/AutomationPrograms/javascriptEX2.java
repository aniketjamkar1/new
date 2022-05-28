package AutomationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptEX2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//input[@class='homesrchbox']"));
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].style.border='3px solid blue'",search);
		Seleniumutil.borderbyJS(driver, search);
		JavascriptExecutor ja=((JavascriptExecutor)driver);
		String title = ja.executeScript("return document.title;").toString();
		System.out.println(title);

		JavascriptExecutor jd=((JavascriptExecutor)driver);
		jd.executeScript("arguments[0].click();",search);
		
		JavascriptExecutor jf=((JavascriptExecutor)driver);
		jf.executeScript("alert('"+"welcome to rediff"+"')"); 
	    Alert al = driver.switchTo().alert();
	    al.accept();
	    
		JavascriptExecutor jg=((JavascriptExecutor)driver);
		jg.executeScript("history.go(0)");
		
		JavascriptExecutor jh=((JavascriptExecutor)driver);
		jh.executeScript("scroll(0,2500)");
		
		JavascriptExecutor jj=((JavascriptExecutor)driver);
		jj.executeScript("scroll(0,200)");
		
		WebElement down = driver.findElement(By.xpath("//a[text()='Grievances']"));
		JavascriptExecutor jk=((JavascriptExecutor)driver);
		jk.executeScript("arguments[0].scrollIntoView(false);", down);
		
	}

}
