package seleniumweb;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class captureScreenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1]full page screenshots
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File sourcfile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\takeScreenshots\\fullpage.png");
		//system.getproperty returns the directory where the file is saved
		sourcfile.renameTo(targetfile);//it copies sorcefile to targetfile
		
		//2] capturing specific area
		WebElement featuredProduct=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourcefile1 = featuredProduct.getScreenshotAs(OutputType.FILE);
		File targetfile1=new File(System.getProperty("user.dir")+"\\takeScreenshots\\specificArea.png");
		sourcefile1.renameTo(targetfile1);
		
		//3] specific webElment
		WebElement Product=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile2 = featuredProduct.getScreenshotAs(OutputType.FILE);
		File targetfile2=new File(System.getProperty("user.dir")+"\\takeScreenshots\\logo.png");
		sourcefile2.renameTo(targetfile2);
		driver.quit();
		
		
		
	}

}
