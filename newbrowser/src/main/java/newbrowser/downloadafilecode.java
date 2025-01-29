 package newbrowser;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadafilecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
		
		WebElement dldbutton = driver.findElement(By.id("downloadButton"));
		
		dldbutton.click();
		
		File filedld = new File("C:\\Users\\HP\\Downloads");
		
		File[] AllfilesinE = filedld.listFiles();
		
		for (File multifiles : AllfilesinE) {
			
			if (multifiles.getName(). equals("sampleFile.jpeg")){
				  
           System.out.println("The file name is"+ multifiles.getName());
				
			
		}		
		
	}
	}

}
