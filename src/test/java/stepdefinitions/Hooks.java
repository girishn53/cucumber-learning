
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
	
	
//	
//	@Before("@Prod")
//
//	public void starting() {
//
//		System.out.println("I will execute before every scenario in prod");
//	}
//
//	@After("@Prod")
//
//	public void stopping() {
//
//		System.out.println("I will execute after every scenario");
//	}

}
