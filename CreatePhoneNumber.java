package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatePhoneNumber {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		//Step 1: Open the browser
		 ChromeDriver driver=new ChromeDriver();	
		//Step 2: Load the URL
		 driver.get("http://leaftaps.com/opentaps/control/main");	
		//Step 3: Maximize the browser
		 driver.manage().window().maximize();	
		 
		//Step 4: Enter UserName
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");	
		//Step 5: Enter Password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");	
		//Step 6: Click Login
		 driver.findElement(By.className("decorativeSubmit")).click();	
		 
		 
		//Step 7: Click CRM/SFA
		 driver.findElement(By.linkText("CRM/SFA")).click(); 
		//Step 8: Click Contacts Tab
		 driver.findElement(By.linkText("Contacts")).click();	
		//Step 9: Click Create Contact
		 driver.findElement(By.linkText("Create Contact")).click();	
		//Step 10: Type First Name
		 driver.findElement(By.id("firstNameField")).sendKeys("Gomathi");	
		//Step 11: Type Last Name
		 driver.findElement(By.id("lastNameField")).sendKeys("Siddaiyan");	
		 
		 //Step 12: Type Phone Number
		 driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("9876543210");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//Step : Click Create Contact Button
		 driver.findElement(By.name("submitButton")).click();	
		 
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
	}

}
