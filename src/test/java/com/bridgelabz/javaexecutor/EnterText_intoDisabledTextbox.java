package com.bridgelabz.javaexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class EnterText_intoDisabledTextbox {

	@Test

	public static void disabledTextBox() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("file:///C:/Selenium/javaexcecutor.html");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);

		js.executeScript("document.getElementById('t1').value='admin'");
		js.executeScript("document.getElementById('t2').value=''");
		js.executeScript("document.getElementById('t2').value='manager'");

		js.executeScript("document.getElementById('t2').type='button'");
		driver.close();
	}
}