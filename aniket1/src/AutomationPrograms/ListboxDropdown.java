package AutomationPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxDropdown {

	public static void main(String[] args) throws InterruptedException {
          
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement newacc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		newacc.click();
		Thread.sleep(2000);
		
	//	WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	//	Select s = new Select(day);//create object of select class and pass respective element
		//s.selectByIndex(25);       //value in index form
		Thread.sleep(2000);
		//s.selectByValue("26");        //exactly value in string
    //     s.selectByVisibleText("6");	//>text<	
		
		//get all element available in dropdown menu
         
         WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
          Select ss = new Select(year);
         List<WebElement> allyear = ss.getOptions();
          System.out.println("Total years of the list "+allyear.size());
//          for(int i=0;i<allyear.size();i++) {
//        	  String yy = allyear.get(i).getText();
//        	  System.out.println(i+" "+yy);
//          }
         
         // advance for loop
          int j=1;
          for(WebElement yy:allyear ) {
        	  System.out.println(j+" "+yy.getText());
        	  j++;
          }
         //check the default option / value
          WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month'] "));
          Select w = new Select(month);
         String firstmonth = w.getFirstSelectedOption().getText();
          System.out.println(firstmonth);
         
  		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select days = new Select(day);
       String dd = days.getFirstSelectedOption().getText();
		System.out.println(dd);
		
		
	}
 
}
