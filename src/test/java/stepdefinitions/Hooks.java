
package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

@Before
public void start() {

		System.out.println("I will execute before every scenario---BeforeHook");
	}

@After
public void stop() {
		System.out.println("I will execute after every scenario in prod--AfterHook");
	}
	
	
	
	@Before("@third3")

	public void starting() {

		System.out.println("I will execute only before third scenario");
	}

	@After("@third3")

	public void stopping() {

		System.out.println("I will execute only after third scenario");
	}

}
