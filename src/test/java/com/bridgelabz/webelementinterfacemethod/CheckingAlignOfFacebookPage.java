package com.bridgelabz.webelementinterfacemethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckingAlignOfFacebookPage {

    @Test
    public void verifyFB_UNandPWDfieldsAreAligned_intheSameRow(){
    	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/");
        WebElement unTB = driver.findElement(By.id("email"));
        int username_Ycordinate = unTB.getLocation().getY();
        System.out.println(username_Ycordinate);
        WebElement pwdTB = driver.findElement(By.name("pass"));
        int password_Ycordinate = pwdTB.getLocation().getY();
        System.out.println(password_Ycordinate);
        if (username_Ycordinate==password_Ycordinate) {
            System.out.println("Both username and password fields are displayed in the same row");
        }else{
            System.out.println("username and password fields are NOT aligned in the same row");
        }
        driver.close();
    }
}