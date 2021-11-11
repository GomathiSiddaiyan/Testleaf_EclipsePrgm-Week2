package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountNoOfLinksInPage {

	public static void main(String[] args) {
		// Count No Of Links Present in a Page
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		//How many links are available in this page?
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size=links.size();
		System.out.println("How many links are available in this page? :"+size);
	
	}}
