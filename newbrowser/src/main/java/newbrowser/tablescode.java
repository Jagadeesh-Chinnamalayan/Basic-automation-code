package newbrowser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablescode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/tables");

		List<WebElement> numberofrows = driver.findElements(By.tagName("tr"));
		int rowsize = numberofrows.size();
		List<WebElement> numberofcolumns = driver.findElements(By.tagName("th"));
		int columnsize = numberofcolumns.size();
		System.out.println("Rows = "+rowsize + "   "+"columns = "+columnsize );
		
		WebElement firefox = driver.findElement(By.xpath("//td[normalize-space()='Doe']//following::td[3]"));
		String cpupercent = firefox.getText();
		System.out.println(cpupercent);
		
		List<WebElement> alldata = driver.findElements(By.xpath("//td[4]"));
		
		ArrayList<Float> intnum = new ArrayList<Float>();
		 
        for (WebElement setnumbers : alldata) {   
        	
        String multiplenums =setnumbers.getText().replace("$", "   ");
         Float nenum = Float.parseFloat(multiplenums);
        intnum.add(nenum);
			
		}
			 
        System.out.println(intnum);
        
        //if (!intnum.isEmpty()) {
            Float minValue = Collections.min(intnum); // Find smallest value
            Float maxValue = Collections.max(intnum); // Find largest value
            
            System.out.println("Smallest value: " + minValue);
            System.out.println("Largest value: " + maxValue);
        //} else {
           // System.out.println("The list is empty.");
        }
    }
//}