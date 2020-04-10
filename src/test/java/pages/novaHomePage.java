package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class novaHomePage {
	
	public novaHomePage() {

		PageFactory.initElements(Driver.getDriver(), this);

	}

	@FindBy(xpath = "//*[@id=\"js-main-nav-full\"]/ul/li[2]/a")
	public WebElement academicsAndProgramsDropDown;

	@FindBy(xpath = "//*[@id=\"academics-dd\"]/div/div/div/div[2]/ul/li[7]/a")
	public WebElement libraryButtonUnderDropDown;

	
	
	
	
	

}
