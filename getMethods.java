package seleniumweb;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize the browzer
		// get(url)- opens the url in the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		//getTitle() - returns the title of the webpage
		System.out.println(driver.getTitle());
		//getCurrentUrl() - gives the current url
		System.out.println(driver.getCurrentUrl());
		//getPageSource() - gives the source code of the pg
		System.out.println(driver.getPageSource());
		// getWindoeHandle()-- returns the ID of single window page
		System.out.println(driver.getWindowHandle());// the id will be dynamic keeps changing
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//getWindowHandles()-- returns multiple window id(when there are multiple windows openend)
		Set<String>windowids=driver.getWindowHandles();
		System.out.println(windowids);
	
	}

}
