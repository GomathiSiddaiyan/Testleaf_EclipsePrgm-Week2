package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FaceBookProgram {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		
		// Step 2: Launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
				
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		Thread.sleep(500);
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(1000);
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@data-type='text']")).sendKeys("Gomathi");
		
		// Step 8: Enter the last name
		driver.findElement(By.xpath("(//input[@data-type='text'])[2]")).sendKeys("Siddaiyan");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
		
		// Step 10: Enter the password
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("P@ssw0rd");
		
		// Step 11: Handle all the three drop downs
		
		WebElement birthdayday = driver.findElement(By.xpath("//span[@data-type='selectors']//select[1]")); 
		new Select(birthdayday).selectByVisibleText("29"); 
		
		WebElement birthdaymonth = driver.findElement(By.xpath("//select[@name='birthday_day']/following-sibling::select[1]")); 
		new Select(birthdaymonth).selectByValue("5"); 
		
		WebElement birthdayyear = driver.findElement(By.xpath("//select[@id='month']/following-sibling::select[1]")); 
		new Select(birthdayyear).selectByValue("1997");
		
		// Step 12: Select the radio button "Female" 
		 //           ( A normal click will do for this step) 
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		
//		
//			Own xpath:
//		 WebElement date = driver.findElement(By.id("//select[@title='Day']"));
//		 Select selectdate=new Select(date);
//		 selectdate.selectByVisibleText("29");
//		 
//		 WebElement month = driver.findElement(By.id("//select[@id='day']/following-sibling::select"));
//		 Select selectMonth=new Select(month);
//		 selectMonth.selectByValue("5");
//		 
//		 WebElement year = driver.findElement(By.id("//select[contains(@id,'year')]"));
//		 Select selectYear=new Select(year);
//		 selectYear.selectByValue("1997");
		 	            
	}}
