package MULTIPLETESTCASE;

import org.testng.annotations.Test;

public class logintest {

	
	//sanity group 
	@Test(priority = 1  , groups = {"sanity"})
 void loginemail () {
	 System.out.println("login via email");
 }
	@Test(priority = 2 , groups = {"sanity"})
 void logibyFacebook () {
	 System.out.println("login via FB");
 }
	
	@Test(priority = 3 , groups = {"sanity"})
 void logibyTwiter () {
	 System.out.println("login via x");
 }
}
