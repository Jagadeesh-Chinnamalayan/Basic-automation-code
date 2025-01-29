package newbrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadefilecode {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromer.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
		
	    WebElement uploadfilebutton = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div/label"));
	    uploadfilebutton.click();
	    Thread.sleep(3000); 
	     
	    // String fileloc = "C:\\Users\\HP\\Downloads\\sampleFile.jpeg";
	    
	    StringSelection locoffile = new StringSelection("C:\\Users\\HP\\Downloads\\sampleFile.jpeg");
	    
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(locoffile, null); 
	     
	    Robot presskeys = new Robot();
	    presskeys.keyPress(KeyEvent.VK_CONTROL);
	    presskeys.keyPress(KeyEvent.VK_V);
	    presskeys.keyRelease(KeyEvent.VK_V);
	    presskeys.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(3000);
	    presskeys.keyPress(KeyEvent.VK_ENTER);
	    presskeys.keyRelease(KeyEvent.VK_ENTER);
	

	}

}
