package captureScreenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Angellone {

		public static void main(String[] args) 
		{

			System.setProperty("webdriver.chrome.driver", 
					"E:\\\\download software\\\\chromedriver_win32\\\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		 System.out.println("brower is opened");
		driver.manage().window().maximize();
		driver.get("https://trade.angelbroking.com/Login");
		WebDriverWait explctwait = new WebDriverWait(driver,Duration.ofSeconds(60));
		
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		System.out.println("url is Entered");
	
	
		String actualURL = driver.getCurrentUrl();
		System.out.println("actual url is ="+actualURL);
		String urlRecieved=" URL Given =https://trade.angelbroking.com/Login"; 
		if(actualURL.equals(urlRecieved))
		{
			System.out.println("url is which is given, is valid ");
		}	
		
		
		}
}
