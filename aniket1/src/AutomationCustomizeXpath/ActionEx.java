package AutomationCustomizeXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEx {

	public static void main(String[] args) throws InterruptedException {

		   
		// drag and drop
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
//		driver.get("https://jqueryui.com/droppable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		 driver.switchTo().frame(frame);  
//		 
//		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement dropable = driver.findElement(By.xpath("//div[@id='droppable']"));
//		Thread.sleep(2000);
//		Actions action = new Actions(driver);
//		action.dragAndDrop(draggable, dropable).build().perform();
		
		
		// dragabel
		
//		driver.get("https://jqueryui.com/draggable/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		 driver.switchTo().frame(frame);
//		 
//		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']")); 
//		Actions action = new Actions(driver);
//		action.dragAndDropBy(drag, 120,150).build().perform();
		
		
		// right click
		
//		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement image = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
//		Actions action=new Actions(driver);
//		action.contextClick(image).build().perform();
		
		// sendkeys by using action
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
//		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
//		Actions action = new Actions(driver);
//		action.sendKeys(username, "aniket").build().perform();
//		action.keyDown(username, Keys.SHIFT).sendKeys("aniket").keyUp(Keys.SHIFT).build().perform();   // uppercase bu using shift key
//		action.sendKeys(password, "989595666").build().perform();
//		action.sendKeys(Keys.ENTER).build().perform();
		
		// click or double click
		
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement image = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
		WebElement space = driver.findElement(By.xpath("//td[@class='contentTd']/p[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(image).click().build().perform();
		Thread.sleep(2000);
		action.moveToElement(space).doubleClick(space).build().perform();
		
		
		
		
		
	}

}

