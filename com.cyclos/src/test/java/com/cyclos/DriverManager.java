package com.cyclos;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class DriverManager {
	public static WebDriver driver;

	public static WebDriver getDriver(String browser) {
		if(browser=="chrome") {
			driver = new ChromeDriver();
		}else if(browser=="firefox") {
			driver = new FirefoxDriver();
		}else {
			Assert.fail("Browser is not opened:" +browser);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
		driver.manage().deleteAllCookies();

		return driver;
	}

	public static WebDriver closeDriver() {
		driver.quit();

		return driver;
	}

}
