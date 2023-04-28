package absoluteXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class Iframe 
{
	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver","E:\\download software\\chromedriver_win32\\chromedriver.exe");
		     
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(("https://chercher.tech/practice/frames-example-selenium-webdriver"));
			
			WebElement frameElement = driver.findElement(By.xpath("/html/body/div/div/div/div/div/iframe[2]"));
			driver.switchTo().frame(frameElement);
			
			WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
			dropdown.click();
			
			Select s = new Select(dropdown);
			s.selectByValue("big baby cat");
			Thread.sleep(3000);
		
			driver.switchTo().parentFrame();
			driver.findElement(By.xpath("//iframe[@id='frame1']"));
			driver.findElement(By.xpath("//html//body//input")).click();
	

		
			
	}


}