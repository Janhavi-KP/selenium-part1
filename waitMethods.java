package seleniumweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitMethods {
	  public static void main(String[] args) {
	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//Thread.sleep(3000);//pause the execution 3sec not given by selenium given by java .. has many disadvantages
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// we will write in the begining.. it activates for everyline 
		//explicit wait
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));//declaration of explicit wait
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement txtusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		txtusername.sendKeys("Admin");
		//if we use explicit wait there is no need of writing a findelement coz the explicit code itself finds the element and store in the variable
		//like visibilityofElementedLocated there are many options like elementToBeClickable etc
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

}
/* FLUENT WAIT
 * // Waiting 30 seconds for an element to be present on the page, checking
 */
// for its presence once every 5 seconds.
 for declaration--Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    .withTimeout(Duration.ofSeconds(30L))
    .pollingEvery(Duration.ofSeconds(5L))
    .ignoring(NoSuchElementException.class);

for usage--WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
  public WebElement apply(WebDriver driver) {
    return driver.findElement(By.id("foo"));
  }
});*/