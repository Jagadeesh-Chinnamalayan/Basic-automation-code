package newbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sitedd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");

		WebElement dd1 = driver.findElement(By.xpath("/html/body/main/div[2]/div/div[2]/div/select"));
		Select fdd = new Select(dd1);
		fdd.selectByIndex(1); 

		WebElement dd2 = driver.findElement(By.xpath("/html/body/main/div[2]/div/div[3]/div/select"));
		Select sdd = new Select(dd2);
		sdd.selectByValue("50");
		sdd.selectByValue("10");  
		sdd.selectByValue("100");

		List<WebElement> list1 = sdd.getOptions();
		int optionsize =  list1.size();

		System.out.println(optionsize);


		WebElement dd3 = driver.findElement(By.xpath("/html/body/main/div[2]/div/div[4]/div/p/select"));
		dd3.sendKeys("Aus");

		Thread.sleep(5000);

		driver.quit();
	}

}
