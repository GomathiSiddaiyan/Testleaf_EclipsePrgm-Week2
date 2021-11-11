package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstContactId {

	public static void main(String[] args) throws InterruptedException {
		
// Contact Tab-> Find contact-> Enter name-> Find first match by lead ID 
		
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
		 driver.findElement(By.linkText("CRM/SFA")).click(); //Click CRM/SFA

		//Step 8: Click Contacts Tab
		 driver.findElement(By.linkText("Contacts")).click();	
		//Step 9: Click Find Contacts
		 driver.findElement(By.linkText("Find Contacts")).click();
		 
		 //Step 10: Type first name with your name
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Gomathi");
		 Thread.sleep(3000);
		//Step 11: Click Find Contacts button
		 driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();		
		
		 //Step 11: Print the first contact id
		 String firsContactId=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		 System.out.println(firsContactId);
		 Thread.sleep(2000);
		 //Step 12: Click on the first matching contact id
		 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		
	}

}
