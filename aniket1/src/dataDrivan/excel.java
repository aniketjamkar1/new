package dataDrivan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excel {
	
	          public static void main(String[] args) {
	           
	        	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\Chrome_100 V\\chromedriver.exe");
	        	  WebDriver driver = new ChromeDriver();
	        	  driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
	        	  driver.manage().window().maximize();
	        	  
	        	  //input[@name='principal'] for principal
	        	  //input[@name='interest'] rate of intrest
	        	//input[@name='tenure']   period
	        	//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif'] caculate
	        	  
	        	  
	        	  
			}

}
