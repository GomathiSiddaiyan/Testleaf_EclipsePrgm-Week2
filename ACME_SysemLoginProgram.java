package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACME_SysemLoginProgram {

	public static void main(String[] args) throws InterruptedException {
		// ACME_Sysem Login Program
		
//		1. Load url "https://acme-test.uipath.com/login"
		WebDriverManager.edgedriver().setup(); 
		EdgeDriver driver=new EdgeDriver();
		
		//ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
//		2. Enter email as "kumar.testleaf@gmail.com"
		driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");
		
//		3. Enter Password as "leaf@12"
		driver.findElement(By.name("password")).sendKeys("leaf@12");
		
//		4. Click login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
//		5. Get the title of the page and print
		String title=driver.getTitle();
		System.out.println("The Title of the page is : "+title);
		
//		6. Click on Log Out
		driver.findElement(By.linkText("Log Out")).click();
		
//		7. Close the browser (use -driver.close())
		driver.close();
		
	}

}
