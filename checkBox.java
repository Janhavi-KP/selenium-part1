package seleniumweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class checkBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//1] seleect specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2]select all the checkbox
		java.util.List<WebElement>checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		/*
		 normal for loop
		 for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		*/
		/*
		 for(WebElement checkbox:checkboxes)//enhanced for loop
		 {
			 checkbox.click();
		 }
		 */
		/*3]select last 3 checkboxes total no of checkbox- how many checkbox want to select =starting index
		 for(int i=4;i<checkboxes.size();i++)//last 3 selected
		 {
			 checkboxes.get(i).click();
		 }
		 */
		 //4]selecting first3 checbox
			for(int i=0;i<3;i++)//first 3 selected
			{
			 checkboxes.get(i).click();
			}
		 Thread.sleep(5000);
		//5] unselect checkboxes if they are selected
		 for(int i=0;i<checkboxes.size();i++)//all will selected
		 {
			 if(checkboxes.get(i).isSelected())
			 {
			 checkboxes.get(i).click();
			 }
		 }
		  
	}

}
