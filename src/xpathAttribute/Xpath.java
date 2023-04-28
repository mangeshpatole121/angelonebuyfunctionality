package xpathAttribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", 
				"E:\\download software\\chromedriver_win32\\chromedriver.exe");		
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.navigate().to("https://www.selenium.dev");
		Thread.sleep(10000);
		driver.navigate().to("https://www.twitter.com");
		driver.navigate().back();
		Thread.sleep(10000);
		driver.navigate().forward();
		Thread.sleep(10000);
		driver.manage().window().minimize();
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.close();
	}
}
