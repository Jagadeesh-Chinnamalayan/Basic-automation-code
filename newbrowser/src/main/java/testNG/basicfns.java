package testNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.security.PublicKey;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class basicfns {
WebDriver driver;	

@BeforeSuite
public void drivercontrol() {
System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
driver = new ChromeDriver();

}

@Test (priority = 0) 	 
public void screenshot() throws IOException {
driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");	
TakesScreenshot screenshot = (TakesScreenshot) driver;
File screenshot1 = screenshot.getScreenshotAs(OutputType.FILE);
File location = new File("C:\\Users\\HP\\Downloads\\newfile.jpeg");
FileUtils.copyFile(screenshot1, location);

}

@Test (dependsOnMethods = "screenshot")
 public void upload() throws InterruptedException, AWTException {
WebElement choose = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div/label"));
choose.click();


StringSelection name1 = new StringSelection("C:\\Users\\HP\\Downloads\\newfile.jpeg");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(name1, null);
Thread.sleep(3000);
Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);


}

}
