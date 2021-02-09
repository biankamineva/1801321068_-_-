package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.Login.LoginPageModel;
import uni.pl.fmi.Models.SearchPageModel;

public class SearchSteps {
	
	SearchPageModel searchPageModel = new SearchPageModel();
	
	@Given("^Потребителят отваря търсачката на приложението$")
	public void openSearch() throws Throwable {
		searchPageModel.navigatetoSearchScreen();
	}

	@When("^Въвежда заглавие на творбата \"([^\"]*)\"$")
	public void enterNovelName(String name) throws Throwable {
		searchPageModel.setName(name);
	}

	@When("^Натиска бутон за търсене в системата$")
	public void clickSearchButton() throws Throwable {
	    searchPageModel.clickSearchButton();
	}

	@Then("^Вижда съобщение за търсенето \"([^\"]*)\"$")
	public void searchMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, searchPageModel.getSearchMessage());
	}



}
