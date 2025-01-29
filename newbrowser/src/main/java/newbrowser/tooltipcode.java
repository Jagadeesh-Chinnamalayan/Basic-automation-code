package newbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltipcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/tool-tips.php");
		
		WebElement tipdis = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]"));
		String distip =  tipdis.getDomProperty("title");
        System.out.println("The tool tip for the selected element is"+" "+distip);
	}

}
