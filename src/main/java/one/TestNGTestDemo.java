package one;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTestDemo {

	@Test
	public void oneTest()
	{
		System.out.println("***********Test Method*********");
	}
	
	@BeforeTest
	public void oneBeforeTest()
	{
		System.out.println("***********Before Test Method*********");
	}
	
	@AfterTest
	public void oneAfterTest()
	{
		System.out.println("***********After Test Method*********");
	}
}
