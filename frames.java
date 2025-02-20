package seleniumweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// using webelement//frame1
		WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();//go back to page
		//frame2 webelement sending 
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Well");
		driver.switchTo().defaultContent();
		
		//frame3 -iframe
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Wellgo");
		
		//innerframe in iframe or frame3
		driver.switchTo().frame(0);//switching to the frame using index
		driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		driver.switchTo().defaultContent();
	}

}
//driver.switchTo().frame(name)
//driver.switchTo().frame("id")
//driver.switchTo().frame(WebElement)  convert frame into webelement then pass it