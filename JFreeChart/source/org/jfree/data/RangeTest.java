package org.jfree.data;

import junit.framework.TestCase;
import org.jfree.data.Range;
import org.junit.*;


public class RangeTest extends TestCase {

	private Range rangeObjectUnderTest;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	protected void setUp() throws Exception {
		rangeObjectUnderTest = new Range(-1, 1);
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void test() {
		assertEquals("The central value of -1 and 1 should be 0",
				0, rangeObjectUnderTest.getCentralValue(), 0.000000001d);
	}
	
	//Tests for getCentralValue
	@Test
	public void testGetCentralValue() {
	    Range r1 = new Range(1, 5);
	    assertEquals( 3.0, r1.getCentralValue());
	}
	
	public void testGetCentralValueBothPositiveAndEqual() {
		Range r1 = new Range(5, 5);
		assertEquals("getCentralValue: Did not return the expected output", 5.0, r1.getCentralValue());
	}
	
	public void testGetCentralValueBothPostiveAndNotEqual() {
		Range r2 = new Range(1, 10);
		assertEquals("getCentralValue: Did not return the expected output", 5.0, r2.getCentralValue());
	}
	
	public void testGetCentralValueBothNegativeAndNotEqual() {
		Range r3 = new Range(-10, -1);
		assertEquals("getCentralValue: Did not return the expected output", -5.0, r3.getCentralValue());
	}
	
	public void testGetCentralValueBothNegativeAndEqual() {
		Range r4 = new Range(-5, -5);
		assertEquals("getCentralValue: Did not return the expected output", -5.0, r4.getCentralValue());
	}
	
	public void testGetCentralValueLowerNegativeAndUpperPositive() {
		Range r5 = new Range(-5, 5);
		assertEquals("getCentralValue: Did not return the expected output", 0.0, r5.getCentralValue());
	}
	
	//Tests for getUpperBound
	@Test
	public void testGetUpperBoundBothPositiveAndEqual() {
		Range r1 = new Range(5, 5);
		assertEquals("getUpperBound: Did not return the expected output", 5.0, r1.getUpperBound());
	}
	@Test
	public void testGetUpperBoundBothPostiveAndNotEqual() {
		Range r2 = new Range(1, 10);
		assertEquals("getUpperBound: Did not return the expected output", 10.0, r2.getUpperBound());
	}
	@Test
	public void testGetUpperBoundBothNegativeAndNotEqual() {
		Range r3 = new Range(-10, -1);
		assertEquals("getUpperBound: Did not return the expected output", -1.0, r3.getUpperBound());
	}
	@Test
	public void testGetUpperBoundBothNegativeAndEqual() {
		Range r4 = new Range(-5, -5);
		assertEquals("getUpperBound: Did not return the expected output", -5.0, r4.getUpperBound());
	}
	@Test
	public void testGetUpperBoundLowerNegativeAndUpperPositive() {
		Range r5 = new Range(-5, 5);
		assertEquals("getUpperBound: Did not return the expected output", 5.0, r5.getUpperBound());
	}
	
	//Tests for getLowerBound
	@Test
		public void testGetLowerBoundBothPositiveAndEqual() {
			Range r1 = new Range(5, 5);
			assertEquals("getLowerBound: Did not return the expected output", 5.0, r1.getLowerBound());
		}
	@Test
		public void testGetLowerBoundBothPostiveAndNotEqual() {
			Range r2 = new Range(1, 10);
			assertEquals("getLowerBound: Did not return the expected output", 1.0, r2.getLowerBound());
		}
	@Test
		public void testGetLowerBoundBothNegativeAndNotEqual() {
			Range r3 = new Range(-10, -1);
			assertEquals("getLowerBound: Did not return the expected output", -10.0, r3.getLowerBound());
		}
	@Test
		public void testGetLowerBoundBothNegativeAndEqual() {
			Range r4 = new Range(-5, -5);
			assertEquals("getLowerBound: Did not return the expected output", -5.0, r4.getLowerBound());
		}
	@Test
		public void testGetLowerBoundLowerNegativeAndUpperPositive() {
			Range r5 = new Range(-5, 5);
			assertEquals("getLowerBound: Did not return the expected output", -5.0, r5.getLowerBound());
			
		}
		
		//Tests for Contains()
		public void testContainsBelowLowerBoundary() {
			Range r1 = new Range(1, 10);
			assertEquals("contains: Did not return the expected output", true, r1.contains(1));
		}
		
		public void testContainsAtLowerBoundary() {
			Range r2 = new Range(1, 10);
			assertEquals("contains: Did not return the expected output", true, r2.contains(2));
		}
		
		public void testContainsCenterRange() {
			Range r3 = new Range(1, 10);
			assertEquals("contains: Did not return the expected output", true, r3.contains(5));
		}
		
		public void testContainsAtUpperBoundary() {
			Range r4 = new Range(1, 10);
			assertEquals("contains: Did not return the expected output", true, r4.contains(9));
		}
		
		public void testContainsAboveUpperBoundary() {
			Range r5 = new Range(1, 10);
			assertEquals("contains: Did not return the expected output", true, r5.contains(10));
		}

	//Tests For Equals
		public void testEqualsBelowLowerBoundary() {
			Range r1 = new Range(1, 10);
			Range t1 = new Range(11, 20);
			assertEquals("equals: Did not return the expected output", false, r1.equals(t1));
		}
		
		public void testEqualsAtLowerBoundary() {
			Range r2 = new Range(1, 10);
			Range t2 = new Range(-10,1);
			assertEquals("equals: Did not return the expected output", false, r2.equals(t2));
		}
		
		public void testEqualsCenterRange() {
			Range r3 = new Range(1, 10);
			Range t3 = new Range(1,10);
			assertEquals("equals: Did not return the expected output", true, r3.equals(t3));
		}
		
		public void testEqualsAtUpperBoundary() {
			Range r4 = new Range(1, 10);
			Range t4 = new Range(0,11);
			assertEquals("equals: Did not return the expected output", false, r4.equals(t4));
		}
		
		public void testEqualsAboveUpperBoundary() {
			Range r5 = new Range(1, 10);
			Range t5 = new Range(2,9);
			assertEquals("equals: Did not return the expected output", false, r5.equals(t5));
		}

}
