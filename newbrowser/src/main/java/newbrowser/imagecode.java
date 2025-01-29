package newbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imagecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice-automation.com/broken-images/");
		
		WebElement validimage = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/main/div/article/div/div[1]/div/div[1]/figure/picture/img"));
		if (validimage.getDomProperty("naturalWidth").equals("0")) {
			
		System.out.println("The first image is broken");
			
		}
		else {
			System.out.println("The first image is not broken");
		}
        WebElement brokenimage1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/main/div/article/div/div[1]/div/div[2]/img"));
        if (brokenimage1.getDomProperty("naturalWidth").equals("0")) {
        	
        System.out.println("The second image is broken");	
			
		} else {
			System.out.println("The second image is not broken");		

		}
	}

}
