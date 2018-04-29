package jenkins_demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SimpleTest {
	
	@Test 
	public void simpleTest()
	{
		MySimpleClass example = new MySimpleClass();
		
		int result = example.countOccurence("la casa de papel", 'a');
		
		// int result2 = example.countOccurence("la casa de papel", 'l');

		System.out.println("result is :" + result);
		
		assertTrue(result == 4);
		
		//assertTrue(result2 == 2);
		
		
		System.out.println("Change two ");

		
	}
}
