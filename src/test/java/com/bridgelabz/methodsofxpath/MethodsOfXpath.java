package com.bridgelabz.methodsofxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MethodsOfXpath {

	@Test
	public void containsMethodOfXpath() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("patangemohini5@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Mohini@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//span[contains(@class,'b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')]"))
				.click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void startsWithMethodOfXpath() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[starts-with(@name,'email')]")).sendKeys("patangemohini5@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("Mohini@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[starts-with(@name,'login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//span[starts-with(@class,'b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//span[starts-with(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')]"))
				.click();
		Thread.sleep(2000);
		driver.close();
	}
}