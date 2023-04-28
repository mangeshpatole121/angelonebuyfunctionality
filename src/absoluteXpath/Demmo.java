package absoluteXpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demmo {
	public static void main(String aarg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\download software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(100);
		driver.manage().window().maximize();
		driver.get("https://trade.angelone.in/");
	}
	

}
