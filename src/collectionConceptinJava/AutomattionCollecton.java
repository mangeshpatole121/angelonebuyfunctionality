package collectionConceptinJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class AutomattionCollecton {
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\download software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		WebElement passwordd = driver.findElement(By.xpath("//input[@id='password']"));
		passwordd.sendKeys("secret_sauce");
		WebElement loginbtn = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbtn.click();
		
		
		List<WebElement> addToCart =driver.findElements(By.xpath("//button[text()='Add to cart']"));
		Thread.sleep(3000);
		for (int i=0;i<addToCart.size();i++)
		{
			addToCart.get(i).click();
		}
		System.out.println("all the items are in the list");
		
		
		
		
		
	}

}
