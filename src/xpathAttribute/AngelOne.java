package xpathAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AngelOne
{
	public static void main(String[] args) 
	{
			System.setProperty("webdriver.chrome.driver", 
					"E:\\\\download software\\\\chromedriver_win32\\\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trade.angelbroking.com/Login");
		
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUserID']"));
		username.sendKeys("M796414");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='txtTradingPassword']"));
		pass.sendKeys("Mangesh@123");
		
		WebElement loginbtn = driver.findElement(By.xpath("//a[@id='loginBtn']"));
		loginbtn.click();
		
		WebElement markettab = driver.findElement(By.xpath("//a[@id='mnMarkets']"));
		markettab.click();
		
	}
}
