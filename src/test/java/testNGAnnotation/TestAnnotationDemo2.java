package testNGAnnotation;

import org.testng.annotations.Test;

public class TestAnnotationDemo2 {

	@Test(priority='1')
	public void login()
	{
		System.out.println("selenium code to login");
	}
	
	@Test(priority='2')
	public void composeEmail()
	{
		System.out.println("selenium code to compose Email");
	}
	
	@Test(priority='3')
	
	public void SearchEmail()
	{
		System.out.println("selenium code to searchEmail");
		}
		
		@Test(priority='4')
		public void DeleteEmail()
		{
			System.out.println("selenium code to Delete email");
		}
		@Test(priority='5')
		public void Logout()
		{
			System.out.println("selenium code to logout");
		}
		


}
