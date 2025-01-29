package newbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperlinkcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node0p4nsqdgt04rvq3jra2v368pb8096375.node0");
		
		WebElement firstlink = driver.findElement(By.linkText("Go to Dashboard"));
		firstlink.click();
		driver.navigate().back();
		
		WebElement linkdestination = driver.findElement(By.linkText("Find the URL without clicking me."));
		String destination =  linkdestination.getDomProperty("href");
		System.out.println("The destination of the link is"+"    "+destination);
		
		WebElement thirdlink = driver.findElement(By.linkText("Broken?"));
		thirdlink.click();
		String title = driver.getTitle();
		if (title.contains("404")) { 
		System.out.println("The link is broken da dei");	
		driver.navigate().back();
		}
		
		List<WebElement> alllinks =  driver.findElements(By.tagName("a"));
		int numoflinks = alllinks.size();
		System.out.println("The number of links"+"  "+numoflinks);
	}

}
