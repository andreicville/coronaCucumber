package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class searchBookResultsPage {

	public searchBookResultsPage() {

		PageFactory.initElements(Driver.getDriver(), this);

	}

	@FindBy(xpath = "/html/body/primo-explore/div/prm-explore-main/ui-view/prm-search/div/md-content/div[1]/prm-search-result-list/div/prm-search-result-tool-bar/div/md-toolbar/div[2]/span[2]")
	public WebElement resultsNumberText;
	
	
	
	

	public String stringText() {

		String wholeHiText = resultsNumberText.getText();

		String[] splittedText = wholeHiText.split(" ");

		return splittedText[0];
	}
	
	
	
	
	
	

}
