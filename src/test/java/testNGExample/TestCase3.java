package testNGExample;

import org.testng.annotations.Test;

public class TestCase3 extends BaseClass {
	
	@Test(groups={"sanity"})
	public void groupTest1() {
		System.out.println("From groupTest1");
	}
	@Test(groups={"sanity"})
	public void groupTest2() {
		System.out.println("From groupTest2");
	}
	@Test(groups={"sanity"})
	public void groupTest3() {
		System.out.println("From groupTest3");
	}

	@Test(groups={"sanity2"})
	public void groupTest4() {
		System.out.println("From groupTest4");
	}
	@Test
	public void groupTest5() {
		System.out.println("From groupTest5");
	}

}
