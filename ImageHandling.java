package SeleniumCode;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ImageHandling {
	public static void main(String[] args) {
		//Image Handling
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//Click on this image to go home page
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following::img")).click();
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
		
		
		//Am I Broken Image?
		boolean imgEnabled = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).isEnabled();
		if(imgEnabled)
		{
			System.out.println("The Image link is not broken");
			driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).click();
		}
		else
		{
			System.out.println("The Image link is broken");
		}
		
		//Click me using Keyboard or Mouse
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		System.out.println("Clicked by mouse");

	}}
