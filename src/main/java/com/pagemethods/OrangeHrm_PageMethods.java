package com.pagemethods;

import java.io.IOException;


import org.openqa.selenium.WebElement;

import com.locators.LandingPage_Locators;
import com.locators.OrangeHrm_Locators;
import com.utilities.ExcelReader;
import com.utilities.GenericMethods;

import com.utilities.WaitMethods;


public class OrangeHrm_PageMethods {
	
	public static void login() throws InterruptedException {
		
		WaitMethods.wait_for_element_present(OrangeHrm_Locators.UernameText); 
		GenericMethods.enter_text(OrangeHrm_Locators.UsernameEditBox, getUserName(), "username editbox");
		GenericMethods.enter_text(OrangeHrm_Locators.PasswordEditBox, getPassword(), "password editbox");
	    WaitMethods.wait_in_seconds(6);
	    GenericMethods.clickOnElement(OrangeHrm_Locators.login,"login");
	    WaitMethods.wait_in_seconds(5);
	    
	    
	}
     public static void logout() throws InterruptedException, IOException {
    	
    	 WaitMethods.wait_for_element_present(OrangeHrm_Locators.Profilecart); 
    	 GenericMethods.clickOnElement(OrangeHrm_Locators.Profilecart,"Profilecart");
    	 WaitMethods.wait_in_seconds(5);
    	 GenericMethods.clickOnElement(OrangeHrm_Locators.logout,"logout");
    	     }
     
     public static void personalDetails(int row,String sheetname) throws InterruptedException, IOException {
    	 
    	 ExcelReader.setExcelFile(System.getProperty("user.dir")+"\\TestData\\orangehrm.xlsx",sheetname);
    	 WaitMethods.wait_for_element_present(OrangeHrm_Locators.myinfomenu); 
    	 GenericMethods.clickOnElement(OrangeHrm_Locators.myinfomenu,"menu option");
    	 GenericMethods.enter_text(OrangeHrm_Locators.firstnameEditBox,ExcelReader.getData(row,"Firstname"), "firstnameEditBox");
    	 WaitMethods.wait_in_seconds(5);
    	 GenericMethods.enter_text(OrangeHrm_Locators.lastnameEditBox,ExcelReader.getData(row,"Lastname"), "lastnameEditBox");
       	 GenericMethods.enter_text(OrangeHrm_Locators.employeeid,ExcelReader.getData(row,"Employeeid"), "employeeid editbox");
       	 WaitMethods.wait_in_seconds(5);
    	 GenericMethods.clickOnElement_Using_JS(OrangeHrm_Locators.saveButton,"saveButton");
    	 WaitMethods.wait_in_seconds(5);
    	 
    	 
    	 
    	 
     }
     
     	
//extract username and password
  public static String getUserName() {
	  String[] text=OrangeHrm_Locators.UernameText.getText().split(" ");
	  return text[2];
	   
  }
  public static String getPassword() {
	  String[] text=OrangeHrm_Locators.PasswordText.getText().split(" ");
	  return text[2];
	  
	  
	  
	  
  }
  
}

