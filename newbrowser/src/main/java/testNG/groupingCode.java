package testNG;

import org.testng.annotations.Test;

public class groupingCode {
	@Test(groups = {"Redbull"})
	public void RedBull1() {
		System.out.println("Max Verstappan");
	}
	@Test(groups = {"Redbull"})
	public void Redbull2() {
		System.out.println("Liam Lawson");
	}
	@Test(groups = {"Ferrari"})
	public void Ferrari1() {
		
	System.out.println("Charles Leclerc");		
}
	@Test(groups = {"Ferrari"})
	public void Ferrari2() {
		
	System.out.println("Lewis Hamilton");		
}
	@Test(groups = {"Austin"})
	public void Austin1() {
		System.out.println("Fernando Alonso");
	}
	@Test(groups = {"Austin"})
	public void Austin2() {
		System.out.println("Lance Stroll");
	}
	
}
