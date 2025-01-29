package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite {
WebDriver driver;
long startTime;
long endTime;
long totalTime;
	
@BeforeSuite
public void launchBrowser() {
startTime = System.currentTimeMillis();	
System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
driver = new ChromeDriver();
}
	
@Test(priority = '2')	
public void openFacebook() {
driver.get("https://en-gb.facebook.com/login/web/");
	
}
@Test(priority = '0')
public void openInstagram() {
driver.get("https://www.instagram.com/");	
}
@Test(priority = '1')
public void openYoutube() {
driver.get("https://www.youtube.com/");	
}
@AfterSuite
public void closeBrowser() {
driver.quit();
endTime = System.currentTimeMillis();
totalTime = endTime - startTime;
System.out.println(totalTime);
	
}

}
