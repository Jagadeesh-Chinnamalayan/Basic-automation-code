package newbrowser;


import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		
		
		WebElement textboxbutton = driver.findElement(By.xpath("//*[@id=\'btn1\']"));
		textboxbutton.click();
		
		FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class); 
		
		WebElement textbox1 = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("//*[@id=\'txt1\']"));
			}
             
			});
		textbox1.sendKeys("TU TU TU");
	}}
				
				
			
		//WebElement textbox1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'txt1\']")));
		//textbox1.sendKeys("TU TU TU"); 
		
		//WebElement buttonclick = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
		//buttonclick.click(); 
		
		//driver.quit();
		


