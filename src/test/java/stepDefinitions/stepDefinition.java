package stepDefinitions;

import Utilities.BrowserUtilities;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.libraryPage;
import pages.novaHomePage;
import pages.searchBookResultsPage;

public class stepDefinition {
	
	novaHomePage myNovaHomePage = new novaHomePage();
	libraryPage myLibraryPage = new libraryPage();
	searchBookResultsPage myResultsPage = new searchBookResultsPage();
	

	@Given("^user is on NOVA URL HomePage$")
	public void user_is_on_NOVA_URL_HomePage() {
		
		Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
		Driver.getDriver().manage().window().maximize();
		BrowserUtilities.waitForPageToLoad(10);
		

	}

	@When("^user clicks on Academics & Programs and selects Libraries$")
	public void user_clicks_on_Academics_Programs_and_selects_Libraries() {
		
		BrowserUtilities.hover(myNovaHomePage.academicsAndProgramsDropDown);
		myNovaHomePage.libraryButtonUnderDropDown.click();

	}

	@Then("^user should navigate to library search Page and user should search for book titled JAVA$")
	public void user_should_navigate_to_library_search_Page_and_user_should_search_for_book_titled_JAVA() {
		
		myLibraryPage.searchInputBox.sendKeys(ConfigurationReader.getProperty("searchTitle"));
		myLibraryPage.searchButton.click();

	}

	@Then("^user should navigate to a Results Page and user should verify if any results were returned$")
	public void user_should_navigate_to_a_Results_Page_and_user_should_verify_if_any_results_were_returned() {
		
		BrowserUtilities.waitForPageToLoad(10);
		
		BrowserUtilities.switchToWindow(1);
		
		BrowserUtilities.waitForPageToLoad(10);
		
		System.out.println(Driver.getDriver().getTitle());
		
		BrowserUtilities.fluentWait(myResultsPage.resultsNumberText, 10);
		
		System.out.println(myResultsPage.resultsNumberText.getText());
		
		System.out.println(myResultsPage.stringText());

	}
	
	
	

}
