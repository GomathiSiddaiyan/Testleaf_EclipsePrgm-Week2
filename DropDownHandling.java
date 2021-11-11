package SeleniumCode;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DropDownHandling {
	public static void main(String[] args) throws InterruptedException {
		// DropDown Handling
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		//Select training program using Index
		WebElement dropdown1=driver.findElement(By.id("dropdown1"));
		Select byIndex=new Select(dropdown1);
		byIndex.selectByIndex(1);
		
		//Select training program using Text
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select byText= new Select(dropdown2);
		byText.selectByVisibleText("Appium");
		
		//Select training program using Value
		WebElement dropdown3 = driver.findElement(By.name("dropdown3"));
		Select byValue= new Select(dropdown3);
		byValue.selectByValue("3");
		
		//Get the number of dropdown options
		List<WebElement> links = driver.findElements(By.tagName("select"));
		int size=links.size();
		System.out.println("How many Dropdown options are available in this page? :"+size);
		Thread.sleep(2000);
				
		//You can also use sendKeys to select
		WebElement sendKey = driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select"));
		Select text=new Select(sendKey);
		//   //option[text()='You can also use sendKeys to select']
		text.selectByVisibleText("Appium");
		
		//Select your programs
		WebElement dropdown4 = driver.findElement(By.xpath("//option[text()='Loadrunner']/parent::select[@multiple]"));
		Select select1= new Select(dropdown4);
		select1.selectByVisibleText("Selenium");
		WebElement dropdown5 = driver.findElement(By.xpath("//option[text()='Loadrunner']/parent::select[@multiple]"));
		Select select2= new Select(dropdown5);
		select2.selectByVisibleText("Appium");
		
		
	}

}
