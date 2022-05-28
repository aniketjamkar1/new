package AutomationCustomizeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
      
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver ();
	   driver.get("https://www.facebook.com/");
	   
	   //customize xpths
	   
	 // 1  basic xpath
	  //tagname[@attribute='value']
	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9730561136");
	   
	   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("121214");
	
	// 2 text()
	//tagname[text()='value']
	
	   driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	
      driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));	
      
    // 3 containts()  
	//tagname[contains()@atribute='value']
	
	     //  driver.findElement(By.xpath("//input[contains(@placeholder,'address')]")).sendKeys("rdyrdr");
	 
	    //  driver.findElement(By.xpath("//input[contains(@type,'pas')]")).sendKeys("1511");

	  // 4. starts-with()   ==> if your attribute value is too long then you can take starting string.(first part)
		//tagname[starts-with(@ attribute,'value')]
	 
	      driver.findElement(By.xpath("//img[starts-with(@src,'https://static.x']"));
	  
	  //5. logical operators.  ==> 1. and 2. or
		// 1. and=> if both are true
		// if both the attributes for the element are present then you can use and operator
	    //tagname[@attribute1='value1' and @attribute2= 'value2']
	      
	      driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("13516181");
	      
	    // 2.or==> any one is true or select
	    // if atleast one attribute out of two is present
	     //tagname[@attribute1='value1' or @attribute2='vvalue2'] 
	      
	      driver.findElement(By.xpath("//input[@id='email' or @name='email']"));
	      
	      
	      
	      
	      
	      
	      
	      
	      
	}

}
