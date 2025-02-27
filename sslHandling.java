package seleniumweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sslHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// when the page asks to get accept the ssl certificates then we use this
		ChromeOptions options=new ChromeOptions();//setting for headless execution
		options.setAcceptInsecureCerts(true);
			
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println("title of the page:"+driver.getTitle());
		
		
	}

}
