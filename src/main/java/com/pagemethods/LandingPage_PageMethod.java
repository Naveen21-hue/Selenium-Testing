package com.pagemethods;

import org.openqa.selenium.support.ui.Wait;

import com.locators.LandingPage_Locators;
import com.utilities.GenericMethods;
import com.utilities.WaitMethods;

public class LandingPage_PageMethod {
	
	public static void navigateSigninPage() throws InterruptedException {
		
		WaitMethods.wait_in_seconds(5);
		GenericMethods.clickOnElement(LandingPage_Locators.signinButton, "SigninButon");
		WaitMethods.wait_in_seconds(5);
	}

}
