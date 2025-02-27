package seleniumweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class disabledAutomatedMessegeOnScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		
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
			//driver.quit();	
		
		
	}

}
