package com.bridgelabz.webelementinterfacemethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class EnterTextIntoTextField {

	@Test
	public void veryfyingEnteredTextDisplayedOrNot() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		driver.switchTo().activeElement().sendKeys("admin");
		driver.close();
	}
}