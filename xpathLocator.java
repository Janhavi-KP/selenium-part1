package seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize the browzer
		driver.get("https://demo.nopcommerce.com/");
		// xpath has the address of the element
		//xpath works based on DOM(documnet object model) which is got created when we browse the webpage
		// types of xpath-absolute(full) xpath and relative (partial) xpath
		//syntax tagname[@attribute='value'] or *[@attribute='value']
		 //[ if u cant import press ctrl+shift+ o ]
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("T-shirts");//xpath with single attribute
		
		//xpath with multiple attributes
		driver.findElement(By.xpath("//input[@id='small-searchterms'][]@name='search']"));
		//xpath with and , or operator i.e the both attrivutes should be true for and operator, for or operator atleast 1 attribute has to be crct
		//xpath with text() used only when it has inner text in it

		driver.findElement(By.xpath("//*[text()='Electronics']")).click();
		// xpath with contains //input[contains (@ nameoftheattribute , 'value ') in the value no need to give the complete value by giving partial also it will search .. ex for search as a value we can give it has sea
		driver.findElement(By.xpath("//input[@name='sea']")).sendKeys("T-shirts");
		 // we can also use start-with .. in that we have to write a starting letters of a value
		// chained xpath- lets consider it dosnt has any attributes and inner text then we have to look into parents xpath
		driver.findElement(By.xpath("//div[@id='logo']/a/img"));
		
	
	}

}
