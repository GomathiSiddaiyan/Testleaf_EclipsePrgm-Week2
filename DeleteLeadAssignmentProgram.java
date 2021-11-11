package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DeleteLeadAssignmentProgram {
	public static void main(String[] args) throws InterruptedException {
// /*http://leaftaps.com/opentaps/control/main
		// Delete Lead:
//1	Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

//2	Enter the user name
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

//3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

//4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();

//5	Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();

//6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();

//7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();

//8	Click on Phone
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();

//9	Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("9876543210");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

//10 Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']/ancestor::tbody")).click();
		Thread.sleep(1000);

//11 Capture lead ID of First Resulting lead
		String firstLeadID = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/child::a")).getText();
		System.out.println("First resulting Lead ID" + firstLeadID);

//12 Click First Resulting lead
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/child::a")).click();

//13 Click Delete
		driver.findElement(By.className("subMenuButtonDangerous")).click();

//14 Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();

//15 Enter captured lead ID
		driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']//input")).sendKeys(firstLeadID);

//16 Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']/ancestor::tbody")).click();
		Thread.sleep(1000);

//17 Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String display = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if (display.equals("No records to display")) {
			System.out.println("No records to display");
		}

//18 Close the browser (Do not log out)
		driver.close();

	}

}
