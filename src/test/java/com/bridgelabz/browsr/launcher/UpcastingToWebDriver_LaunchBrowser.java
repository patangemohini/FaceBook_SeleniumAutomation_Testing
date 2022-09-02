package com.bridgelabz.browsr.launcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UpcastingToWebDriver_LaunchBrowser {

	@Test
	public static void upcastingToWebDriver_LaunchBrowser() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		
		webdriver.get("https://www.facebook.com/");
		String title = webdriver.getTitle();
		System.out.println("the title of page the is:" + title);
		String currentUrl = webdriver.getCurrentUrl();
		
		System.out.println("the url of page the is:" + currentUrl);
		String pageSource = webdriver.getPageSource();
		
		System.out.println("the source code of the page is:" + pageSource);
		Thread.sleep(2000);
		String windowHandle = webdriver.getWindowHandle();
		
		System.out.println("the windowhandle of the page is:" + windowHandle);
	    Options manage = webdriver.manage();
	    
	    System.out.println("the option of the page is:" + manage);
	    Navigation navigate = webdriver.navigate();
	    
	    System.out.println("the navigate of the page is:" + navigate);
	    Thread.sleep(2000);
	    webdriver.close();
	}
}