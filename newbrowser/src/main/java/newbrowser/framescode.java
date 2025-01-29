package newbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framescode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml"); 

		driver.switchTo().frame(0);
		WebElement firstframe = driver.findElement(By.xpath("/html/body/button"));  
		firstframe.click();

		String textdata = driver.findElement(By.xpath("/html/body/button")).getText();
		System.out.println(textdata);

		driver.switchTo().defaultContent();


		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement nesframe = driver.findElement(By.id("Click"));
		nesframe.click();
		String buttontxt2 = nesframe.getText();
		System.out.println("Second out"+buttontxt2);

		driver.switchTo().defaultContent();
		
		List<WebElement> tagnamelist =  driver.findElements(By.tagName("iframe"));
		int sizeofwebele =  tagnamelist.size();
		System.out.println(sizeofwebele);
		
		/*driver.switchTo().frame(0);
		WebElement clickframezero =  driver.findElement(By.xpath("//*[@id=\'Click\']"));
		clickframezero.click();
		WebElement textinframe = driver.findElement(By.xpath("//*[@id=\'Click\']"));
		
		String displayhtext = textinframe.getText();
		
		System.out.println(displayhtext);
		driver.switchTo().defaultContent();
		
		List<WebElement> framescount =  driver.findElements(By.tagName("iframe"));
		int framescountint = framescount.size();
		System.out.println(framescountint);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement lastframe = driver.findElement(By.xpath("//*[@id=\'Click\']"));
		lastframe.click();
		String lastframetext = lastframe.getText();
		System.out.println(lastframetext);*/
		
		
		
		
		
		
 
	}

}
