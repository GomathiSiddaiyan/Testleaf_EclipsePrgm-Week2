package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownProgram {

	public static void main(String[] args) {

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
		 
		 //Step 12: Select Currency as INR using text

		 WebElement currency = driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
		 Select selectCurrency=new Select(currency);
		 selectCurrency.selectByVisibleText("INR - Indian Rupee");
		 WebElement country = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		 Select selectCountry=new Select(country);
		 selectCountry.selectByValue("IND");
		//Step : Click Create Contact Button
		// driver.findElement(By.name("submitButton")).click();	
		 
		 
		 
	}

}
