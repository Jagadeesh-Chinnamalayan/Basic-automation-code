package newbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node05dea4gik6evcm3p9rupyqlgc7936420.node0");
		WebElement emailbox= driver.findElement(By.id("j_idt88:name"));
		emailbox.sendKeys("test123@gmail.com");
		WebElement clearbox= driver.findElement(By.id("j_idt88:j_idt91"));
		clearbox.clear();
		WebElement appendbox=driver.findElement(By.id("j_idt88:j_idt91"));
		appendbox.sendKeys("add this text");
		WebElement boxclear= driver.findElement(By.id("j_idt88:j_idt95"));
		boxclear.clear();
		WebElement textvalue= driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div/form/div[5]/div/input"));
		String value= textvalue.getDomProperty("value");
		System.out.println(value);
		WebElement disabledbox= driver.findElement(By.id("j_idt88:j_idt93"));
		Boolean Enabled = disabledbox.isEnabled();
		System.out.println(Enabled);
		//driver.quit();
 
	}

}
