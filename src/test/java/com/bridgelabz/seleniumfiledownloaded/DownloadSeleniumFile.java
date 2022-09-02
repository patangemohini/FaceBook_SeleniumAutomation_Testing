package com.bridgelabz.seleniumfiledownloaded;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DownloadSeleniumFile {
    @Test
    public void downloadSeleniumFile() throws InterruptedException {
    	
    	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.selenium.dev/downloads/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.4.0/selenium-server-4.4.0.jar']")).click();
        Thread.sleep(3000);
        driver.close();

    }
}