package newbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectablecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/selectable/serialize.html");
		
		List<WebElement> Alllists =  driver.findElements(By.xpath("/html/body/ol/li"));
		
		//int listsize1 = Alllists.size();
		//System.out.println(listsize1);
		 Actions forctrl = new Actions(driver);
		 
		 forctrl.keyDown(Keys.CONTROL).click(Alllists.get(0)).click(Alllists.get(1)).click(Alllists.get(2)).build().perform();
		 forctrl.clickAndHold(Alllists.get(0)).clickAndHold(Alllists.get(1)).build().perform(); 
		  
	}

}
