package tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sample_programs.Add;

public class TestsAdd {

	static Add ad; //obj is static,obj will not be reinitializd everytime i will run the test
	//all methods add,sub,mul will run with same value of Add(4,1,0)
	@BeforeClass
	public static void setUp()
	{
		ad=new Add(4,1,0);
	}
	@Test
	public void testAdd() {
		assertEquals(4, ad.add());
	}
	@Test
	public void testSub() {
		assertEquals(4, ad.sub());

	}
	@Test(timeout=2)
	public void testMul() {
		assertEquals(0, ad.mul());
	}
	@Test(expected=ArithmeticException.class)
	public void testDiv() {
		try {
		ad.div();
		}
		catch(ArithmeticException e) {
		//assertThrows(ArithmeticException.class,ad.div());
		//assertEquals(3, ad.div());
			fail(e.getMessage());
		}
	}
	@AfterClass
	public static void tearDown()
	{
		ad=null;
	}

}
