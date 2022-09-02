package com.bridgelabz.webelementinterfacemethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class VerifyErrorMessageOnActimelogInPage {
    @Test
    public void verifyErrorMessageOnActimeLoginPage() {
    	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("login")).click();
        WebElement errMsg = driver.findElement(By.xpath("//div[contains(@class,'_9ay7')]"));
        String errtext = errMsg.getText();
        System.out.println("error message is :" + errtext);
        driver.close();
    }
}