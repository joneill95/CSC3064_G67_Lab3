package org.jfree.data;

import junit.framework.TestCase;
import org.jfree.data.Range;
import org.junit.*;


public class RangeMutationTest extends TestCase {

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
	
	
}