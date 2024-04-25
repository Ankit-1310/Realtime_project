package com.anku.model.tesst;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.anku.model.Calculator;

public class CalculatorTest {
	
	private static Calculator cal= null;
	@BeforeClass
	public static void beforeAll() {
		cal = new Calculator();
	}
	@AfterClass
	public static void afterAll() {
		cal = null;
	}
	@Test
	public void testSum() {
	    Integer actualResult = cal.sum(10, 20);
	    Integer expactedResult = 30;
	    assertEquals(expactedResult, actualResult);
	}
	
	@Test
	public void testMul() {
	    long actualResult = cal.mul(10, 20);
	    long expactedResult = 200;
	    assertEquals(expactedResult, actualResult);
	}

}
