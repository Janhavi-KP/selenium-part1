package seleniumweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_paginationTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".parent[href='#collapse-5']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		
		//total number of pages
		String s=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		int Total_pages=Integer.parseInt(s.substring(s.indexOf("(")+1,s.indexOf("Pages")-1));//to make sub  string
		System.out.println(Total_pages);
		driver.quit();
		
		//repeating pages
		for(int p=1;p<Total_pages;p++)
		{
			if(p>1)
			{
				WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();
			}
			//reading data from particular page
			int rows= driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			
			for(int r=1;r<rows;r++)
			{
				String customerName=driver.findElement(By.xpath("//table[@class='table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
				
				String email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
			
				String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[5]")).getText();
				
				System.out.println(customerName+"\t"+email+"\t"+status);
				
			}
		}
	}

}
