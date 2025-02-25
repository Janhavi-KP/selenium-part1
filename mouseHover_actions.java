package seleniumweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover_actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement Desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement Mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		//we hv to use action class-- coz these can be done only by mouse actions
		
		Actions act=new Actions(driver);//same for both mouse and keyboard actions
		
		act.moveToElement(Desktop).moveToElement(Mac).click().build().perform();//whenever we are calling from the action class it should end with the build and perform
		//build-create an action,, perform-complete the action
	}

}
