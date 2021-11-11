package SeleniumCode;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LinkHandling {
	public static void main(String[] args) throws InterruptedException {
		// Link Handling
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		//Go to Home Page link
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		Thread.sleep(3000);
		
		//Find where am supposed to go without clicking me?-
		String text = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println("The text visible in the link is: "+text);
		
		//Verify am I broken?
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String title=driver.getTitle();
		System.out.println("The Title of the page is :" +title);
		if(title.equals("HTTP Status 404 – Not Found"))
		{
			System.out.println("Yes the page is broken/ not found the website so navigating to previous page");
			driver.navigate().back();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("The website is working fine without any interrupt");
		}
		
		//Go to Home Page (Interact with same link name)
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();
		
		//How many links are available in this page?
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size=links.size();
		System.out.println("How many links are available in this page? :"+size);
		Thread.sleep(2000);
		

		
		
	}}
