package stepdefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Steps {
	
	@Given("^user launches the application$")
	public void user_launches_the_application() throws Throwable {
	    System.out.println("Hi!! first scenario");
	}

	
	@And("^user launches the second application$")
	public void user_launches_the_second_application() throws Throwable {
		   
		System.out.println("Hi!! second scenario"); 
	}
	
	
	@Given("^user launches the third application$")
	public void user_launches_the_third_application() throws Throwable {
	   
		System.out.println("Hi!! third scenario");
		
	}
	
	
	
	
	
	@Given("^user clicks ok$")
	public void user_clicks_ok() throws Throwable {
	   System.out.println("Executed after background ");
	}
}
