package com.bridgelabz.javaexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollupAndDown {

	@Test
	public static void scrollUpAndDown() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumhq.org/download");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		for (int i = 1; i < 10; i++) {

			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(3000);
		}
		for (int i = 1; i < 10; i++) {

			js.executeScript("window.scrollBy(0, -1000)");
			Thread.sleep(3000);
			driver.close();
		}
	}
}
