package collectionConceptinJava;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FlipkaartCollectn {
    	
	public static void main(String[] args) throws InterruptedException, IOException {
				
		System.setProperty("webdriver.chrome.driver", 
				"E:\\\\download software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
	
		WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		username.sendKeys("7057422643");
		
		WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		password.sendKeys("mangesh@123");
		
		WebElement loginbtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
		loginbtn.click();
		
		
		Thread.sleep(2000);
		
		
		WebElement fasion = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[4]"));
		Actions act = new Actions(driver);
		act.moveToElement(fasion).perform();

		Thread.sleep(2000);
//		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();

		
		
		WebElement mensTshrt = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[2]"));
		mensTshrt.click();
	
		
		WebElement Tshirt = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[2]"));
		Tshirt.click();
	
		
		Set<String> newWindowaddress = driver.getWindowHandles();
		System.out.println(newWindowaddress);
		
		List<String> NewTabListadd=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(NewTabListadd);
		
		driver.switchTo().window(NewTabListadd.get(1));
		Thread.sleep(2000);
		WebElement add2cart = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
		add2cart.click();
		
		WebElement selectSize = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[5]/div/div[2]/div[1]/div/ul/li[3]/a"));
		selectSize.click();
		
		
		WebElement addedtocart = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
		addedtocart.click();
	
	}
}
