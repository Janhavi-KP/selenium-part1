package seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class dayPicker {
	
	static void selectMonthandYear(WebDriver driver,String month,String year)
	{
		 while(true)
	        {
	        	String CurrentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//to get month
	        	String CurrentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//actual year from application
	        	
	        	if(CurrentMonth.equals(month)&&CurrentYear.equals(year))
	        	{
	        		break;
	        	}
	        	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	        	
	        }
	}
	
	static void selectDate(WebDriver driver,String date)
	{
		List<WebElement>allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        for(WebElement op:allDates)
        {
        	if(op.getText().equals(date))
        	{
        		op.click();
        		 break;
        	}
        	
        }
	}
    public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Set implicit wait (acts as a backup, but explicit wait is preferred)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the webpage
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        // Switch to iframe because the datepicker input is inside an iframe
        driver.switchTo().frame(0);

       //Method1- using senkeys
       // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02/12/25");//mm/dt/yr
        Thread.sleep(3000);
        
        //Method2- using date picker--expected data
        String year="2025";
        String month="May";
        String date="20";
        
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
      
        selectMonthandYear(driver,month,year);
        selectDate(driver,date);
        //driver.quit();
    }
}

//explicit wait can be use when if the xpath is crct and the error is no such element exception
// Use WebDriverWait to wait until the element is visible
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//WebElement dateInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='datepicker']")));
//Now send the date input
//dateInput.sendKeys("02/25/2025");