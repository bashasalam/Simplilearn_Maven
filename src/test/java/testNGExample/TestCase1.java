package testNGExample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClass {
	


	@Test(groups={"Sanity"},priority=0) //  Generally test will take alphabatical order but after using
	// the priority it will take 0 1 2 3 order. In this way we can sequence our test.
	public void loanTest() {
		System.out.println("Loan Test ");
		
	}
//	@Test(enabled=false) // this test will be left	
//	public void cardTest() {
//		System.out.println("Card Test ");
//		
//	}
	
	@Test(groups={"Sanity"},priority=1)
	public void cardTest() {
		System.out.println("Card Test ");
		
	}

	
	
	
	
}
