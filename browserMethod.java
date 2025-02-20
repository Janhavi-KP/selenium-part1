package seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserMethod {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize the browzer
		// get(url)- opens the url in the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		//driver.close(); close the first window..
		driver.quit();// close the all windows
		
}
}