package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import sample_programs.Add;
//mport sample_programs.Add.*;

//import static sample_programs.Add.*; //static here means i m not going to create an obj

//import static sample_programs.Add;
public class AddTests {

	@Test
	public void testAdd() 
	{
		Add obj=new Add(4,1,0);
		assertEquals(5, obj.add());
	}

}
