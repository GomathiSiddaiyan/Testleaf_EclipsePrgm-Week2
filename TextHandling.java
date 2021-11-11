package SeleniumCode;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Keyboard;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TextHandling {

	public static void main(String[] args) {
		// Edit Text Fields
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("gomusidyan@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(" Text as Hello and Pressing the keyboard Tab");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("username")).click(); // works as Pressing the keyboard Tab
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String defaultText= driver.findElement(By.name("username")).getText();
		System.out.println("The default text entered in the text box is: "+ defaultText);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		
		WebElement isTextBoxdisabled = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input"));
		boolean verify= isTextBoxdisabled.isDisplayed();
		System.out.println("Confirming that edit field is disabled :"+verify);
		
		
	}}
