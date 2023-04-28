package xpathAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver"
				, "E:\\download software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&ref_%3Dnav_em_hd_clc_signin_0_1_1_32");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@id='ap_email']"));
		username.sendKeys("7057422643");
		Thread.sleep(3000);
		WebElement continueBtn = driver.findElement(By.xpath("//input[@id='continue']"));
		continueBtn.click();
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("mangesh@123");
		Thread.sleep(3000);
		WebElement loginBtn = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		loginBtn.click();
		Thread.sleep(3000);
		String title = 	driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("mobile");
		Thread.sleep(3000);
		WebElement searchbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbtn.click();
		Thread.sleep(3000);
		WebElement mobileclick = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		mobileclick.click();
		
		Thread.sleep(3000);
		WebElement addtoCartbtn = driver.findElement(By.xpath("//div[@id='nav-cart-text-container']"));
		addtoCartbtn.click();
		
		
		
	}
}
