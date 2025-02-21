package seleniumweb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='country']"));
		Select Dropdowncntry =new Select(Dropdown);
		
		//select options from dropdown
		
		//Dropdowncntry.selectByVisibleText("France");//the visible thing in webpage
		
		//Dropdowncntry.selectByValue("japan");//if value is available in html then only we can use this
		
		Dropdowncntry.selectByIndex(2);//index has to be count mannually by doing inspect
		
		//to find total number of options
		List<WebElement>options=Dropdowncntry.getOptions();
		System.out.println("Number of options are:"+options.size());
		
		//printing those in my console window
		/*for(int i=0;i<options.size();i++)
		{
			System.out.println("options are "+options.get(i).getText());
		}*/
		
		//using enhanced for loop
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
	}

}
