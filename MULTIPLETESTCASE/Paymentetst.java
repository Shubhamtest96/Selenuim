package MULTIPLETESTCASE;

import org.testng.annotations.Test;

public class Paymentetst {
	
	
	// both sanity & regression < Functional 
@Test(priority =1 , groups = {"sanity"  , "regression" , "functional"} ) 
void payment () {
	System.out.println("this is paymnet in rs") ;
}
@Test(priority = 2 , groups = {"sanity", "regression" , "functional"})
void paymentindollars () {
	System.out.println("this is paymnet in bucks ") ;
}
}
