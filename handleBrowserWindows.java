package seleniumweb;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		//Approach1- when 2 or 3 windows present
		/*
		List<String>windowlist = new ArrayList(windowIDs);
		
		String parentId=windowlist.get(0);
		String childID=windowlist.get(1);
	
		//switch to child window
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		//switch to parent window
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		*/
		
		// approach2 when more number of windows present
		
		for(String winId : windowIDs)
		{
			String title = driver.switchTo().window(winId).getTitle();
			
			if(title.equals("OrangeHRM"))
					{
						System.out.println(driver.getCurrentUrl());
					}
					
		}
	}

}
