package ui;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MaxLoginAutomationPage {
	
    @Test
	
	public void LoginPage() throws InterruptedException
	{
	
		
	System.setProperty("webdriver.chrome.driver", "/Users/anurakshitachandra/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://qa.max.com/login/");
	Thread.sleep(3000);
	//driver.close();
	
	WebElement username=driver.findElement(By.id("myusername")); 
	WebElement password=driver.findElement(By.id("mypassword"));
	
	WebElement login = driver.findElement(By.xpath("//button[@id='submit']"));
	username.sendKeys("anu@gmail.com"); 
	password.sendKeys("1234"); 
	login.click();
	String actualUrl=("https://qa.max.com/login/"); 
	String expectedUrl = driver.getCurrentUrl();
	
	Assert.assertEquals(actualUrl, expectedUrl);
	
	

	

}
}
