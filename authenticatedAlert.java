package seleniumweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticatedAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		

	}

}
// authentication alert -- without giving username and password in an alert window the page will doesnt open 
//we cannot use either switchTo or explicit and also its not webelement
// http://username:password@the-internet.herokuapp.com/basic_auth