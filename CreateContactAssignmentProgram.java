package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactAssignmentProgram {
	public static void main(String[] args) throws InterruptedException {
		// Pseudo Code
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		// 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// 5. Click on contacts Tab
		driver.findElement(By.linkText("Contacts")).click();

		// 6. Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();

		// 7. Enter FirstName Field Using id Locator
		// 8. Enter LastName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Gomathi");

		// 9. Enter FirstName(Local) Field Using id Locator
		// 10. Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("Siddaiyan");

		// 11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("CSE");

		// 12. Enter Description Field Using any Locator of your choice
		driver.findElement(By.name("description")).sendKeys("Hi i am Gomathi");

		// 13. Enter your email in the E-mail address Field using the locator of your
		// choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("gomusidyan@gmail.com");

		// 14. Select State/Province as NewYork Using Visible Text
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stateName = new Select(state);
		stateName.selectByVisibleText("New York");
		Thread.sleep(1000);

		// 15. Click on Create Contact
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(1000);

		// 16. Click on edit button
		driver.findElement(By.linkText("Edit")).click();

		// 17. Clear the Description Field using .clear
		driver.findElement(By.id("updateContactForm_description")).clear();

		// 18. Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Am Working in CTS");

		// 19. Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		// 20. Get the Title of Resulting Page.
		System.out.println("The Title of the Resulting Page is: " + driver.getTitle());
	}

}
