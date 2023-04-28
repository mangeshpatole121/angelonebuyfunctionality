package captureScreenshot;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
//import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
//import java.util.Date;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SSrepeated 
{
	
	static WebDriver driver;
	static void screenshot() throws IOException
	{
//		date and time format
		Date date = new Date();
		DateFormat date1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date2 =date1.format(date);
		
		TakesScreenshot tc = (TakesScreenshot)driver;
		File sourceFile = tc.getScreenshotAs(OutputType.FILE);
	    File destinationfile = new File("G:\\velocity classes\\ScreenShots\\loginpage"+date2+".png");
		FileHandler.copy(sourceFile, destinationfile);
		System.out.println("screenshot is taken");
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
	
	 System.setProperty("webdriver.chrome.driver","E:\\download software\\chromedriver_win32\\chromedriver.exe");
	     
	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trade.angelbroking.com/Login");
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
	screenshot(); 
		   
		
	WebElement username=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/ul/li[1]/div/div[1]/input[1]"));
	username.sendKeys("M796414");
	 
	WebElement password=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/ul/li[3]/div/div[1]/input"));
	password.sendKeys("Mangesh@123");
	
	WebElement LOGINBTN=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/a"));
	LOGINBTN.click();
//	Thread.sleep(3000);
	screenshot(); 
	WebElement popup=driver.findElement(By.xpath("/html/body/div[3]/div[5]/div/button"));
	popup.click();
	
	WebElement searchbtn=driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/ul[2]/li[2]/div/a"));
	searchbtn.click();
	
	WebElement searchBox=driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/ul[2]/li[2]/div/form/div/input"));
	searchBox.sendKeys("Idea");
	screenshot(); 
	}
}
