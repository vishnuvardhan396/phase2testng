package testNGAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestAnnotationEnabled {
	


	@Test(priority='1')
	public void login()
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
	}
	
	@Test(priority='2',dependsOnMethods= {"login"})
	public void composeEmail()
	{
		System.out.println("selenium code to compose Email");
	}
	
	// by default every Test method is enabled=true
	
	@Test(priority='3',dependsOnMethods= {"login","composeEmail"}, enabled=false) // method is disabled
	
	public void SearchEmail()
	{
		System.out.println("selenium code to searchEmail");
	}


}
