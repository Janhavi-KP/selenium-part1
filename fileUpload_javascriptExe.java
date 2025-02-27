package seleniumweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload_javascriptExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file upload
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\91910\\OneDrive\\Desktop\\mini project\\1final.pdf");
		//validation 
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("1final.pdf")) {
			System.out.println("file is successfully uploaded");
		}
		else
		{
			System.out.println("upload failed");
		}*/
		
		//multiple file upload
		
		String file1="C:\\\\Users\\\\91910\\\\OneDrive\\\\Desktop\\\\mini project\\1final.pdf";
		String file2="C:\\\\Users\\\\91910\\\\OneDrive\\\\Desktop\\\\mini project\\FINAL MINI.pdf";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		int noOffileuploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size() ;//to count number of files uploaded
		//validation1-number of files
		if(noOffileuploaded==2)
		{
			System.out.println("all file are successfully uploaded");
		}
		else
		{
			System.out.println("missing files");
		}
		//validate file names
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("1final.pdf")&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("FINAL MINI.pdf"))
		{
			System.out.println("file is successfully uploaded");
		}
		else
		{
			System.out.println("upload failed");
		}
	
	
	}

}
