package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RatioButtonHandling {

	public static void main(String[] args) throws InterruptedException {
		// Ratio Button Handling

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();

		// Click the Radio Button
		driver.findElement(By.id("yes")).click();

		// Find default selected radio button
		boolean chk = driver.findElement(By.xpath("//input[@value='0']/parent::label[@for='Unchecked']")).isSelected();
		System.out.println(chk);
		if (chk) {
			System.out.println("Default selected radio button is UNCHECKED button");
		} 
		else {
			System.out.println("Default selected radio button is CHECKED button");
		}

		// Select your age group (Only if choice wasn't selected)
		Thread.sleep(2000);
		boolean age = driver.findElement(By.xpath("(//input[@name='age'])[2]")).isSelected();
		if (age) {
			System.out.println("My age group is already selected");
		} 
		else {
			driver.findElement(By.xpath("(//input[@name='age'])[3]")).click();
			System.out.println("My age group is above 40 years");
		}

	}}
