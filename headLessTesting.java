package seleniumweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class headLessTesting {

	public static void main(String[] args) {
		//headless testing means we cant see any ui actions .. it will run in backend
		
		ChromeOptions options=new ChromeOptions();//setting for headless execution
		
		options.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.opencart.com/");
		
		String actual_title=driver.getTitle();
		if(actual_title.equals("Your Store"))
		{
			System.out.println("title is correct");//sysout(cntrl+space returns the systm.out.println
			
		}
		else
		{
			System.out.println("Title is incorrect");
		}
			driver.quit();	
		
		
	}

}
