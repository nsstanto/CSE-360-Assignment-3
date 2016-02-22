package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() 
	{
		Calculator calc = new Calculator();
		assertNotNull(calc); // is an object created?
	}

	@Test
	public void testGetTotal() 
	{
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal()); 
		calc.add(1);
		assertEquals(1, calc.getTotal());
	}

	@Test
	public void testAdd() 
	{
		Calculator calc = new Calculator();
		calc.add(2);
		assertEquals(2, calc.getTotal());
		calc.add(5);
		assertEquals(2+5, calc.getTotal());
		calc.add(7);
		assertEquals(2+5+7, calc.getTotal());
	}

	@Test
	public void testSubtract() 
	{
		Calculator calc = new Calculator();
		calc.add(20);
		calc.subtract(5);
		assertEquals(20-5, calc.getTotal());
		calc.subtract(6);
		assertEquals(20-5-6, calc.getTotal());
		calc.subtract(7);
		assertEquals(20-5-6-7, calc.getTotal());
	}

	@Test
	public void testMultiply() 
	{
		Calculator calc = new Calculator();
		calc.add(20);
		calc.multiply(2);
		assertEquals(20*2, calc.getTotal());
		calc.multiply(3);
		assertEquals(20*2*3, calc.getTotal());
		calc.multiply(4);
		assertEquals(20*2*3*4, calc.getTotal());
	}

	@Test
	public void testDivide() 
	{
		Calculator calc = new Calculator();
		calc.add(100);
		calc.divide(2);
		assertEquals(100/2, calc.getTotal());
		calc.divide(3);
		assertEquals((100/2)/3, calc.getTotal());
		calc.divide(1);
		assertEquals((100/2)/3, calc.getTotal());
		calc.divide(0);
		assertEquals(0, calc.getTotal());
	}

	@Test
	public void testGetHistory() 
	{
		Calculator calc = new Calculator();
		assertEquals("0", calc.getHistory());
		calc.add(100);
		assertEquals("0 + 100", calc.getHistory());
		calc.divide(2);
		calc.multiply(3);
		calc.subtract(15);
		assertEquals("0 + 100 / 2 * 3 - 15", calc.getHistory());
		calc.divide(0);
		assertEquals("0 + 100 / 2 * 3 - 15 / 0", calc.getHistory());
	}
}
