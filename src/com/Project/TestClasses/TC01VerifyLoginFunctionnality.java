package com.Project.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Project.POMclasses.LoginPOMClass;
import com.Project.UtilityClasses.ScreenShotCode;

public class TC01VerifyLoginFunctionnality extends TestBseClass {

	@Test
	public void verifyLogin() throws IOException 
	{
		//Validation
        String expectedTitle = "Swag Labs";	   //given	
		String actualTitle = driver.getTitle();  //actual
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
	}

	
	
}
