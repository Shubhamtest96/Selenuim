package MULTIPLETESTCASE;

import org.testng.annotations.Test;

public class signup {
	
	
	// Regression group 
	@Test(priority = 1 , groups = {"regression"})
	void signupbyemail() {
		System.out.println ("this is signup by email" ) ; 
	}
	@Test(priority = 2  ,  groups = {"regression"})
	void signupbyfacebook() {
		System.out.println ("this is signup by fb") ; 
	}

	@Test(priority = 3 ,  groups = {"regression"})
	void signupbyTwitter() {
		System.out.println ("this is signup by x") ; 
	}
}
