package Automationthings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\Desktop\\selenium all jar\\edgedriver_arm64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

}


