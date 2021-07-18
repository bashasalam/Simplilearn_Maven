package testNGExample;

import org.testng.annotations.Test;

public class TestCase2 extends BaseClass{
	
	@Test(description="This is description")
	public void insuranceTest() {
		
		System.out.println("Insurance Test");
	}
	@Test
	public void excludeTest1() {
		
		System.out.println("excludeTest1 Test");
	}
	@Test
	public void excludeTest2() {
		
		System.out.println("excludeTest2 Test");
	}

}
