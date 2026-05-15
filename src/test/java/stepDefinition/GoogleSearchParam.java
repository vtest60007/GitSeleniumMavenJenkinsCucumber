package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import browserSetup.BrowserSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoogleSearch;
import utils.ReadPropeties;

public class GoogleSearchParam {
	
	WebDriver driver;
	ReadPropeties rp= new ReadPropeties();
	
	@Given("I am on the Google search page")
	public void i_am_on_the_google_search_page() throws IOException {
		BrowserSetup bs=new BrowserSetup();
		driver=bs.setupBrowser("Chrome");

		driver.get(rp.ReadProperty("./src/test/resources/config.properties", "url"));
	}

	@When("I search for {string}")
	public void i_search_for(String keyword) {
		
		GoogleSearch searchPage= new GoogleSearch(driver);			
		searchPage.EnterKeyword(keyword);
	}

	@Then("I should see search results for {string}")
	public void i_should_see_search_results_for(String Title) {
		System.out.println("Search Completed "+Title);
	}
	
	@When("I search for a Keyword")
	public void i_search_for_a_keyword() {
		
		GoogleSearch searchPage= new GoogleSearch(driver);			
		searchPage.EnterKeyword("Testing");
	}

	@Then("I should see search results for Keyword")
	public void i_should_see_search_results_for_keyword() {
		//Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println("Search Completed");
	}
}
