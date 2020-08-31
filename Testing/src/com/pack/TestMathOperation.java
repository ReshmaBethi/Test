package com.pack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMathOperation {
	MathOperation m;

	@Before
	public void setUp() throws Exception {
		m=new MathOperation();
	}

	@After
	public void tearDown() throws Exception {
		m=null;
	}

	@Test
	public void testAdd_positive() {
//		fail("Not yet implemented");
		//MathOperation m=new MathOperation();
		int addition=m.add(12, 12);
		assertEquals(24, addition);
	}
	
	@Test
	public void testAdd_positive1() {
		int addition=m.add(-12, 12);
		assertEquals(0, addition);
	}
	@Test
	public void testAdd_positive2() {
		int addition=m.add(12, -12);
		assertEquals(0, addition);
	}
	
	@Test
	public void testAdd_positive3() {
		int addition=m.add(12, -12);
		assertEquals(0, addition);
	}
	
	@Test
	public void testAdd_positive4() {
		int addition=m.add(0, -12);
		assertEquals(-12, addition);
	}

	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		double division=m.divide(12, 12);
		assertEquals(1, division,0);
	}
	
	@Test
	public void testDivide1() {
		//fail("Not yet implemented");
		double division=m.divide(12, -12);
		assertEquals(-1, division,0);
	}
	
	@Test
	public void testDivide2() {
		//fail("Not yet implemented");
		double division=m.divide(-12, -12);
		assertEquals(1, division,0);
	}

	@Test
	public void testDivide3() {
		//fail("Not yet implemented");
		double division=m.divide(-12, 12);
		assertEquals(-1, division,0);
	}
	
	@Test
	public void testDivide4() {
		//fail("Not yet implemented");
		double division=m.divide(12, 5);
		assertEquals(2.4, division,0);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivide5() {
		//fail("Not yet implemented");
		assertEquals(99, m.div1(12, 0),0);
	}
	
	@Test
	public void testDivide_negative() {
		//fail("Not yet implemented");
		double division=m.divide(12, 3);
//		assertEquals(3, division,0);
		assertTrue(division !=3);
	}
}
