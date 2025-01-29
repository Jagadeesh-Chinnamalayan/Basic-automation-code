package newbrowser;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiwindows { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml"); 
		
		/*String windowids = driver.getWindowHandle();
		
	    WebElement winbutton1 = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/button/span"));
		winbutton1.click();
		Set<String> allwindowids = driver.getWindowHandles();
		int numofwnds = driver.getWindowHandles().size();
		System.out.println(numofwnds);
        
	    for (String currentwndid : allwindowids) {
	    	if (!currentwndid.equals(windowids) ) {
	    		  
	    	driver.switchTo().window(currentwndid); 
	    		
				driver.close(); 
		
			}
			
		}*/
		
		String firstwndwid = driver.getWindowHandle();
		WebElement openmultiwnds1 = driver.findElement(By.id("j_idt88:j_idt91"));
		openmultiwnds1.click();
		
		Set<String> allwindowids = driver.getWindowHandles();
		
		int sizeofwindows =  driver.getWindowHandles().size();
		System.out.println(sizeofwindows);
		
		// driver.switchTo().window(firstwndwid); 
		
		for (String presentwindowid : allwindowids) {
			
			if (!presentwindowid.equals(firstwndwid)) {
				
				driver.switchTo().window(presentwindowid);
				
				driver.close();
				
			}
			
		}
		
		
		

	}

}
