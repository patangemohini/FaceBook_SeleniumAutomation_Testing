package com.bridgelabz.javaexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollUpandDowntospecificElementonWebpage {

	@Test
	public static void scrollUpandDowntospecificElementonWebpage() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumhq.org/download");

		WebElement ele = driver.findElement(By.xpath("//img[@alt='BrowserStack']"));

		int x = ele.getLocation().getX();

		int y = ele.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ")");
		Thread.sleep(3000);
	}

	@Test
	public static void scrollUpandDownFaceBookWebpage() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");


		WebElement ele = driver.findElement(By.xpath("//a[@title='Visit our contact uploading and non-users notice.']"));

		int x = ele.getLocation().getX();

		int y = ele.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ")");
		Thread.sleep(3000);
		driver.close();
	}
}