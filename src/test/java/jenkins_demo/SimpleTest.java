package jenkins_demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SimpleTest {
	
	@Test 
	public void simpleTest()
	{
		MySimpleClass example = new MySimpleClass();
		
		int result = example.countOccurence("la casa de papel", 'a');
		
		int result2 = example.countOccurence("la casa de papel", 'l');

		
		assertTrue(result == 4);
		
		assertTrue(result == 2);
		
	}
}
