package com.bridgelabz.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NameLocators {

	@Test
	public static void nameLoginPageLocatorsDemo() throws InterruptedException {

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
	}
	
	
	@Test
	public static void nameRegistrationLocatorsDemo() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.manage().window().maximize();
		webdriver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);

		webdriver.findElement(By.name("firstname")).sendKeys("Mohini");
		Thread.sleep(2000);

		webdriver.findElement(By.name("lastname")).sendKeys("Patange");
		Thread.sleep(2000);

		webdriver.findElement(By.name("reg_email__")).sendKeys("Patangemohini5@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.name("reg_email_confirmation__")).sendKeys("Patangemohini5@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.name("reg_passwd__")).sendKeys("Mohini@123");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_day")).sendKeys("30");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_month")).sendKeys("July");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_year")).sendKeys("1999");
		Thread.sleep(2000);

		webdriver.findElements(By.name("sex")).get(0).click();
		Thread.sleep(2000);

		webdriver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		webdriver.close();
	}
	
	@Test
	public static void xPathLoginPageLocatorsDemo() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.manage().window().maximize();

		webdriver.findElement(By.xpath("//*[@name='email']")).sendKeys("patangemohini5@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//*[@name='pass']")).sendKeys("Mohini@123");
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
	}

	@Test
	public static void xPathRegistrationLocatorsDemo() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.manage().window().maximize();
		webdriver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Mohini");
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Patange");
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("Patangemohini5@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("Patangemohini5@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("Mohini@123");
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//*[@name='birthday_day']")).sendKeys("30");
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//*[@name='birthday_month']")).sendKeys("July");
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//*[@name='birthday_year']")).sendKeys("1999");
		Thread.sleep(2000);

		webdriver.findElements(By.xpath("//input[@value='1']")).get(0).click();
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(2000);
		webdriver.close();
	}
    
    @Test
	public static void cssSelectorLoginPageLocatorsDemo() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.manage().window().maximize();

		webdriver.findElement(By.cssSelector("#email")).sendKeys("patangemohini5@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.cssSelector("#pass")).sendKeys("Mohini@123");
		Thread.sleep(2000);
		webdriver.findElement(By.cssSelector("#loginbutton")).click();
		Thread.sleep(2000);
	}
    
    @Test
    
    public static void cssSelectorRegistrationLocatorsDemo() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.manage().window().maximize();
		webdriver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);

		webdriver.findElement(By.cssSelector("#u_2_b_rU")).sendKeys("Mohini");
		Thread.sleep(2000);

		webdriver.findElement(By.cssSelector("#u_2_d_l2")).sendKeys("Patange");
		Thread.sleep(2000);

		webdriver.findElement(By.cssSelector("#u_2_g_eM")).sendKeys("Patangemohini5@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.cssSelector("#u_2_j_Y6")).sendKeys("Patangemohini5@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.cssSelector("#password_step_input")).sendKeys("Mohini@123");
		Thread.sleep(2000);

		webdriver.findElement(By.cssSelector("#day")).sendKeys("30");
		Thread.sleep(2000);

		webdriver.findElement(By.cssSelector("#month")).sendKeys("July");
		Thread.sleep(2000);

		webdriver.findElement(By.cssSelector("#year")).sendKeys("1999");
		Thread.sleep(2000);

		webdriver.findElements(By.cssSelector("label[for='u_2_4_ex']")).get(0).click();
		Thread.sleep(2000);

		webdriver.findElement(By.cssSelector("#u_2_s_aj")).click();
		Thread.sleep(2000);
		webdriver.close();
	}
	
}
