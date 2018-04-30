package jenkins_demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SimpleTest {
	
	@Test 
	public void simpleTest()
	{
		MySimpleClass example = new MySimpleClass();
		
		int result = example.countOccurence("la casa de papel", 'a');
				
		assertTrue(result == 5);
	}
}
