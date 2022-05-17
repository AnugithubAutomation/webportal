package ui;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
	
	@BeforeTest
	
	public void LoginToWebpage()
	{
		System.out.println("Loginpage is successful");
	 }
	@AfterTest
	public void LogoutToWebpage()
	{
		System.out.println("Logout is successful");	
	}
	
	@BeforeMethod
	
	public void connectedToDatabase()
	{
		System.out.println("connected to DB");
	}
	@AfterMethod
	public void disconnectedToDatabase()
	{
		System.out.println("disconnected to DB");
	}
	@Test(priority=1, description="login is successful")
	public void bTest1()
	{
 System.out.println("Test1");
 }
	@Test(priority=2, description="logout succesful")
	public void aTest2()
	{
		System.out.println("Test2");
	}
}