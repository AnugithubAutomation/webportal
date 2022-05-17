package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyPageTitle {
	
	@Test
		public void VerifyPage()
	{
		String expectedTitle ="Electronics, Cars, Fashion, Collectibles & More | eBay";
		System.setProperty("webdriver.chrome.driver", "/Users/anurakshitachandra/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		String actualTitle= driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}

}
