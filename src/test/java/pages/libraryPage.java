package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class libraryPage {

	public libraryPage() {

		PageFactory.initElements(Driver.getDriver(), this);

	}

	@FindBy(id = "primoQueryTemp")
	public WebElement searchInputBox;

	@FindBy(id = "go")
	public WebElement searchButton;

}
