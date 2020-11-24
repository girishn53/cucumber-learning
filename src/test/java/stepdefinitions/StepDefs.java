package stepdefinitions;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefs {
	
	
	@Given("^I login to website$")
	public void i_login_to_website() throws Throwable {
		
		System.out.println("");
	   
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String arg1, String arg2) throws Throwable {
	 
		System.out.println("username "+arg1 +" password is "+arg2);
		
	}
	
	@When("^user selects the age category$")
	public void user_selects_the_age_category(DataTable table) throws Throwable {
	 
		
		List<Map<String, String>> data=table.asMaps(String.class, String.class);
		
		System.out.println("Heyaaa .....  "+data.get(0).get("age"));
		System.out.println("Heyaaa .....  "+data.get(0).get("location"));
	}

}
