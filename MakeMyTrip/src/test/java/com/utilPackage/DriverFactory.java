package com.utilPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.utilityClasses.FileUtility;

public class DriverFactory {
	public static ThreadLocal<WebDriver>  driver=new ThreadLocal();

	public static void setUpBrowser() throws Exception {
		FileUtility fileUtility=new FileUtility();

		String browserName1=fileUtility.getDataFromPropertiesFiles("browser");
	String url=fileUtility.getDataFromPropertiesFiles("url");
		if (browserName1.equals("chrome")) {
			ChromeOptions opt = new ChromeOptions();
			opt.setBinary("C:\\selenium\\chrome-win64\\chrome.exe");
			driver.set(new ChromeDriver(opt));
		} else if (browserName1.equals("edge")) {
			
			driver.set(new EdgeDriver());
		} else if (browserName1.equals("firefox")) {
//			FirefoxOptions opt=new FirefoxOptions();
//			opt.addArguments("--disable-notifications");
			FirefoxOptions opt=new FirefoxOptions();
			opt.addPreference("dom.webnotifications.enabled",false);
			driver.set(new FirefoxDriver(opt));

			
		} else {
			driver.set(new ChromeDriver());
		}
		driver.get().manage().window().maximize();
		driver.get().get(url);
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	public static WebDriver getDriver(){
		return driver.get();
	}
	
	public static void quitBrowser()
	{
//		if(driver!=null)
//		driver.get().quit();
	}
}
