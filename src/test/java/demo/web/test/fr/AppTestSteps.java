package demo.web.test.fr;




import org.testng.annotations.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


 

public class AppTestSteps extends BaseTestSteps{
	
	
	
	@Before
    public void setUp(){
		this.base_launch();
	}
	
	@After
    public void cleanUp(){
    	this.base_cleanUp();
    }
    
	
	//############################## steps starts here ###############################
	@Test(priority=0)
	@Given("^I am using app url within (.+) browser to navigate to the Test page$")
    public void i_am_using_app_url_within_browser_to_navigate_to_the_test_page(String browsertarget) throws Throwable {
		this.base_i_am_using_app_url_in_browser_to_navigate_to_the_test_page(browsertarget);
    }
	
	@Test(priority=1)
    @And("^I have entered (.+) into the first text box$")
    public void i_have_entered_into_the_first_text_box(String firststring) throws Throwable {
    	this.base_i_have_entered_into_the_first_text_box(firststring);
    }

	@Test(priority=2)
    @And("^Then I have entered (.+) into the second text box$")
    public void then_i_have_entered_into_the_second_text_box(String secondstring) throws Throwable {
    	this.base_then_i_have_entered_into_the_second_text_box(secondstring);
    }

	@Test(priority=3)
    @When("^I press concatenate button$")
    public void i_press_concatenate_button() throws Throwable {
    	this.base_i_press_concatenate_button();
    }

	@Test(priority=4)
    @Then("^the result should be (.+) on the third text box$")
    public void the_result_should_be_on_the_third_text_box(String resultstring) throws Throwable {
    	this.base_the_result_should_be_on_the_third_text_box(resultstring);
    }
}
