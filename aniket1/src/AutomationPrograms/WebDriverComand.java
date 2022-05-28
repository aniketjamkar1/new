package AutomationPrograms;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverComand {

	public static void main(String[] args) throws InterruptedException {
            
		 // launch the browser.
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		  
		 WebDriver driver = new ChromeDriver();
		 
		 //  to enter url.
		 driver.get("https://www.google.com/");
		 
		 //what is current url
		  String url = driver.getCurrentUrl();
		  System.out.println(url);
		
		  //to get title of the tab.
		  String expectedtitle="google";
		  String actualtitle = driver.getTitle();
		  System.out.println(actualtitle);
		  
		  if(expectedtitle.equalsIgnoreCase(actualtitle)) {
			  System.out.println("Testcase is passed");
		  }else {
			  System.out.println("Testcase is Failed");
		  }
	
		  // maximize the browser
		  driver.manage().window().maximize();
		  //you cannnot minimize the browser
		  
		  // navigate.
		  driver.navigate().to("https://www.facebook.com/");
		  Thread.sleep(2000);
		   driver.navigate().back();   // facebook back to google
		   Thread.sleep(2000);
		    driver.navigate().forward();  //back to facebook
		    Thread.sleep(2000);
		  // you can not minimize but you can set the size.(this is trial and error  i.e o/p not fix )
		    
		     Dimension d = new Dimension(200, 300);
		     
		     driver.manage().window().setSize(d);
		     Thread.sleep(2000);
		     //set the position on screen
		     
		       Point p = new Point(170, 300);
		       driver.manage().window().setPosition(p);
		       
		       Thread.sleep(3000);  //this is wait provide in millisecond to control the script execution speed.
		       
		       // to close the browser
		       
		       driver.close();   // will close current tab only
		    //   driver.quit();  // will close all the tabs.
		
	}

}
