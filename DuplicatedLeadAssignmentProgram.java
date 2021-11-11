package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DuplicatedLeadAssignmentProgram {
	public static void main(String[] args) throws InterruptedException {
// http://leaftaps.com/opentaps/control/main

//1	Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
//2	Enter the UserName
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
//8	Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
//9	Enter Email
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("gomusidyan@gmail.com");
//10 Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);

//11 Capture name of First Resulting lead
		String firstResultID = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/child::a")).getText();
		System.out.println("First Result Lead ID: " + firstResultID);
		String firstResultName = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		System.out.println("First Result Lead Name: " + firstResultName);

//12 Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/child::a")).click();

//13 Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(1000);

//14 Verify the title as 'Duplicate Lead'
		String title = driver.getTitle();
		System.out.println("The title of Current page is: " + title);
		if (title.equals("Duplicate Lead | opentaps CRM")) {
			System.out.println("The title Verified is same : " + title);
		}

//15 Click Create Lead
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

//16 Confirm the duplicated lead name is same as captured name
		String dup = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (dup.equals(firstResultName)) {
			System.out.println(" Duplicated Lead Name is same as First Result Lead Name");
		}
//17 Close the browser (Do not log out)
		driver.close();

	}

}
