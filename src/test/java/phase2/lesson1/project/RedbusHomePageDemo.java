package phase2.lesson1.project;



import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RedbusHomePageDemo {


	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		// Code for removing push notification:
		//Create a class to handle external elements.  (Alerts)
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		




		// Clear the source text box
		
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")).clear();
	
	// enter input string in text box
		
	driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")).sendKeys("Paris");
				
				Thread.sleep(5000);
				// capture element form the list
		driver.findElement(By.xpath("//div[@class='autoFill autosuggest-ul rdc-src']/descendant::li[3]")).click();
				
				// destination
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")).clear();
		
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")).sendKeys("London");
			
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='autoFill autosuggest-ul rdc-dest']/descendant::li[3]")).click();
			
		//calander
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("date-box")).click();
		
		Thread.sleep(5000);
		
		//Select date
		
		driver.findElement(By.xpath("//div[@class='DatePicker__CalendarContainer-sc-1x9sb82-0 bkhtIz']/descendant::span[41]")).click();
		
				   Thread.sleep(5000);	
				   
				   //click on search button
				   driver.findElement(By.id("search_butn")).click();


		
		// Upload file using autoIT
		
driver.get("https://www.remove.bg/");
		
		Thread.sleep(3000);
		
		WebElement e1 = driver.findElement(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]")));
		
		e1.click();
		
		Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\AutiitScripts\\Scriptupload3.exe");
		
		
		// handle webelement using mouse hover
		
driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement e2 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		
		
		Actions a = new Actions(driver);
		
		
		a.moveToElement(e2).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//span[@class='nav-text'])[7]")).click();
		
		
		// DB demo
		
		
		// Screenshot
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("./Screenshots/project.png");


		FileUtils.copyFile(srcFile, destFile);
		
		
		
		
		
		
	}


}


