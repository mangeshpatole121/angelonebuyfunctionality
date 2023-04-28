package captureScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FlipkartScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{

		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\download software\\\\chromedriver_win32\\\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	TakesScreenshot tc =(TakesScreenshot)driver;
	File source = tc.getScreenshotAs(OutputType.FILE);
	File destination = new File("G:\\velocity classes\\ScreenShots\\browerOpened.png");
	FileHandler.copy(source, destination);
	System.out.println("brower is opened");
	String actualURL = driver.getCurrentUrl();
	System.out.println(actualURL);
	Thread.sleep(5000);
	
	WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
	username.sendKeys("7057422643");
	Thread.sleep(3000);
	TakesScreenshot tc1 =(TakesScreenshot)driver;
	File source1 = tc1.getScreenshotAs(OutputType.FILE);
	File destination1 = new File("G:\\velocity classes\\ScreenShots\\username.png");
	FileHandler.copy(source1, destination1);
	System.out.println("username is filled");
	
	WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
	password.sendKeys("mangesh@123");
	TakesScreenshot tc2 =(TakesScreenshot)driver;
	File source2 = tc2.getScreenshotAs(OutputType.FILE);
	File destination2 = new File("G:\\velocity classes\\ScreenShots\\password.png");
	FileHandler.copy(source2, destination2);
	System.out.println("passward is filed");
	
	WebElement loginbtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
	loginbtn.click();
	Thread.sleep(2000);
	TakesScreenshot tc3 =(TakesScreenshot)driver;
	File source3 = tc3.getScreenshotAs(OutputType.FILE);
	File destination3 = new File("G:\\velocity classes\\ScreenShots\\flipkarthomepage.png");
	FileHandler.copy(source3, destination3);
	System.out.println("home page is opened");
	Thread.sleep(2000);
		
//	WebElement mensTshirts=driver.findElement(By.xpath("<a class=\"_6WOcW9 _3YpNQe\" href=\"https://www.flipkart.com/mens-tshirts/pr?sid=clo,ash,ank,edy&amp;fm=neo%2Fmerchandising&amp;iid=M_837f92f3-fc42-4299-8340-0c30c7c9b3f9_1_372UD5BXDFYS_MC.IF56C41VGEYS&amp;otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear~Men%2527s%2BT-Shirts_IF56C41VGEYS&amp;otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&amp;cid=IF56C41VGEYS\">Men's T-Shirts</a>"));
//	mensTshirts.click();
	TakesScreenshot takescrshot=(TakesScreenshot)driver;
	File sourceORbuffer = takescrshot.getScreenshotAs(OutputType.FILE);
	File destinationORlocal = new File("G:\\velocity classes\\ScreenShots\\mensTshirtSection.jepg");
//	FileHandler.copy(sourceORbuffer,destinationORlocal);
	FileHandler.copy(sourceORbuffer, destinationORlocal);
	
	WebElement mensTshirts=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[2]"));
	mensTshirts.click();
	
	
	
	}	
	
	
	
}
