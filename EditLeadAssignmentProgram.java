package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class EditLeadAssignmentProgram {
	public static void main(String[] args) throws InterruptedException {
//http://leaftaps.com/opentaps/control/main
//			
//1 Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
//2 Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//3 Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//4 Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
//5 Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
//6 Click Leads link
		driver.findElement(By.linkText("Leads")).click();
//7 Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
//8 Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Gomathi");
//9 Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

//10 Click on first resulting lead
		String firstResultID = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/child::a")).getText();
		System.out.println("First Result Lead ID: " + firstResultID);
		String firstResultName = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		System.out.println("First Result Lead Name: " + firstResultName);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/child::a")).click();

//11 Verify title of the page
		String title = driver.getTitle();
		System.out.println("The title of Current page is: " + title);
		if (title.equals("Duplicate Lead | opentaps CRM")) {
			System.out.println("The title Verified is same : " + title);
		}
//12 Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
//13 Change the company name
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("CTS");
		Thread.sleep(500);
//14 Click Update
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();

//15 Confirm the changed name appears
		String dup = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Name appears in the final page is : " + dup);
		if (dup.equals(firstResultName)) {
			System.out.println("Edited Company name of First Result Lead Name - " + dup);
		}

//16 Close the browser (Do not log out)
		driver.close();
		
	}

}
