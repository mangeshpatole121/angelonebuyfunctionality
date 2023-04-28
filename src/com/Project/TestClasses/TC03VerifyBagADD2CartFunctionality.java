package com.Project.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Project.POMclasses.HomepagePOM;
import com.Project.POMclasses.LoginPOMClass;

public class TC03VerifyBagADD2CartFunctionality extends TestBseClass
{
	@Test
	public void verifyAddtoCart()
	{				
		//homePage
		HomepagePOM hp = new HomepagePOM(driver);
		hp.clickBagButton();
		System.out.println("clicked on Bag Button");
		
		//validation
		//addToCart-text-->getText
		
		String expectedCount = "1";  //given
		String actualCount= hp.getTextFromAddToCart();
		
		Assert.assertEquals(actualCount, expectedCount);
		
		
		
		
	}


}
