package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.Models.SearchByAutorAndTitlePageModel;

public class SearchByAutorAndTitleSteps {
	
	SearchByAutorAndTitlePageModel searchByAutorAndTitlePageModel = new SearchByAutorAndTitlePageModel();

	@Given("^Потребителят отваря разширено търсене на приложението$")
	public void openSearchByAutorAndTitle() throws Throwable {
		searchByAutorAndTitlePageModel.navigatetoSearchByAutorAndTitleScreen();
	}
	@When("^Въвежда заглавие \"([^\"]*)\"$")
	public void enterNovelName(String name) throws Throwable {
		searchByAutorAndTitlePageModel.setName(name);
	}
	@When("^Въвежда автор \"([^\"]*)\"$")
	public void enterAutor(String autor) throws Throwable {
		searchByAutorAndTitlePageModel.setUser(autor);
	}

	@When("^Натиска бутон за разширено търсене в системата$")
	public void clickSearchByAutorAndTitleButton() throws Throwable {
		searchByAutorAndTitlePageModel.clickSearchByAutorAndTitleButton();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void searchMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, searchByAutorAndTitlePageModel.getSearchByAutorAndTitleMessage());
	}


}

