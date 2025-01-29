package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionsCode {
	
	int a=100;
	int b=200;
	@Test
	public void checkstatement() {
		Assert.assertEquals("a", "b");
	}

}
