package seleniumweb;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class openLinkInNewTab_keyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement regElement=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act=new Actions(driver);
		//control+regsitration link
		act.keyDown(Keys.CONTROL).click(regElement).keyDown(Keys.CONTROL).perform();
		
		List <String>ids= new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(ids.get(1));//switch to registration page
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John Kendy");
	
	//switch to homepage
		driver.switchTo().window(ids.get(0));
		driver.findElement(By.xpath("//input[@id='small-searchitems']")).sendKeys("TShirts");
	}

}
