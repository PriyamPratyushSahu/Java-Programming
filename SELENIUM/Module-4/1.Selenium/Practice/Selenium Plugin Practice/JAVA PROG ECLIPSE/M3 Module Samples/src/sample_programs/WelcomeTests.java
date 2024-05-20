package sample_programs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class WelcomeTests {
// each n every test case will run indivisually, no nesting of testcases one after the other in order
//methods execute in the chronological order
	@BeforeClass
	public static void bfcmethod()
	{
		System.out.println("In bfc method");
	}
	@Before
	public void bfmethod()
	{
		System.out.println("In bf method");

	}
	@Test //annotations indicate junit what to do
	public void test1() //test method/test case
	{
		System.out.println("In test1 method");
	}
	@Test
	public void test2() //test method/test case
	{
		System.out.println("In test2 method");
	}
	@Test
	public void test3() //test method/test case
	{
		System.out.println("In test3 method");
	}
	@After
	public void afmethod()
	{
		System.out.println("In af method");

	}
	@AfterClass
	public static void afcmethod()
	{
		System.out.println("In afc method");
	}

}
