package ui;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyPageandText {
	
@Test
	
	public void VerifyPage() throws InterruptedException
	{
	    SoftAssert softassert = new SoftAssert();
		String expectedTitle ="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedText ="Search";
		System.setProperty("webdriver.chrome.driver", "/Users/anurakshitachandra/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		String actualTitle= driver.getTitle();
		System.out.println("verify title");
		
		softassert.assertEquals(actualTitle, expectedTitle);
		String actualText = driver.findElement(By.xpath("//*[@id='gh-btn']")).getAttribute("value");
		System.out.println("Verify text");
		softassert.assertEquals(actualTitle, expectedTitle, "verification failed");
		softassert.assertEquals(actualText, expectedText, "verification failed");
		System.out.println("closing browser");
		
		driver.close();
		
		softassert.assertAll();
	}


}
