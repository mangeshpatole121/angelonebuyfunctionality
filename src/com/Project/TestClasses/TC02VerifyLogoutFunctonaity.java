package com.Project.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Project.POMclasses.HomepagePOM;
import com.Project.POMclasses.LoginPOMClass;
import com.Project.UtilityClasses.ScreenShotCode;

public class TC02VerifyLogoutFunctonaity {
	

public class VerifyLogOutFunctionality extends TestBseClass
{	
	@Test
	public void verifyLogout() throws IOException 
	{
		
		//HomePage
		//settingBtn+logOutBtn-->HomePOM
		HomepagePOM hp= new HomepagePOM(driver);
		hp.clickSettingButton();
		System.out.println("clicked on setting button");
		
		hp.clickLogOutButton();
		System.out.println("clicked on logOut Button");
		ScreenShotCode.methodScreenshot(driver);

		//logout page
		//validation
		String expectedTitle = "Swag Labs";	   //given	
		String actualTitle = driver.getTitle();  //actual
			
			Assert.assertEquals(actualTitle, expectedTitle);
			
			
			
		
	}

}

}
