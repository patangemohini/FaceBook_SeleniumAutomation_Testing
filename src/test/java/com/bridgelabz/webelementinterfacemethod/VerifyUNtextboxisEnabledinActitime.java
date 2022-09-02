package com.bridgelabz.webelementinterfacemethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyUNtextboxisEnabledinActitime {
    @Test
    public void verifyUNtextboxisEnabledinActitime(){
    	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        WebElement UN = driver.findElement(By.id("email"));
        if (UN.isEnabled()) {
            System.out.println("Username text box is enabled");
        }else {
            System.out.println("Username text box is disabled");
        }
        driver.close();

    }
}