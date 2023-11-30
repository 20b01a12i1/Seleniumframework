package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGlisteners.class)
public class TestNGDemo {

	@Test
	public void test1() {
		System.out.println("I am test1");
	}
	@Test
	public void test2() {
		System.out.println("I am test2");
//		Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("I am test3");
//		throw new SkipException("Test is skipped");
	}
	
}
