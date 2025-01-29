package testNG;

import org.testng.annotations.Test;

public class SampleTestCases {
@Test(priority = 0)	
public void firstTestCase() {
System.out.println("this is first test case");	
}
@Test(priority = 2)
public void secondcase() {
System.out.println("this is the second case");	
} 
@Test(priority = 1)
public void thirdcase() {

System.out.println("this is the third case");	
}
}
