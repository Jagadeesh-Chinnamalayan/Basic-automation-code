package newbrowser;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotcode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
		
		TakesScreenshot ss1 = (TakesScreenshot) driver;
		File screenshotfile = ss1.getScreenshotAs(OutputType.FILE);
		File imgfile = new File("C:\\\\Users\\\\HP\\\\Downloads\\screenshot1.jpeg");
		FileUtils.copyFile(screenshotfile, imgfile);
	}		
}
	
