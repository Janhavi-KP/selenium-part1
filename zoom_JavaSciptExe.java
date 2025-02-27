package seleniumweb;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoom_JavaSciptExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		//driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'");//set zoom level up to 50%
	}

}
