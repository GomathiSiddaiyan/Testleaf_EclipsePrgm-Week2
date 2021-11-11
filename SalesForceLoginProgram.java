package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SalesForceLoginProgram {
	public static void main(String[] args) throws InterruptedException {
		// SalesForce:

		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();

		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL
		driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		//Thread.sleep(3000);

		// Step 4: Maximise the window
		driver.manage().window().maximize();

		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Thread.sleep(3000);
		// Step 6: Fill in all the text boxes
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Gomathi");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Siddaiyan");
		driver.findElement(By.name("UserEmail")).sendKeys("gomusidyan@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Cognizant");
		driver.findElement(By.name("UserPhone")).sendKeys("9876543210");
		
		
		// Step 7: Handle all the dropdowns
		WebElement job = driver.findElement(By.name("UserTitle"));
		Select jobTitle = new Select (job);
		jobTitle.selectByValue("Developer");   		//option - value= 'Developer'
		
		WebElement emp = driver.findElement(By.name("CompanyEmployees"));
		Select empCount = new Select (emp);
		empCount.selectByValue("9"); 
		
		WebElement Country = driver.findElement(By.name("CompanyCountry"));
		Select CountryName = new Select (Country);
		CountryName.selectByVisibleText("India");
		
		// Step 8: Click the check box
		driver.findElement(By.className("checkbox-ui")).click();
		Thread.sleep(2000);
		// Step 9: Close the browser
		driver.close();
		// *Note: No need click Start my freeTrial

	}

}
