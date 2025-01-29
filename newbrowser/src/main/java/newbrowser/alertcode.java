package newbrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertcode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node01qng6j911zclu1fiyywx3iosd98031034.node0");
		
		WebElement alertbox1 = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span[2]"));
		alertbox1.click();
		Alert ctrl1 = driver.switchTo().alert();
		ctrl1.accept();
		
		WebElement alertbox2 = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/button/span[2]"));
		alertbox2.click();
		Alert ctrl2 = driver.switchTo().alert();
		ctrl2.dismiss();
		
		WebElement alertbox3 = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]"));
		alertbox3.click();
		Alert ctrl3 = driver.switchTo().alert();
		ctrl3.sendKeys("Madakithattu");
		ctrl3.accept();
		
		WebElement alertbox4 = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/button/span[2]"));
		alertbox4.click();
		WebElement ctrl4 = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/div/div[1]/a"));
		//Alert ctrl4 = driver.switchTo().alert();
		ctrl4.click();
		
		WebElement alertbox5 = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/button/span[2]"));
		alertbox5.click();
		WebElement ctrl5 = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div[3]/span/button/span[2]"));
		ctrl5.click();
	}

}
