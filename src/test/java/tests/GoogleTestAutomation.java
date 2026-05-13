package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browserSetup.BrowserSetup;
import pages.GoogleSearch;
import utils.ReadExcel;
import utils.ReadPropeties;

public class GoogleTestAutomation {
	WebDriver driver;
	ReadPropeties rp= new ReadPropeties();
	@DataProvider(name = "test1")
	public Object[][] createData1() throws IOException {
		ReadExcel read= new ReadExcel();
		Object[][] data=read.readExcelData("./src/test/resources/TestData.xlsx", "TestData");
		
	return data;
	}
	@BeforeMethod
	@Parameters({ "Browser" })
	public void setup(@Optional ("chrome") String browser) throws IOException {
		BrowserSetup bs=new BrowserSetup();
		driver=bs.setupBrowser(browser);

		driver.get(rp.ReadProperty("./src/test/resources/config.properties", "url"));	
	}	

	@Test(dataProvider = "test1")
	public void testCase1(String keyword)  {
		Assert.assertEquals(driver.getTitle(), "Google");
		
		GoogleSearch searchPage= new GoogleSearch(driver);
		
		
		
		searchPage.EnterKeyword(keyword);
//		//driver.findElement(By.name("q")).sendKeys("testing");
//
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
