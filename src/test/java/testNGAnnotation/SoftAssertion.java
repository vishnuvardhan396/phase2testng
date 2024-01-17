package testNGAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
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
		SoftAssert sf = new SoftAssert();
		
		String expectedTitle = "Downloads | Selenium";
		
		String actualTitle = driver.getTitle(); // Downloads | Selenium
		
		// we will check if expected title == actual title-> add assertions
		
		sf.assertEquals(actualTitle, expectedTitle,"The title are not matching");// error will be captured
		
		// but in case of soft assert.. further lines of code will continue to execute
		Thread.sleep(2000);
		
		System.out.println("Assertion was passed");
		//driver.findElement(By.xpath("(//div[@class='card-body px-0 text-center'])[3]/descendant::a[3]")).click();
		
		System.out.println("click on the link");
		
		sf.assertAll(); // print  all the assertion that have failed.
		
	}
}

