package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountNoOfCheckBoxesInPage {

	public static void main(String[] args) {
		// Count No Of check boxes Present in a Page

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leafground.com/pages/checkbox.html");
			driver.manage().window().maximize();
			
			//How many check boxes are available in this page?
			List<WebElement> links = driver.findElements(By.xpath("//input[@type='checkbox']"));
			int size=links.size();
			System.out.println("How many check boxes are available in this page? :"+size);
		
		
		
		
	}

}
