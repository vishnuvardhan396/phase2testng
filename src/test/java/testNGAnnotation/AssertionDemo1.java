package testNGAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AssertionDemo1 {
	
WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.selenium.dev/downloads/");
	}
	
	
	@Test(priority='1')
	public void gettitlemethod() throws InterruptedException
	{
		String expectedTitle = "DownloadsSelenium";
		
		String actualTitle = driver.getTitle(); // Downloads | Selenium
		
		// we will check if expected title == actual title-> add assertions
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		Thread.sleep(2000);
		
		System.out.println("Assertion was passed");
		//driver.findElement(By.xpath("(//div[@class='card-body px-0 text-center'])[3]/descendant::a[3]")).click();
		
		System.out.println("click on the link");
		
	}
	
	@AfterClass
	public void closebroser()
	{
		driver.close();
	}


}
