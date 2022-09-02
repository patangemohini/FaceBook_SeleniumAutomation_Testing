package com.bridgelabz.takescreenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CaptureScreenshot_FaceBookPage {

	@Test
	public static void CaptureScreenshotFaceBookPage() throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		Date d = new Date(0);

		String date1 = d.toString();
		System.out.println(date1);

		String date2 = date1.replaceAll(":", "_");
		System.out.println(date2);

		webdriver.get("https://www.facebook.com/");

		TakesScreenshot takesScreenshot = (TakesScreenshot) webdriver;

		File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

		File destFile = new File(".\\screenshot\\" + date2 + "__FacebookLoginPage.png");

		FileUtils.copyFile(srcFile, destFile);

		webdriver.close();
	}
}