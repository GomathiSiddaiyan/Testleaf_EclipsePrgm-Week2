package week2.day1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FindElementsProgram {
public static void main(String[] args) {	
	 WebDriverManager.chromedriver().setup(); 
	//Step 1: Open the browser
	 ChromeDriver driver=new ChromeDriver();	
	//Step 2: Load the URL
	 driver.get("http://leafground.com/pages/checkbox.html");	
	//Step 3: Maximize the browser
	 driver.manage().window().maximize();	
	 
	List<WebElement> ele= driver.findElements(By.xpath("//input[contains(@type,'checkbox')]"));
	int size= ele.size();
	System.out.println(size);
	System.out.println(ele);
}
}
