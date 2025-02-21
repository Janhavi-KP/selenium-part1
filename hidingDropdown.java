package seleniumweb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidingDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//click on PIM
		driver.findElement(By.xpath("//a[normalize-space()='PIM']")).click();
		
		//click on dropdown
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
		
		//select single option
		//driver.findElement(By.xpath("//span{normalize-space()='Financial Analyst']")).click();
		
		//count number of options
		List<WebElement>options= driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		System.out.println("Number of options:"+options.size());
		
		//printing options
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
	}

}
