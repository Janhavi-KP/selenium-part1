package seleniumweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragNdrop_actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		//source element -rome, target element -italy
		WebElement srcElement=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement targetElement=driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.dragAndDrop(srcElement, targetElement).build().perform();
	}

}
