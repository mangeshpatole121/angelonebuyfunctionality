package alertPopUp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Alertpopup {
	public static void main(String[] args) throws IOException, InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\download software\\\\chromedriver_win32\\\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://vctcpune.com/");
	
	TakesScreenshot tc =(TakesScreenshot)driver;
	File source = tc.getScreenshotAs(OutputType.FILE);
	File destination = new File("G:\\velocity classes\\ScreenShots\\browerOpened.png");
	FileHandler.copy(source, destination);
	System.out.println("brower is opened");
	String actualURL = driver.getCurrentUrl();
	System.out.println(actualURL);
	Thread.sleep(2000);
		WebElement seleniumPractice = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		seleniumPractice.click();
		
		Set<String> addressofTabs = driver.getWindowHandles();
		System.out.println(addressofTabs);  
		
		List<String> allTAbsAddress=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(allTAbsAddress);
		
		driver.switchTo().window(allTAbsAddress.get(1));
		
		WebElement textboxy = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		textboxy.sendKeys("india");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1000)");
		
	
	    List<WebElement> tableHeaders = driver.findElements(By.xpath("//table//tbody//tr//th"));
	    System.out.println("table headerrs ="+tableHeaders.size());
	    
	    for(int i=0;i<tableHeaders.size();i++)
	    {
	    	System.out.println(tableHeaders.get(i).getText());
	    }
	    
	    
	   
	    List <WebElement> tabledata = driver.findElements(By.xpath("//table//tbody//tr//td"));
	    
	    System.out.println(tabledata.get(0).getText());
	    System.out.println(tabledata.size());
	    for(int i=0;i<tabledata.size();i++)
	    {
	    	System.out.println(tabledata.get(i).getText());
	    }
	    
	    System.out.println("this is it ");
//	    System.out.println("i did child pop up,acton on new window ,scoll down, table data using list concept practice");
	    
	    
	    
	    
	}

}
