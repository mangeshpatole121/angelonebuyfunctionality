package com.Project.TestClasses;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Project.POMclasses.HomepagePOM;
import com.Project.POMclasses.LoginPOMClass;

public class TC04VerifyMultipleProductAdd2CartFunction extends TestBseClass
{
	@Test
	public void verifyMultipleProduct() 
	{
		
		//homePage
		HomepagePOM hp = new HomepagePOM(driver);
		hp.clickAllProducts();
		System.out.println("all products are clicked");
		
		String expectedCount = "6";
		String actualCount =hp.getTextFromAddToCart();
		
		Assert.assertEquals(actualCount, expectedCount);
			
		
	}

}
