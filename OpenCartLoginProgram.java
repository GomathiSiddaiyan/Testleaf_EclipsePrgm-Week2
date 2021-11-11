package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartLoginProgram {

	public static void main(String[] args) {
		// Open Cart Login page
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("input-username")).sendKeys("Gomathi");
		driver.findElement(By.id("input-firstname")).sendKeys("Gomathi");
		driver.findElement(By.id("input-lastname")).sendKeys("Siddaiyan");
		driver.findElement(By.id("input-email")).sendKeys("gomusidyan@gmail.com");
		
		WebElement dropdown=driver.findElement(By.id("input-country"));
		Select country=new Select(dropdown);
		country.selectByVisibleText("India");
		
		driver.findElement(By.name("password")).sendKeys("P@ssw0rd");
		
		
		
		
	}}
