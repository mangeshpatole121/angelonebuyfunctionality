package captureScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AngelOneWithSS {
	
		static WebDriver driver;
		static void methodScreenshot() throws IOException
		{	
			Date date = new Date();
			DateFormat date1 = new SimpleDateFormat("dd-MM-yy & HH-mm-ss");
		    String date2=date1.format(date);
		    		    
			TakesScreenshot tc1 =(TakesScreenshot)driver;
			File source =tc1.getScreenshotAs(OutputType.FILE);
			File destination = new File("G:\\velocity classes\\ScreenShots\\loginpage"+date2+".png");
			FileHandler.copy(source, destination);
			System.out.println("screenshot is taken");
			
		}
		public static void main(String[] args) throws InterruptedException, IOException 
		{
			System.setProperty("webdriver.chrome.driver", 
					"E:\\\\download software\\\\chromedriver_win32\\\\chromedriver.exe");
			
		 driver = new ChromeDriver();
		 System.out.println("brower is opened");
		driver.manage().window().maximize();
		driver.get("https://trade.angelbroking.com/Login");
		WebDriverWait explctwait = new WebDriverWait(driver,Duration.ofSeconds(60));
		
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		System.out.println("url is Entered");
	
		methodScreenshot();
		String actualURL = driver.getCurrentUrl();
		System.out.println("actual url is ="+actualURL);
		String urlRecieved=" URL Given =https://trade.angelbroking.com/Login"; 
		if(actualURL.equals(urlRecieved))
		{
			System.out.println("url is which is given, is valid ");
		}	
		String titleName = driver.getTitle();
		System.out.println("actual titleName="+titleName);
		System.out.println("given tileName = angel one");

		WebElement username=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/ul/li[1]/div/div[1]/input[1]"));
		username.sendKeys("M796414");
		methodScreenshot();
		
		System.out.println("username is accepted");
		WebElement password=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/ul/li[3]/div/div[1]/input"));
		password.sendKeys("Mangesh@123");
		methodScreenshot();
		System.out.println("password is accepted");

		WebElement LOGINBTN=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/a"));
		LOGINBTN.click();
		
		methodScreenshot();
		System.out.println("we are onn the homepage");
		
		methodScreenshot();
		
		WebElement popup=driver.findElement(By.xpath("/html/body/div[3]/div[5]/div/button"));
		popup.click();
						
		WebElement searchbtn=driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/ul[2]/li[2]/div/a"));
		searchbtn.click();
	
		
		WebElement searchBox=driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/ul[2]/li[2]/div/form/div/input"));
		searchBox.sendKeys("Idea");
	
		System.out.println("symbol is selected here idea");
		
		WebElement watchlist=driver.findElement(By.xpath("//a[@class='watchlistA']"));
		watchlist.click();
		
		methodScreenshot();
		System.out.println("clicked on the watchlist");
		
		WebElement searchit=driver.findElement(By.xpath("//input[@id='project']"));
		searchit.sendKeys("TCS");			
		System.out.println("tcs is searched as a stock");
			
		methodScreenshot();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.click(searchit).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		//		WebElement ideasymbol=driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
//		ideasymbol.click();
			
		System.out.println("idea is selected as a share to buy");
		methodScreenshot();
		
		WebElement buyidea=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[1]/div/div[2]/div/div/a[1]"));
		buyidea.click();
		
		methodScreenshot();
		System.out.println("clicked on the buy button");
		
		WebElement submitStockinfo=driver.findElement(By.xpath("//button[@id='btnOrderPadSubmit']"));
		submitStockinfo.click();
		
		methodScreenshot();
		
		WebElement confirmbtn=driver.findElement(By.xpath("//button[@id='btnConfrimBuySellPop']"));
		confirmbtn.click();
		System.out.println("clicked on confirm");
		//screenshot nmr 11
		methodScreenshot();
		
		}
	


}
