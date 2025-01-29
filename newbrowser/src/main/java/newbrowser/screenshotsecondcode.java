package newbrowser;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotsecondcode {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=batman&rlz=1C1CHBF_enIN926IN926&oq=batman&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCDIwNThqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8");
		
		TakesScreenshot screenst1 = (TakesScreenshot) driver;
		File screenshotfile1 = screenst1.getScreenshotAs(OutputType.FILE);
		File nameoffile = new File("C:\\\\\\\\Users\\\\\\\\HP\\\\\\\\Downloads\\\\screenshot1.jpeg");
	 	FileUtils.copyFile(screenshotfile1, nameoffile);  
		/*
		 * Robot newss = new Robot(); Dimension screensize =
		 * Toolkit.getDefaultToolkit().getScreenSize(); Rectangle monitor = new
		 * Rectangle(screensize); BufferedImage bfrdimg =
		 * newss.createScreenCapture(monitor); File savefile = new File(
		 * "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\HP\\\\\\\\\\\\\\\\Downloads\\\\\\\\screenshot1.jpeg"
		 * ); ImageIO.write(bfrdimg,"jpeg", savefile);
		 */

	}

}
