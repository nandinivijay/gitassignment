package javacode1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringManipulation {
public String half(String str) {
		
		String result = str.substring(0,str.length()/2);
		return result;
	}
	
	@Test
	public void testcase() {
		String str ="WooHoo";
		Assert.assertEquals(half(str), "Woo");
	}

}



