package definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step {
	@Given("^I vist www\\.gamil\\.com$")
	public void i_vist_www_gamil_com()  {
	   System.out.println("A");
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password()  {
	   
		 System.out.println("B");
	}

	@Then("^I logout of page$")
	public void i_logout_of_page()  {
	    
		 System.out.println("C");
	}



}
