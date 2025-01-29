package newbrowser;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttoncode {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01jknyy6s4tserbjrt9ipddvq67959590.node0");
		WebElement checkenabled = driver.findElement(By.id("j_idt88:j_idt92"));
		Boolean msd= checkenabled.isEnabled();
		System.out.println(msd);
		
		WebElement positionbutton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/button/span[2]"));
		org.openqa.selenium.Point xyposition = positionbutton.getLocation();
		int xposition = xyposition.getX();
		int yposition = xyposition.getY();
		System.out.println("Xposition is "+xposition+" "+"Y position is"+yposition);
		WebElement colourbutton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/button/span[2]"));
		String findcolour = colourbutton.getCssValue("background");
		System.out.println(findcolour);
		
		WebElement htwt = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]"));
		int height = htwt.getSize().getHeight();
		int width =  htwt.getSize().getWidth();
		System.out.println("height of the button is"+height+" "+"Width of the button is"+width);
		
	    WebElement clickaction = driver.findElement(By.id("j_idt88:j_idt90"));
		clickaction.click();
		

	}

}
