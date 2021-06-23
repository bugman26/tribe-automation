package steps.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import test.pages.SignInPage;
import test.base.BaseDrivers;
import test.utilities.ConfigReader;

public class SignInSteps {
	
	
	SignInPage signInPage = new SignInPage(BaseDrivers.getDriver());
	
	@Given("User enters valid email")
	public void user_enters_valid_email() {
		signInPage.enterEmail(ConfigReader.getProp().getProperty("test.email"));
	}

	@When("User enters valid password")
	public void user_enters_valid_password() {
		signInPage.enterPassword(ConfigReader.getProp().getProperty("test.password"));
	}

	@When("User clicks Log In button")
	public void user_clicks_log_in_button() {
		signInPage.clickLogInButton();
	}

}
