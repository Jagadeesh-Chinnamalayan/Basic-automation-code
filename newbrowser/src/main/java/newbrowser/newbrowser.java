package newbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).sendKeys("Wikipedia"+Keys.ENTER);
		driver.findElement(By.linkText("Wikipedia:Introduction")).click();
		//driver.findElement(By.id("APjFqb")).sendKeys("Batman"+Keys.ENTER);
		  //driver.quit();    
	}

}
