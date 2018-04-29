package jenkins_demo;

public class MySimpleClass {
	
	
	public int countOccurence(String input , char letter)
	{
	    int count = 0;
	    
	    for (int i=0; i < input.length(); i++)
	    {
	        if (input.charAt(i) == letter)
	        {
	             count++;
	        }
	    }	    
	    
	    return count;

	}
	
	
	/*
	public static void main(String[] args)
	{
		MySimpleClass example = new MySimpleClass();
		int rs = example.countOccurence("la casa de papel", 'a');
		System.out.println(rs);
	}
	
	*/
	
}
