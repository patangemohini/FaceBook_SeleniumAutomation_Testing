package com.bridgelabz.robot;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class KeyboardMouseOperations {
	
	@Test
	public static void keyboardMouseOperations() throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);

		Robot robot = new Robot();

		robot.mouseMove(300, 500);

		robot.keyPress(KeyEvent.VK_ALT);

		robot.keyPress(KeyEvent.VK_F);

		robot.keyRelease(KeyEvent.VK_F);

		robot.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_W);

		robot.keyRelease(KeyEvent.VK_W);
		Thread.sleep(3000);

		webdriver.quit();
	}
}