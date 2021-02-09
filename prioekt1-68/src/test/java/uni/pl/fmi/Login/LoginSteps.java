package uni.pl.fmi.Login;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	LoginPageModel loginPageModel = new LoginPageModel();
	
	@Given("^Потребителят отваря приложението$")
	public void openLogin() throws Throwable {
	    loginPageModel.navigatetoLoginScreen();
	}

	@When("^Въвежда потребителско име \"([^\"]*)\"$")
	public void addUserName(String username) throws Throwable {
	    loginPageModel.setUsername(username);
	}

	@When("^Въвежда парола \"([^\"]*)\"$")
	public void addPassword(String password) throws Throwable {
		loginPageModel.setPassword(password);
	}

	@When("^Натиска бутон за вход в системата$")
	public void clickLoginButton() throws Throwable {
		loginPageModel.clickLoginButton();
	}

	@Then("^Вижда съобщението \"([^\"]*)\"$")
	public void checkMessage(String expectedMessage) throws Throwable {
	    assertEquals(expectedMessage, loginPageModel.getLoginMessage());
	}


}
