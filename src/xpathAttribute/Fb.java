package xpathAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\download software\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	String actualURL = driver.getCurrentUrl();
	System.out.println(actualURL);
	
	WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
	username.sendKeys("mangeshpatole121@outlook.com");
	
	WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys("loveuap");
	
	WebElement loginbtn=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
	loginbtn.click();
	
	WebElement myProfile=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span"));
	myProfile.click();
	}

}
