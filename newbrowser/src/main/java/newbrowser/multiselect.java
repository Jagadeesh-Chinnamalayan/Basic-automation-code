package newbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class multiselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		
		WebElement ddown1 = driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div[2]/div[1]/div[1]/div/div[1]/article/div/div/div/select[2]"));
		Select ddact1 = new Select(ddown1);
		ddact1.selectByValue("vs");
		ddact1.selectByValue("ij");
		ddact1.selectByValue("ec");
		ddact1.selectByValue("nb");
		
		List<WebElement> options = ddact1.getOptions();
		int optionsize = options.size();
		System.out.println("The size of the options"+optionsize); 
		
		driver.quit();		

	}

}
