package SeleniumCode;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ButtonHandling {

	public static void main(String[] args) throws InterruptedException {
		// Button handling
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		//Click button to travel home page
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		Thread.sleep(3000);
		
		//Find position of button (x,y)
		System.out.println("Return type of getLocation is point");
		Point position = driver.findElement(By.id("position")).getLocation();
		System.out.println("Finding position of button (x,y) is: "+ position);
		
		//Find button color
		System.out.println("Return type of getCssValue is String");
		String color=driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("Finding the button color: "+ color);
		
		//Find the height and width
		System.out.println("Return type of getSize is Dimension");
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println("Finding the height and width of the button: "+size);
		
	}}
