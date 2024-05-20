package sample_programs;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

//import junit.framework.Assert;
public class AssertCheck {
	
	static String string1;					
	static String string2;					
	static String string3;					
	static String string4;					
	static String string5;	
    
	static int variable1;					
	static int	variable2;	
    
    //int[] arithematicArrary1;					
    //int[] arithematicArrary2;	
    
	@BeforeClass
	public static void setUp() 
	{
		string1="Junit";					
		string2="Junit";					
		string3="test";					
		string4="test";					
		string5=null;	
    
		variable1=1;					
    	variable2=2;					
	}
	
    @Test
    public void assertchecks()
    {
    	 int[] arithematicArrary1 = { 1, 2, 3 };					
    	 int[] arithematicArrary2 = { 1, 2, 3 };
    	 //parameters are expected,actual
    	 assertEquals("Err occured", 2, variable2);//if it fails then i will get err msg
    	 assertEquals(string1,string2);	
    	 try {
			assertNotEquals("Values not equal","Junit ",string2);
		} catch (AssertionError e) {
			System.out.println("Value not equal");
		}
    	 assertNotEquals("Junit4", string2);//if it fails rem of code is not executed
    	 
    	 assertSame(string3, string4);					
    	 assertNotSame(string1, string3);	
    	 
    	 assertNotNull(string1);			
    	 assertNull(string5);			
    	 assertTrue(variable1<variable2);					
    	 assertArrayEquals("Arr not equal",arithematicArrary1, arithematicArrary2);
    }
}
