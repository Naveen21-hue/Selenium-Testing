package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHrm_Locators {
	
	@FindBy(xpath="(//div[contains(@class,'orangehrm-demo-credentials')]/p)[1]")
	public static WebElement UernameText;
	
	@FindBy(xpath="(//div[contains(@class,'orangehrm-demo-credentials')]/p)[2]")
	public static WebElement PasswordText;
	
	@FindBy(name="username")
	public static WebElement UsernameEditBox ;
	
	@FindBy(name="password")
	public static WebElement PasswordEditBox ;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement login ;
	
	
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	public static WebElement Profilecart ;
	
	@FindBy(xpath="//a[text()='Logout']")
	public static WebElement logout ;
	
	//=====================personal details===========
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']/li[6]")
	public static WebElement myinfomenu ;
	
	@FindBy(name="firstName")
	public static WebElement firstnameEditBox ;
	
	@FindBy(name="lastName")
	public static WebElement lastnameEditBox ;
	
	@FindBy(xpath="(//label[text()='Employee Id']/following::input[@class='oxd-input oxd-input--active'])[1]")
	public static WebElement employeeid ;
	
	@FindBy(xpath="(//*[@type='submit'])[1]")
	public static WebElement saveButton ;

	
	
	
	

	
	
	

	
	
	

	
	
	
	

	

	
	

}
