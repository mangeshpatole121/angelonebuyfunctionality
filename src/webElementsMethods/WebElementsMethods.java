package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {
	
	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","E:\\download software\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			System.out.println("brower is opened");
			driver.manage().window().maximize();
			
			driver.get("https://www.saucedemo.com/");
			System.out.println("website is opened");
			String actualURL = driver.getCurrentUrl();
			System.out.println(actualURL);
			WebElement username =driver.findElement(By.xpath("//input[@class='input_error form_input']"));
			username.sendKeys("standard_user");
			System.out.println("username is entered");
			String attribute = username.getAttribute("id");
			System.out.println(attribute);
			WebElement password =driver.findElement(By.xpath("//input[@name='password']"));
			password.sendKeys("secret_sauce");
			System.out.println("password id enterd");
			String tagname = password.getTagName();
			System.out.println("tagname is ="+tagname);
			
			String htmalText = password.getText();
			System.out.println("htmalText");
			WebElement loginn = driver.findElement(By.xpath("//input[@name='login-button']"));
			loginn.click();
//		    String attributevalue = loginn.getAttribute("id");
//			System.out.println(attributevalue);
			
			WebElement optionbtn = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button"));
			optionbtn.click();
			Thread.sleep(2000);
			WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
			logout.click();
			
			
		}
		}

	


