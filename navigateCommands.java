package seleniumweb;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommands {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//navigate.to and get methods are same in functionality .. they both opens the url.. the diff is in get method we can give only string but in navigate it could be string or an object
		/*navigate().to as string
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");*/
		//navigate().to as object
		URL myurl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(myurl);
		driver.navigate().to("https://demo.nopcommerce.com/");
		
		driver.navigate().back();//goback to previous webpage
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();// it forward the webpage
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();//it refresh the webpage
	
	}

}
