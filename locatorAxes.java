package seleniumweb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class locatorAxes {

	public static void main(String[] args) {
		        // Set up WebDriver
		       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update path
		        WebDriver driver = new ChromeDriver();
		        
		        // Maximize the window and set implicit wait
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        
		        // Open an eCommerce website (Example: Amazon)
		        driver.get("https://www.amazon.com/");

		        // 1. Child Axis Example: Find a child element (Example: Search box inside the form)
		        WebElement searchBox = driver.findElement(By.xpath("//form[@id='nav-search-bar-form']/child::div//input[@type='text']"));
		        searchBox.sendKeys("Laptop");

		        // 2. Parent Axis Example: Find the parent of the search button
		        WebElement searchButtonParent = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']/parent::div"));
		        System.out.println("Parent of Search Button: " + searchButtonParent.getTagName());

		        // 3. Descendant Axis Example: Find all links inside the header section
		        List<WebElement> headerLinks = driver.findElements(By.xpath("//header/descendant::a"));
		        System.out.println("Total header links: " + headerLinks.size());

		        // 4. Ancestor Axis Example: Find the ancestor of a specific element
		        WebElement logoAncestor = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']/ancestor::div"));
		        System.out.println("Ancestor of Logo: " + logoAncestor.getTagName());

		        // 5. Following Axis Example: Select elements appearing after a given element
		        List<WebElement> followingElements = driver.findElements(By.xpath("//a[@id='nav-logo-sprites']/following::a"));
		        System.out.println("Total following links: " + followingElements.size());

		        // 6. Following-Sibling Axis Example: Find the next sibling of an element
		        WebElement followingSibling = driver.findElement(By.xpath("//div[@id='nav-search']/following-sibling::div"));
		        System.out.println("Following Sibling Tag: " + followingSibling.getTagName());

		        // 7. Preceding Axis Example: Select elements before a given element
		        List<WebElement> precedingElements = driver.findElements(By.xpath("//input[@id='nav-search-submit-button']/preceding::input"));
		        System.out.println("Total preceding input elements: " + precedingElements.size());

		        // 8. Preceding-Sibling Axis Example: Find previous sibling of an element
		        WebElement precedingSibling = driver.findElement(By.xpath("//div[@id='nav-tools']/preceding-sibling::div"));
		        System.out.println("Preceding Sibling Tag: " + precedingSibling.getTagName());

		        // Close the browser
		        driver.quit();
		    }
		}

	


