package seleniumweb;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement( By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Thread.sleep(5000);
		//1] normal alert with ok button
		//driver.switchTo().alert().accept(); the switch element takes to the alert and accept makes it close
		
		Alert myalert=driver.switchTo().alert();// here alert is stored into a variable
		System.out.println(myalert.getText());
		myalert.accept();
		
		//2]confirmation alert with ok and cancel button
		//to ok and close we will use accept() and for cancel and close we will use dimiss()
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
		//3] prompt alert -if we want to pass somevalue to input box
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("janvi");
		driver.switchTo().alert().accept();
	}

}
//alert is not webelement so we has to use switchTo()
