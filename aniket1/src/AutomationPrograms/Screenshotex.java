package AutomationPrograms;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotex {

	public static void main(String[] args) throws IOException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\chromedriver _98 version\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
          File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            File destination = new File("C:\\Users\\Dell\\Desktop\\screenshot\\facebook.png");
             FileUtils.copyFile(src, destination);
	}

}
