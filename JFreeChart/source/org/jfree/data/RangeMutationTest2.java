package org.jfree.data;

import junit.framework.TestCase;
import org.jfree.data.Range;
import org.junit.*;


public class RangeMutationTest2 extends TestCase {

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
	
	
	//This is the mutated method
	public static Range expandToInclude(Range range, double value) {
        if (range != null) {  //Relational Operator Replacement
            return new Range(value, value);
        }
        if (value < range.getLowerBound()) {  
            return new Range(value, range.getUpperBound());
        }
        else if (value > range.getUpperBound()) {  
            return new Range(range.getLowerBound(), value);
        }
        else {
            return range;
        }
    }
	
	
	
	
	
	
	//TestForExpandToInclude for the original method
			public void testExpandToIncludeNullOriginal() {
				Range r1 = new Range(1, 5);
				Range ExpectedRange = new Range(8.0,8.0);
				assertEquals("equals: Did not return the expected output", ExpectedRange, Range.expandToInclude(null,8));
			}
			
			public void testExpandToIncludeValueAboveUpperBoundOriginal() {
				Range r1 = new Range(1, 5);
				Range ExpectedRange = new Range(1.0,8.0);
				assertEquals("equals: Did not return the expected output", ExpectedRange, Range.expandToInclude(r1,8));
			}
			
			public void testExpandToIncludeValueBelowLowerBoundOriginal() {
				Range r1 = new Range(5, 10);
				Range ExpectedRange = new Range(1.0,10.0);
				assertEquals("equals: Did not return the expected output", ExpectedRange, Range.expandToInclude(r1,1));
			}
			
			public void testExpandToIncludeValueAtUpperBoundOriginal() {
				Range r1 = new Range(1, 5);
				Range ExpectedRange = new Range(1.0,5.0);
				assertEquals("equals: Did not return the expected output", ExpectedRange, Range.expandToInclude(r1,5));
			}
			
			public void testExpandToIncludeValueAtLowerBoundOriginal() {
				Range r1 = new Range(5, 10);
				Range ExpectedRange = new Range(5.0,10.0);
				assertEquals("equals: Did not return the expected output", ExpectedRange, Range.expandToInclude(r1,5));
			}
			
	
			
			
			
			
			
			
			
			
			
			
			//TestForExpandToInclude for the Mutated method
			public void testExpandToIncludeNullMutated() {
				Range r1 = new Range(1, 5);
				Range ExpectedRange = new Range(8.0,8.0);
				assertEquals("equals: Did not return the expected output", ExpectedRange, expandToInclude(null,8));
			}
			
			public void testExpandToIncludeValueAboveUpperBoundMutated() {
				Range r1 = new Range(1, 5);
				Range ExpectedRange = new Range(1.0,8.0);
				assertEquals("equals: Did not return the expected output", ExpectedRange, expandToInclude(r1,8));
			}
			
			public void testExpandToIncludeValueBelowLowerBoundMutated() {
				Range r1 = new Range(5, 10);
				Range ExpectedRange = new Range(1.0,10.0);
				assertEquals("equals: Did not return the expected output", ExpectedRange, expandToInclude(r1,1));
			}
			
			public void testExpandToIncludeValueAtUpperBoundMutated() {
				Range r1 = new Range(1, 5);
				Range ExpectedRange = new Range(1.0,5.0);
				assertEquals("equals: Did not return the expected output", ExpectedRange, expandToInclude(r1,5));
			}
			
			public void testExpandToIncludeValueAtLowerBoundMutated() {
				Range r1 = new Range(5, 10);
				Range ExpectedRange = new Range(5.0,10.0);
				assertEquals("equals: Did not return the expected output", ExpectedRange, expandToInclude(r1,5));
			}
			
		
	
}