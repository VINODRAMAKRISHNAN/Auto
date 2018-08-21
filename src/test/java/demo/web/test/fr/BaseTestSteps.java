package demo.web.test.fr;


import demo.web.test.fr.component.*;
import org.testng.Assert;
import org.testng.annotations.*;

import cucumber.api.CucumberOptions;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import cucumber.api.testng.AbstractTestNGCucumberTests;


public class BaseTestSteps {
	public String APPURL=System.getProperty("appurl")==null?"https://webapp.astadia-taas.com":System.getProperty("appurl");
	public AppTestManager appTestManager=null;
	
	
	
	public void base_launch() {
		appTestManager = new AppTestManager();
	}
	
	
   
    public void base_cleanUp(){
    	if (appTestManager!=null) {
			appTestManager.closeTest();
		}
    }
    
	
	//############################## steps starts here ###############################
   
   
    public void base_i_am_using_app_url_in_browser_to_navigate_to_the_test_page(String targetbrowser) throws Throwable {
    	appTestManager.setBrowser(targetbrowser);
		appTestManager.initBrowser();
		if (System.getProperty("appurl") == null){
			System.out.println("ENVIRONMENT VARIABLE appurl IS NOT AVAILABLE");
		}
		System.out.println("Currently using app url:" + APPURL);
		appTestManager.navigateToTargetPage(APPURL);
    }

    
   
    public void base_i_have_entered_into_the_first_text_box(String firststring) throws Throwable {
    	appTestManager.enterFirstTextBox(firststring);
    }

    
   
    public void base_then_i_have_entered_into_the_second_text_box(String secondstring) throws Throwable {
    	appTestManager.enterSecondTextBox(secondstring);
    }

  
    
    public void base_i_press_concatenate_button() throws Throwable {
    	appTestManager.clickConcatenateButton();
    }

   
   
    public void base_the_result_should_be_on_the_third_text_box(String resultstring) throws Throwable {
    	appTestManager.validateThirdTextBox(resultstring);
		 String strout = appTestManager.getOutput();
		 String strin =resultstring;
		 Assert.assertEquals(strin, strout,"Result Not matching expected value, Method: the_result_should_be_on_the_third_text_box");
    }

    
  
 	//############################## steps ends here ###############################
}
