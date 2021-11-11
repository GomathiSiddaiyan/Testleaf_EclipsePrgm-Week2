package week2.day1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateLead {
	public static void main(String[] args) {
		// Create name,ph,

		WebDriverManager.chromedriver().setup();
		// Open the browser
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the browser
		driver.manage().window().maximize();

		// Enter UserName
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click Leads
		driver.findElement(By.linkText("Leads")).click();
		// Click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();

		// Type Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		// Type First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gomathi");
		// Type Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Siddaiyan");
		// Type phone number
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//Type Email-ID
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gomusidyan@gmail.com");
		// Click Create Lead Button
		driver.findElement(By.name("submitButton")).click();

		String title = driver.getTitle();
		System.out.println(title);
		String compName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(compName);

		// driver.close();
		// Step 9: Click Leads
		driver.findElement(By.linkText("Leads")).click();
		// Step 10: Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		// Step 11: Click on the phone tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[text()='Find Leads']/ancestor::tbody")).click();

	}

}
