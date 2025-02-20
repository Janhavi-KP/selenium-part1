package seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalMethods {

	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize the browzer
			// get(url)- opens the url in the browser
		driver.get("https://demo.nopcommerce.com/");
		
		//isDisplayed() used to check the elements is displayed or noy
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display status of logo:"+logo.isDisplayed());
		//isEnabled() used to check the enabled or not..used in dropdown,inputbox,checkbox,buttons
		boolean status = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();	
		System.out.println("search input is enabled:"+status);
		//isSelected() used to check the element are selected or not ex-check box
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		//driver.findElement(By.xpath("//*[@id=\"rrvQ3\"]/div/label/input")).click();
		boolean status1 = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
		System.out.println("male checkbox is selected"+status1);
	}

}
