package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersCode {
	
	@Test
	@Parameters("name")
	public void name(String name) {
		System.out.println("The name is"+ name);
	}

}
 