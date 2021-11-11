package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountNoOfDropDownOptions {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		//How many Dropdown options are available in this page?
		List<WebElement> links = driver.findElements(By.tagName("select"));
		int size=links.size();
		System.out.println("How many Dropdown options are available in this page? :"+size);
		
	}
}
