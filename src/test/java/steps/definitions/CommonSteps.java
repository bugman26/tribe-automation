package steps.definitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import test.base.BaseDrivers;
import test.pages.CampaignsPage;
import test.pages.InfluencerCampaignBrandPage;
import test.pages.InfluencerCampaignCampaignPage;
import test.utilities.ConfigReader;

public class CommonSteps {

	WebDriver driver = BaseDrivers.getDriver();

	CampaignsPage campaignsPage = new CampaignsPage(driver);
	InfluencerCampaignCampaignPage influencerCampaignCampaignPage = new InfluencerCampaignCampaignPage(driver);
	InfluencerCampaignBrandPage influencerCampaignBrandPage = new InfluencerCampaignBrandPage(driver);

	@Given("User is on Tribe Sign In page")
	public void user_is_on_tribe_sign_in_page() {
		String url = ConfigReader.getProp().getProperty("test.url");
		System.out.println("Test URL: " + url);
		BaseDrivers.getDriver().get(url);
	}

	@Given("User clicks CREATE CAMPAIGN button")
	public void user_clicks_create_campaign_button() {
		campaignsPage.clickCreateCampaignButton();

	}

	@Given("User clicks CONTINUE button")
	public void user_clicks_continue_button() {
		influencerCampaignCampaignPage.clickContinueButton();
	}



	@Then("{string} is displayed")
	public void is_displayed(String errorMessage) {
		influencerCampaignBrandPage.verifyErrorMessageIsDisplayed(errorMessage);
	}

}
