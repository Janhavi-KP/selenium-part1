package seleniumweb;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();//to maximize the window
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.name("search")).sendKeys("Mac");//sendkeys are used to send the data ex mac to the search board 
		Boolean logo_diplayed=driver.findElement(By.id("logo")).isDisplayed();// to chcek whether the logo is displayed or not
		System.out.println("logo_displayed");
		//link text
		driver.findElement(By.linkText("Tablets")).click();
		List<WebElement>headerLinks=driver.findElements(By.className("list-inline-item"));
		// list is used coz we are searching for a group of elements.. and also we have to use findelements instead of findelement
		//whenever we are using class it has more than one elements.. and we have to look in list collection or set collection when we do inspect
		System.out.println("total number of header links are"+headerLinks.size());//it gives thetotal number of header links 
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("total number of links"+links.size());//it gives the total number of links present in the webpage
		List<WebElement>image=driver.findElements(By.tagName("img"));
		System.out.println("total number of images"+image.size());//the tage name of every image is img by considering that we can find the total number of images
	}
	

}
