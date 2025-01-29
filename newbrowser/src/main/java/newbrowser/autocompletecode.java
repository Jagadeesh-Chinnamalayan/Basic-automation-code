package newbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class autocompletecode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/auto-complete.php");

		WebElement typett = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/input"));
		typett.sendKeys("b");
		
		Thread.sleep(5000);

		List<WebElement> allopts = driver.findElements(By.xpath("/html/body/ul/li"));
		for (WebElement textaopts : allopts) {
			if (textaopts.getText().equals("Ruby")) {
		textaopts.click();	 
	 /* WebElement selectingkey	= driver.findElement(By.xpath("/html/body/ul/li[2]/div"));
	  selectingkey.click();*/
            
			}

		}
		Thread.sleep(2000);
       driver.quit();
	}

}
