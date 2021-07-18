package testNGExample;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	
	@BeforeGroups("Sanity")
	public void beforeGroup() {
		System.out.println("Before Group");
	}
	@AfterGroups("Sanity")
	public void AfterGroup() {
		System.out.println("After Group");
	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test ");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method ");
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method ");
		
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test ");
		
	}

}
