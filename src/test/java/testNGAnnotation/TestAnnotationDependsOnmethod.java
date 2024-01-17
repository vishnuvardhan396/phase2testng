package testNGAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestAnnotationDependsOnmethod {


	@Test(priority='1')
	public void login()
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.findElement(By.id("//input[@type=\"checkboxgdfgdfg\"]")).sendKeys("admin");
		
	}
	
	@Test(priority='2',dependsOnMethods= {"login"})
	public void composeEmail()
	{
		System.out.println("selenium code to compose Email");
	}
	
	@Test(priority='3',dependsOnMethods= {"login","composeEmail"})
	
	public void SearchEmail()
	{
		System.out.println("selenium code to searchEmail");
	}
}



