package seleniumweb;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class cssLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize the browzer
		driver.get("https://demo.nopcommerce.com/");
		//tag id =  tagname#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("tshirts");
		// for tag class = tag.class name; sometimes the class name has large line then consider the first half only(before space) only consider
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("janhavi");
		//tag attribute= ("tag[attrivute='value']") syntax;// here we can consider attributes like name placeholder many more... just consider which is not repeated in another webelements
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("shorts");
		//tag class attribute = tag.classname[attribute='value']//tag name is optional for all the above and even this but . # should be there
		// when the tag name and class name is same for a webelement then we use this attribute.
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("pants");
		driver.close();	
		
	}

}
