package testcases;
import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.TestCode;
import com.initilize.IntilizeElements;
import com.pagemethods.LandingPage_PageMethod;

public class LinkedinTestCases extends TestCode{
	
	@Parameters({"browser","env"})
	@Test
	
	public static void signinValidation(String browser,String env) throws IOException, InterruptedException {
		initialize_environment( browser,env);//calling elements 
		IntilizeElements.intilize_elemets();//classname.methodname
		 LandingPage_PageMethod.navigateSigninPage();
		
		
		
		
		
	}

}
