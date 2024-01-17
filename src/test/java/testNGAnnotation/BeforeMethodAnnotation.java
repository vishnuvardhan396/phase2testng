package testNGAnnotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BeforeMethodAnnotation {

	
WebDriver driver;
	
	@BeforeMethod
	public void openBrowser()
	{
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
	driver.close();
	}
	
	@Test(priority='1')
	public void createAccount()
	{
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up&returntoquery=centralAuthAutologinTried%3D1%26centralAuthError%3DNot%2Bcentrally%2Blogged%2Bin");
		driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='wpPassword2']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@id='wpCreateaccount']")).click();
		
}
	
	@Test(priority='2')
	public void login()   // this will be referred as test method
	{
		
		driver.get("https://en.wikipedia.org/w/index.php?returnto=Wikipedia%3ASign+up&title=Special:UserLogin&centralAuthAutologinTried=1&centralAuthError=Not+centrally+logged+in");
		driver.findElement(By.xpath("//input[@id='wpName1']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='wpPassword1']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@id='wpLoginAttempt']")).click();
		
		
	}
	
	@Test(priority='3')
	
	public void account()
	{
		
		driver.get("https://en.wikipedia.org/w/index.php?returnto=Wikipedia%3ASign+up&title=Special:UserLogin&centralAuthAutologinTried=1&centralAuthError=Not+centrally+logged+in");
	}

		

}
