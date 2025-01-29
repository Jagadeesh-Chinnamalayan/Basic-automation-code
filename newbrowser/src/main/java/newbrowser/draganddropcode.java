package newbrowser;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement departure = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/div[2]/div"));
		WebElement arrival = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/div[1]/div[2]"));
		Actions dnd = new Actions(driver);
		dnd.dragAndDrop(departure, arrival).build().perform();
		
		driver.switchTo().defaultContent();
		
		WebElement movearound = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div[1]/div/div/div[2]"));
		Actions cnh = new Actions(driver);
		cnh.clickAndHold(movearound).moveByOffset(140, 0).release().build().perform();
		driver.switchTo().defaultContent(); 
		
	}
 
}
