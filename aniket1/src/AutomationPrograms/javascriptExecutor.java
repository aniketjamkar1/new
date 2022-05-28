package AutomationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
 
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.rediff.com/");
		  //  driver.get("https://www.google.com/");
		 //  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		  driver.switchTo().frame("iframeResult");
//	   	   WebElement tryit = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		  
		   
		   //creating border
//		    JavascriptExecutor js = ((JavascriptExecutor)driver);
//		    js.executeScript("arguments[0].style.border='3px solid red'",tryit);
//		   
	   	   
		   //creating title of page
//		   JavascriptExecutor js=((JavascriptExecutor)driver);
//		   String title = js.executeScript("return document.title;").toString();
//		   System.out.println(title);
		  // System.out.println(driver.getTitle());

		   
		   //click on element
		   		   
//			   JavascriptExecutor js = ((JavascriptExecutor)driver);
//    		   js.executeScript("arguments[0].click();", tryit);
//	   
		    //to handel popup
//	     Alert al = driver.switchTo().alert();
//	     al.accept();
	     
	       //genrating run rime popup
//	     JavascriptExecutor je = ((JavascriptExecutor)driver);
//	     je.executeScript("alert('"+"congratulation you genrate POPUP"+"')");
	     
	     // page refresh
//	     Thread.sleep(3000);
//	     JavascriptExecutor ju=((JavascriptExecutor)driver);
//	     ju.executeScript("history.go(0)");
//	     ju.executeScript("alert('"+"your page is refresh@@"+"')");
	   	   
		 //scrolldowm and up
//	     JavascriptExecutor js= ((JavascriptExecutor)driver);
//	     js.executeScript("scroll(0,2000)");  
//	     Thread.sleep(2000);
//	     js.executeScript("scroll(0,-100)");
		   
	     
		 //scroll into view
		   
		  WebElement aboutus = driver.findElement(By.xpath("//a[text()='About us']"));
		    
		   JavascriptExecutor js =((JavascriptExecutor)driver);
		   js.executeScript("arguments[0].scrollIntoView(true);",aboutus);
		   
	}

}
