package tests;

import static org.junit.Assert.*;

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
		assertEquals(5, ad.add());
	}
	@Test
	public void testSub() {
		assertEquals(3, ad.sub());

	}
	@Test
	public void testMul() {
		assertEquals(4, ad.mul());
	}

}
