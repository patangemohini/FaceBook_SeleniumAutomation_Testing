package com.bridgelabz.navigation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserNavigationExample {
	
	@Test
	public static void browserNavigationExample() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		
		webdriver.get("https://www.facebook.com/");
		webdriver.navigate().to("http://www.gmail.com");
		Thread.sleep(3000);
		
		webdriver.navigate().back();
		Thread.sleep(3000);
		
		webdriver.navigate().forward();
		Thread.sleep(3000);
		
		webdriver.navigate().refresh();
		webdriver.close();
	}
}