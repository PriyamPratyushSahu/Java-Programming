package tests;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestDemo {

	@Ignore
	@Test(expected=NullPointerException.class)
	public void testNull() {
		System.out.println("NullPointerException");
	}
	@Test(expected=IllegalArgumentException.class)
	public void testIllegal() {
		System.out.println("IllegalArgumentException");
	}

	

}
