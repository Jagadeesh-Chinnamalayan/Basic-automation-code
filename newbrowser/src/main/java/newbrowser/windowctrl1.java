 package newbrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowctrl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html"); 
		
	    String windowid1 = driver.getWindowHandle();
		
		WebElement mainwndw = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div[2]/div[1]/div[1]/div/div[1]/article/div/div/div/div[2]/button"));
		mainwndw.click();
		
		Set<String> multiwnds = driver.getWindowHandles();
		
		
		
		for (String newmwndsid : multiwnds) {
			if (!newmwndsid.equals(windowid1))
			{
			driver.switchTo().window(newmwndsid);
			
			WebElement childwndw1 = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div[2]/div[1]/div[1]/div/div[1]/article/div/div/div/input[1]"));
			childwndw1.sendKeys("ibaambe");
			
			driver.close();
			
			}
			
			
		}
		
		
		driver.switchTo().window(windowid1);

	}

}
