package newbrowser;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basicfns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page");
		
		WebElement typetext = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		typetext.sendKeys("test@gmail.com");
		
		WebElement addtext = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input"));
		addtext.clear();
		addtext.sendKeys("Enter password");
		
		WebElement button1 = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[4]/button"));
		button1.click();
		
		WebElement bpos = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[4]/button"));
		org.openqa.selenium.Point xypos1 = bpos.getLocation();
		int xbpos = xypos1.getX();
		int ybpos = xypos1.getY();
		System.out.println("The x value of the button is"+xbpos+"  "+"The Y position of the button is"+ybpos);
		
		int height = bpos.getSize().getHeight();
		int width = bpos.getSize().getWidth();
		System.out.println("The height of the button is"+height+" "+"The width of the button is"+width);
		
		WebElement ddwn1 = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[7]/td[2]/select"));
		Select dd1 = new Select(ddwn1);
		dd1.selectByIndex(0);
		dd1.selectByIndex(2);
		dd1.selectByIndex(1);
		
		driver.quit();
	}

}
