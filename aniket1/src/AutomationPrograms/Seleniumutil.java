package AutomationPrograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Seleniumutil {
	         
	  // this is utility class
	  // All one time activity will be declared over here.No commonlogic/website action
	 // whenever you design the method consider user inputs
	
	
     public static void borderbyJS(WebDriver driver,WebElement element) {
    	  JavascriptExecutor js = ((JavascriptExecutor)driver);
    	  js.executeScript("arguments[0].style.border='3px solid red'",element);
      }
	
	 public static String titleByJS(WebDriver driver) {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title;").toString();
		 return title;
	  }
	     
	 public static void ClickbyJS(WebDriver driver,WebElement element) {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].click();", element);
	  }
	    
	public static void alertbyJS(WebDriver driver,String message) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
   	  }
	
   	public static void refreshByJS(WebDriver driver) {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	  }
	
	 public static void scrollDownJS(WebDriver driver,int x,int y) {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("scroll("+x+","+y+")");
	  }
	
	 public static void scrrollUpJS(WebDriver driver,int x,int y) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll("+x+","+y+")");
	  }
	  
	 public static void scrollIntoView(WebDriver driver,WebElement element) {
		 JavascriptExecutor js =((JavascriptExecutor)driver);
		 js.executeScript("arguments[0],scrollIntoView(true);",element);
	 }
     	
	
	
	
	
	
	
	
	
	

}
