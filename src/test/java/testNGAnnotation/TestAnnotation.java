package testNGAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestAnnotation {
	
	
	@Test
	public void createAccount()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up&returntoquery=centralAuthAutologinTried%3D1%26centralAuthError%3DNot%2Bcentrally%2Blogged%2Bin");
		driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='wpPassword2']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@id='wpCreateaccount']")).click();
	}
    @Test
	public void login()   // this will be referred as test method
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?returnto=Wikipedia%3ASign+up&title=Special:UserLogin&centralAuthAutologinTried=1&centralAuthError=Not+centrally+logged+in");
		driver.findElement(By.xpath("//input[@id='wpName1']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='wpPassword1']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@id='wpLoginAttempt']")).click();
		
	}


	@Test
	public void teardown()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?returnto=Wikipedia%3ASign+up&title=Special:UserLogin&centralAuthAutologinTried=1&centralAuthError=Not+centrally+logged+in");
		driver.close();
		
	}
	

}
