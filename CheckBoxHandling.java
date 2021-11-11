package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxHandling {

	public static void main(String[] args) throws InterruptedException {
		// CheckBox Handling

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();

		// Select the languages that you know?
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();

		// Confirm Selenium is checked
		boolean enabled = driver.findElement(By.xpath("//div[text()='Selenium']")).isSelected();
		if (enabled) {
			System.out.println("Selenium is checked");
		} else {
			System.out.println("Selenium is Unchecked");
		}
		Thread.sleep(2000);

		// DeSelect only checked
		// driver.findElement(By.xpath("//div[text()='I am Selected']/ancestor::div")).click();
		// driver.findElement(By.linkText("I am Selected")).click(); }
		// boolean option =driver.findElement(By.linkText("I am // Selected")).isSelected();
		boolean option = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[3]/div[1]/input[1]")).isSelected();  
		if (option) 
		{ System.out.println("Check box 'I am Selected' is already selected so am DeSelecting now "); 
		  driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[3]/div[1]/input[1]")).click();
		}
		
		boolean option1 = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[3]/div[2]/input[1]")).isSelected();
		if (option1)
		{
			System.out.println("Check box 'I am Selected' is already selected so am DeSelecting now ");
			driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[3]/div[2]/input[1]")).click();
		}
	 
		//Select all below check boxes
		List<WebElement> allChk = driver.findElements(By.tagName("input"));
		int size = allChk.size();
		System.out.println("The total count of check box present in this page is: " + size);
		allChk.get(size - 5).click();
		allChk.get(size - 4).click();
		allChk.get(size - 3).click();
		allChk.get(size - 2).click();
		allChk.get(size - 1).click();

	}}
