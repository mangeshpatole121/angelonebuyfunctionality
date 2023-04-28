package absoluteXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\download software\\\\chromedriver_win32\\\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	String actualURL = driver.getCurrentUrl();
	System.out.println(actualURL);
	Thread.sleep(5000);
	WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
	username.sendKeys("7057422643");
	
	WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
	password.sendKeys("mangesh@123");
	
	WebElement loginbtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
	loginbtn.click();
	Thread.sleep(3000);
	WebElement searchbox = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
	searchbox.sendKeys("watch");
	
	WebElement searchbtn = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/button"));
	searchbtn.click();
	Thread.sleep(3000);
	WebElement watch = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a/div[1]/div/div/div"));
	watch.click();
	
	}
}
