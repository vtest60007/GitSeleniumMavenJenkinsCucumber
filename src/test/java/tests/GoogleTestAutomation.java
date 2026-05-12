package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.GoogleSearch;

public class GoogleTestAutomation {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver= new ChromeDriver();

		driver.get("https://www.google.com");	
	}	

	@Test
	public void testCase1() {
		Assert.assertEquals(driver.getTitle(), "Google");
		
		GoogleSearch searchPage= new GoogleSearch(driver);
		searchPage.EnterKeyword("selenium");
//		//driver.findElement(By.name("q")).sendKeys("testing");
//
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
