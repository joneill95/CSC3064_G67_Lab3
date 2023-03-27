package org.jfree.data;

import junit.framework.TestCase;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
		
		public void testContainsAboveUnderBoundary() {
			Range r6 = new Range(1, 10);
			assertEquals("contains: Did not return the expected output", true, r6.contains(0));
		}
		public void testContainsAboveOverBoundary() {
			Range r7 = new Range(1, 10);
			assertEquals("contains: Did not return the expected output", true, r7.contains(11));
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
		
		public void testEqualsNull() {
			Range r5 = new Range(1, 10);
			assertEquals("equals: Did not return the expected output", false, r5.equals(null));
		}

		
		
		//ToString Tests
		public void testToString() {
			Range r5 = new Range(1, 10);
		assertEquals("equals: Did not return the expected output","Range[1.0,10.0]", r5.toString());
		}
		
		
		
		
		//Tests For Constrain
		public void testConstrainValueInRange() {
			Range r1 = new Range(1, 10);
			assertEquals("equals: Did not return the expected output", 5.0, r1.constrain(5));
		}
		
		public void testConstrainValueAboveRange() {
			Range r1 = new Range(1, 10);
			assertEquals("equals: Did not return the expected output", 10.0, r1.constrain(11));
		}
		
		public void testConstrainValueBelowRange() {
			Range r1 = new Range(1, 10);
			assertEquals("equals: Did not return the expected output", 1.0, r1.constrain(0));
		}
		
		public void testConstrainValueLowerBoundary() {
			Range r1 = new Range(1, 10);
			assertEquals("equals: Did not return the expected output", 1.0, r1.constrain(1));
		}
		public void testConstrainValueUpperBoundary() {
			Range r1 = new Range(1, 10);
			assertEquals("equals: Did not return the expected output", 10.0, r1.constrain(10));
		}
		
		
		
		//Test For GetLength
		public void testGetLength() {
			Range r1 = new Range(1, 10);
			assertEquals("equals: Did not return the expected output", 9.0, r1.getLength());
		}
		
		
		//Test For HashCode()
		public void testHashCode() {
			Range r1 = new Range(1, 10);
			assertEquals("equals: Did not return the expected output", 2119434240, r1.hashCode());
		}
		
		
		
		//TestForExpandToInclude()
		public void testExpandToIncludeNull() {
			Range r1 = new Range(1, 5);
			Range ExpectedRange = new Range(8.0,8.0);
			assertEquals("equals: Did not return the expected output", ExpectedRange, Range.expandToInclude(null,8));
		}
		
		public void testExpandToIncludeValueAboveUpperBound() {
			Range r1 = new Range(1, 5);
			Range ExpectedRange = new Range(1.0,8.0);
			assertEquals("equals: Did not return the expected output", ExpectedRange, Range.expandToInclude(r1,8));
		}
		
		public void testExpandToIncludeValueBelowLowerBound() {
			Range r1 = new Range(5, 10);
			Range ExpectedRange = new Range(1.0,10.0);
			assertEquals("equals: Did not return the expected output", ExpectedRange, Range.expandToInclude(r1,1));
		}
		
		public void testExpandToIncludeValueAtUpperBound() {
			Range r1 = new Range(1, 5);
			Range ExpectedRange = new Range(1.0,5.0);
			assertEquals("equals: Did not return the expected output", ExpectedRange, Range.expandToInclude(r1,5));
		}
		
		public void testExpandToIncludeValueAtLowerBound() {
			Range r1 = new Range(5, 10);
			Range ExpectedRange = new Range(5.0,10.0);
			assertEquals("equals: Did not return the expected output", ExpectedRange, Range.expandToInclude(r1,5));
		}
		
		
		
		//Tests For Expand
		public void testExpandNull() {
			try {
				Range.expand(null,0.5,0.5);
				fail("No exception thrown. The expected outcome was: a thrown exception of type: IllegalArgumentException");
			} catch (Exception e) {
				assertTrue("Incorrect exception type thrown", e.getClass().equals(IllegalArgumentException.class));
			}
		}
		
		public void testExpandNotNull() {
			Range r1 = new Range(2, 6);
			Range ExpectedRange = new Range(1.0,8.0);
			assertEquals("equals: Did not return the expected output", ExpectedRange, Range.expand(r1,0.25,0.5));
		}
		
		
		//Tests For Combine
		public void testCombineRange1Null() {
			Range r1 = new Range(1, 5);
			Range r2 = new Range(5, 10);
			Range ExpectedRange = new Range(5.0,10.0);
			assertEquals("equals: Did not return the expected output", ExpectedRange, Range.combine(null,r2));
		}
		
		public void testCombineRange2Null() {
			Range r1 = new Range(1, 5);
			Range r2 = new Range(5, 10);
			Range ExpectedRange = new Range(1.0,5.0);
			assertEquals("equals: Did not return the expected output", ExpectedRange, Range.combine(r1,null));
		}
		
		public void testCombineNotNull() {
			Range r1 = new Range(1, 5);
			Range r2 = new Range(5, 10);
			Range ExpectedRange = new Range(1.0,10.0);
			assertEquals("equals: Did not return the expected output", ExpectedRange, Range.combine(r1,r2));
		}
		
		
		//Tests For Intersects
		public void testIntersectsDoesOverlapWithin() {
			Range r1 = new Range(1, 5);
			assertEquals("equals: Did not return the expected output", true, r1.intersects(0,6));
		}
		public void testIntersectsDoesNotOverlapUpper() {
			Range r1 = new Range(1, 5);
			assertEquals("equals: Did not return the expected output", false, r1.intersects(5,10));
		}
		public void testIntersectsDoesNotOverlapLower() {
			Range r1 = new Range(5, 10);
			assertEquals("equals: Did not return the expected output", false, r1.intersects(1,5));
		}
		public void testIntersectsDoesOverlapUpper() {
			Range r1 = new Range(1, 5);
			assertEquals("equals: Did not return the expected output", false, r1.intersects(4,10));
		}
		public void testIntersectsDoesOverlapLower() {
			Range r1 = new Range(5, 10);
			assertEquals("equals: Did not return the expected output", true, r1.intersects(1,6));
		}
		public void testIntersectsDoesNotOverlap() {
			Range r1 = new Range(1, 5);
			assertEquals("equals: Did not return the expected output", false, r1.intersects(10,15));
		}
		
		
		// Shifts (Range,Double,Boolean)
		public void testShift1Null() {
			try {
				Range.shift(null,5,true);
				fail("No exception thrown. The expected outcome was: a thrown exception of type: IllegalArgumentException");
			} catch (Exception e) {
				assertTrue("Incorrect exception type thrown", e.getClass().equals(IllegalArgumentException.class));
			}
		}
		
}