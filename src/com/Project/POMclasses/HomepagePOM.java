package com.Project.POMclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePOM 
{
	
		WebDriver driver;
		
		//settingButton
		@FindBy(xpath="//button[@id='react-burger-menu-btn']")
		private WebElement settingButton;
		
		public void clickSettingButton()
		{
			settingButton.click();
		}
		
		//logOut button
		@FindBy(xpath="//a[text()='Logout']")
		private WebElement logOutButton;
		
		public void clickLogOutButton()
		{
			logOutButton.click();
		}
		
		//bagButton
		@FindBy(xpath="(//button[text()='Add to cart'])[1]")
		private WebElement bagButton;
		
		public void clickBagButton()
		{
			bagButton.click();
		}
		
		//addToCartButton
		@FindBy(xpath="//a[@class='shopping_cart_link']")
		private WebElement addToCartButton;
		
		public String getTextFromAddToCart()
		{
			String totalProducts= addToCartButton.getText();
			return totalProducts;
		}
		
		
		//allProduct Elements
		@FindBy(xpath="//button[text()='Add to cart']")
		private List<WebElement>allProducts;
		
		public void clickAllProducts()
		{
//			allProducts.get(0).click();
//			allProducts.get(1).click();
//			allProducts.get(2).click();
//			allProducts.get(3).click();
//			allProducts.get(4).click();
//			allProducts.get(5).click();
			
			//or
			
//			for(inti=0; i<allProducts.size();i++)
//			{
//				allProducts.get(i).click();
//			}
			
			//assignment--forloop-singlw products
			//List-collection concept
			//for no suitable
			//for each loop--> use 
			//youtube/google
		}
		
		//constrctor
		public HomepagePOM (WebDriver driver)
		{
	        this.driver = driver;
			
			PageFactory.initElements(driver, this);
		}
		
		
		
		
		
		
		
		
		


}
