package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateContact {

	public static void main(String[] args) {
		// Create Contact in leaftaps website -- Assignment 2
		//Create Contact 

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
		 
		 
		//Step 12: Click Create Contact Button
		 driver.findElement(By.name("submitButton")).click();	
		 
		 
		//Step 13: Print the first name  
		 String firstName= driver.findElement(By.id("viewContact_firstName_sp")).getText();
		//Step 14: Print the browser title 
		 System.out.println("The First name of Contact :" +firstName);
		//Step 15: Close the browser
		 String title=driver.getTitle();	//Print browser title
		 System.out.println("Title of page : "+title);
		 

	}

}
