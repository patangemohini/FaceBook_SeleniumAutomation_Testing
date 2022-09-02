package com.bridgelabz.runseleniumcodewithdiffrrenetbrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.Scanner;

public class RunSeleniumCodeInDiffBrowser {

    public void runSeleniumCodeInDiffBrowser() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("if you want to run the code on firefox, press 1");
        System.out.println("if you want to run the code on chrome, press 2");
        System.out.println("Enter your choice : ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
            	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        		WebDriver webdriver = new FirefoxDriver();

                webdriver.get("https://www.facebook.com/");
                webdriver.manage().window().maximize();
                webdriver.findElement(By.name("email")).sendKeys("patangemohini5@gmail.com");
                Thread.sleep(2000);
                webdriver.findElement(By.name("pass")).sendKeys("Mohini@123");
                Thread.sleep(2000);
                webdriver.findElement(By.name("login")).click();
                Thread.sleep(2000);
                webdriver.close();
                break;
            case 2:
            	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        		WebDriver driver = new ChromeDriver();
        		driver.get("https://www.facebook.com/");
                driver.manage().window().maximize();
                driver.findElement(By.name("email")).sendKeys("patangemohini5@gmail.com");
                Thread.sleep(2000);
                driver.findElement(By.name("pass")).sendKeys("Mohini@123");
                Thread.sleep(2000);
                driver.findElement(By.name("login")).click();
                Thread.sleep(2000);
                driver.close();
                break;
            default:
                System.out.println(" invalid");
                break;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RunSeleniumCodeInDiffBrowser runSeleniumcodeInDiffBrowser = new RunSeleniumCodeInDiffBrowser();
        runSeleniumcodeInDiffBrowser.runSeleniumCodeInDiffBrowser();
    }
}