package seleniumweb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//counting total number of rows in a table
		int rows=driver.findElements(By.xpath("//table[@ name='BookTable']//tr")).size();
		System.out.println(rows);
		
		//to find total number of columns
		int columns= driver.findElements(By.xpath("//table[@ name='BookTable']//th")).size();
		System.out.println(columns);
		
		//capture the data from 5th row and first column
		
		String row5=driver.findElement(By.xpath("//table[@ name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(row5);
		
		//read the data from all rows and columns
		List<WebElement>read=driver.findElements(By.xpath("//table[@ name='BookTable']"));
		/*for(WebElement op:read)
		{
			System.out.println(op.getText());
		}*/
		
		
		//without header read all the data from table
		/*for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<columns;c++)
			{
				String value= driver.findElement(By.xpath("//table[@ name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}*/
		
		
		//i want to retrieve all the bookname written by mukesh
		for(int r=2;r<=rows;r++)
		{
			String authorName=driver.findElement(By.xpath("//table[@ name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(authorName.equals("Mukesh"))
			{
				String bookName=driver.findElement(By.xpath("//table[@ name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookName);
			}
		}
		
		// find total price of all the books
			int total =0;
			for(int r=2;r<rows;r++)
			{
				String price= driver.findElement(By.xpath("//table[@ name='BookTable']//tr["+r+"]//td[4]")).getText();
				total=total+Integer.parseInt(price);
				
				
			}
			System.out.println(total);
		}
	}


