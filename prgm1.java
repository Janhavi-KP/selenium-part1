package seleniumweb;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class prgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Test case
		 * 1]open browser(chrome)
		 * 2]open url https://demo.opencart.com/ 
		 * 3] validate title should be "your store"
		 * 4]close browser
		 */
		//1] launch browser
		WebDriver driver= new ChromeDriver();
		//2]
		driver.get("https://demo.opencart.com/");
		//3]
		String actual_title=driver.getTitle();
		if(actual_title.equals("Your Store"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		//4]
		driver.close();
	}

}
