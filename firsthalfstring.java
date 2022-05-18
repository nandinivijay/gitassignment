package programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class firsthalfstring {

	public String firstHalf(String str) {
		
		  int half = str.length() / 2;
		
		  return str.substring(0, half);
		
		   
		
		}
	@Test 
	  public void testcase()
	  
	  {
		
		String str="WooHoo";
		Assert.assertEquals(firstHalf(str), "Woo");
	  }


}
