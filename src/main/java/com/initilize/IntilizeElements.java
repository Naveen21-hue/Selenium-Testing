package com.initilize;

import org.openqa.selenium.support.PageFactory;

import com.base.TestCode;
import com.locators.LandingPage_Locators;
import com.locators.OrangeHrm_Locators;

public class IntilizeElements extends TestCode {
	
	public static void intilize_elemets() {
		PageFactory.initElements(driver, LandingPage_Locators .class);
		
		PageFactory.initElements(driver, OrangeHrm_Locators .class);
	}
	

}
