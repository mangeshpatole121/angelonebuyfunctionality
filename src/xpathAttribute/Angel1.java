
	package xpathAttribute;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Angel1
	{
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", 
					"E:\\\\download software\\\\chromedriver_win32\\\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trade.angelbroking.com/Login");
		
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		
		WebElement userid = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		userid.sendKeys("M79641");
		
		WebElement PASSWORD = driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
		PASSWORD.sendKeys("Mangesh@123");
		
		WebElement loginbtn = driver.findElement(By.xpath("(//a[@class='btn btn-filled full-width loading-btn'])[1]"));
		loginbtn.click();
		
		
		}
	

}
