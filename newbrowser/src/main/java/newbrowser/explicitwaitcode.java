package newbrowser;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwaitcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		
		
		WebElement textboxbutton = driver.findElement(By.xpath("//*[@id=\'btn1\']"));
		textboxbutton.click();
		
		WebDriverWait exwait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement textbox1 = exwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'txt1\']")));
		textbox1.sendKeys("TU TU TU"); 
		
		//WebElement buttonclick = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
		//buttonclick.click(); 
		
		//driver.quit();
		
		


	}

}
