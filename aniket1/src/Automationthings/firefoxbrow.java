package Automationthings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxbrow {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\Desktop\\selenium all jar\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
	}

}
