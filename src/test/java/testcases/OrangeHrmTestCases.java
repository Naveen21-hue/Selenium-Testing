package testcases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.TestCode;
import com.initilize.IntilizeElements;
import com.pagemethods.LandingPage_PageMethod;
import com.pagemethods.OrangeHrm_PageMethods;

public class OrangeHrmTestCases extends TestCode {
	

	@Parameters({"browser","env"})
	@Test
	
	public static void checkLoginLogoutFunctionaliy(String browser,String env) throws IOException, InterruptedException  {
		initialize_environment( browser,env);//calling elements 
		IntilizeElements.intilize_elemets();//classname.methodname
		OrangeHrm_PageMethods.login();
		OrangeHrm_PageMethods.logout();
	}
	

	@Parameters({"browser","env"})
	@Test
	
	public static void updatePersonalDetails(String browser,String env) throws IOException, InterruptedException {
		initialize_environment( browser,env);//calling elements 
		IntilizeElements.intilize_elemets();//classname.methodname
		OrangeHrm_PageMethods.login();
		OrangeHrm_PageMethods.personalDetails(1,"Personaldetails");
		
		
		
	}	

}
