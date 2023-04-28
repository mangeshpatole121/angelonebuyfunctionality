package com.Project.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Project.POMclasses.LoginPOMClass;
import com.Project.UtilityClasses.ScreenShotCode;

public class TestBseClass {
	WebDriver driver;
	
	
	@Parameters("BrowserName")
	@BeforeMethod
	public void setup(String BrowserName) throws IOException
	{	if(BrowserName.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\download software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("chromeBrowser is opened");
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", 
					"E:\\download software\\chromedriver_win32\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("FirefoxBrowser is opened");
		
			System.out.println("shows Error");
		}
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
				
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		//loginActivity
		LoginPOMClass lp = new LoginPOMClass(driver);
		lp.sendUsername();
		System.out.println("username is entered");
		
		lp.sendPassword();
		System.out.println("password is entered");
		
		lp.clickLoginButton();
		System.out.println("loginButton is clicked");
		ScreenShotCode.methodScreenshot(driver);
		//HomePage
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		
		System.out.println("browser is closed");
	}
}
