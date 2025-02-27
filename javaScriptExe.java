package seleniumweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class javaScriptExe {

	public static void main(String[] args) {
		// Whenever we has element intercepted exception then only we use js 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		//passing the txt into input box--alternate of sendkeys method 
		JavascriptExecutor js= (JavascriptExecutor)driver;//object of child class is storing into parent class interface
		
		js.executeScript("arguments[0].setAttribute('value','John')",inputbox);
		
		//click action using js
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeAsyncScript("arguments[0].click()",radiobtn);
		
	}

}
/* ChromeDriver driver= new ChromeDriver();//declaring driver instance
JavascriptExecutor js= driver;//if we use chrome and chrome only then there is no need of type casting*/