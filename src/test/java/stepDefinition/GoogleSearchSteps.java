package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import browserSetup.BrowserSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoogleSearch;
import utils.ReadPropeties;

public class GoogleSearchSteps {
	WebDriver driver;
	ReadPropeties rp= new ReadPropeties();
	
//	@Given("I am on the Google search page")
//	public void i_am_on_the_google_search_page() throws IOException {
//		BrowserSetup bs=new BrowserSetup();
//		driver=bs.setupBrowser("Chrome");
//
//		driver.get(rp.ReadProperty("./src/test/resources/config.properties", "url"));
//	}

	

	
}
