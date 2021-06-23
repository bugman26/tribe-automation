package steps.definitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.base.BaseDrivers;
import test.pages.BuilderPage;
import test.pages.InfluencerCampaignBrandPage;
import test.pages.InfluencerCampaignBriefPage;
import test.pages.InfluencerCampaignBudgetPage;
import test.pages.InfluencerCampaignCampaignPage;
import test.pages.InfluencerCampaignSubmitPage;

public class CreateInfuencerCampaignSteps {

	WebDriver driver = BaseDrivers.getDriver();

	BuilderPage builderPage = new BuilderPage(driver);
	InfluencerCampaignBrandPage influencerCampaignBrandPage = new InfluencerCampaignBrandPage(driver);
	InfluencerCampaignCampaignPage influencerCampaignCampaignPage = new InfluencerCampaignCampaignPage(driver);
	InfluencerCampaignBriefPage influencerCampaignBriefPage = new InfluencerCampaignBriefPage(driver);
	InfluencerCampaignBudgetPage influencerCampaignBudgetPage = new InfluencerCampaignBudgetPage(driver);
	InfluencerCampaignSubmitPage influencerCampaignSubmitPage = new InfluencerCampaignSubmitPage(driver);

	@Given("User clicks CREATE AN INFLUENCER CAMPAIGN button")
	public void user_clicks_create_an_influencer_campaign_button() {
		builderPage.clickCreateInfluencerCampaignButton();
	}

	@Given("User clicks BRAND LOGO box")
	public void user_clicks_brand_logo_box() {
		influencerCampaignBrandPage.clickBrandLogoBox();
	}

	@Given("User uploads BRAND LOGO {string}")
	public void user_uploads_brand_logo(String imageName) throws InterruptedException {
		influencerCampaignBrandPage.uploadBrandLogo(imageName);
		Thread.sleep(15000);
	}

	@Given("User enters Brand name: {string}")
	public void user_enters_brand_name(String brandName) {
		influencerCampaignBrandPage.enterBrandName(brandName);
	}

	@Given("User clicks the check icon")
	public void user_clicks_the_check_icon() throws InterruptedException {
		influencerCampaignBrandPage.clickCheckButton();
	}

	@Given("User selects Campaign objectives: {string}")
	public void user_select_campaign_objectives(String compaignObjectiveText) {
		influencerCampaignCampaignPage.clickBrandLogoBox(compaignObjectiveText);
	}

	@Given("User enters text in Campaign title field: {string}")
	public void user_enters_text_in_campaign_title_field(String text) {
		influencerCampaignCampaignPage.enterCampaignTitle(text);
	}

	@Given("User uploads Cover image {string}")
	public void user_uploads_cover_image(String imageName) throws InterruptedException {
		influencerCampaignCampaignPage.uploadCoverImage(imageName);
		Thread.sleep(10000);
	}

	@Given("User enters text in Call to action field: {string}")
	public void user_enters_text_in_call_to_action_field(String text) {
		influencerCampaignCampaignPage.enterCallToAction(text);
	}

	@Given("User enters text in About you field: {string}")
	public void user_enters_text_in_about_you_field(String text) {
		influencerCampaignCampaignPage.enterAboutYou(text);
	}

	@Given("User selects category from Category1: {string}")
	public void user_selects_category_from_category1(String text) {
		influencerCampaignCampaignPage.enterCategory1(text);
	}

	@Given("User upload Visual Direction for board number {int} and image name {string}")
	public void user_upload_visual_direction_for_board_number_and_image_name(Integer boardNumber, String imageName) {
		influencerCampaignBriefPage.uploadVisualDirection(boardNumber, imageName);
	}

	@Given("User enters Content we love from you: {string}")
	public void user_enters_content_we_love_from_you(String text) {
		influencerCampaignBriefPage.enterContentWeLoveFromHearFromYou(text);
	}

	@Given("User enters DO's: {string}")
	public void user_enters_do_s(String text) {
		influencerCampaignBriefPage.enterDos(text);
	}

	@Given("User enters Don'ts: {string}")
	public void user_enters_don_ts(String text) {
		influencerCampaignBriefPage.enterDonts(text);
	}

	@Given("User clicks plus sign for Twitter")
	public void user_clicks_plus_sign_for_twitter() {
		influencerCampaignBriefPage.clickAddTwitterButton();
	}

	@Given("User enters hashtags in Twitter hashtag field: {string}")
	public void user_enters_hashtags_in_twitter_hashtag_field(String text) {
		influencerCampaignBriefPage.enterTwitterHashTag(text);
	}

	@Given("User enters Twitter url: {string}")
	public void user_enters_twitter_url(String text) throws InterruptedException {
		influencerCampaignBriefPage.enterTwitterUrlTag(text);
		Thread.sleep(3000);
	}

	@Given("User enters Estimated campaign budget: {string}")
	public void user_enters_estimated_campaign_budget(String amount) {
		influencerCampaignBudgetPage.enterEstimatedCampaignBudget(amount);
	}

	@Given("User selects Preferred gender for Creators: {string}")
	public void user_selects_preferred_gender_for_creators(String choice) {
		influencerCampaignBudgetPage.selectPreferredGenderForYourCreators(choice);
	}

	@Given("User selects Where would you like your Creaters to be located?: {string}")
	public void user_selects_where_would_you_like_your_creaters_to_be_located(String choice) {
		influencerCampaignBudgetPage.selectWhereWouldYouLikeYourCreatorsToBeLocated(choice);
	}

	@Given("User selects Preferred age of your target audience?: {string}")
	public void user_selects_preferred_age_of_your_target_audience(String choice) {
		influencerCampaignBudgetPage.selectPreferredAgeOfTargetAudience(choice);
	}

	@Given("User selects What gender are you hoping to reach?: {string}")
	public void user_selects_what_gender_are_you_hoping_to_reach(String choice) {
		influencerCampaignBudgetPage.selectWhatGenderAreYouHopingToReach(choice);
	}

	@Given("User selects Where does this audience live?: {string}")
	public void user_selects_where_does_this_audience_live(String choice) {
		influencerCampaignBudgetPage.selectWhereDoesThisAudienceLive(choice);
	}

	@Given("User selects Start date today")
	public void user_selects_start_date_today() {
		influencerCampaignSubmitPage.selectStartDateToday();
	}

	@Given("User selects default Campaign duration")
	public void user_selects_default_campaign_duration() {
		influencerCampaignSubmitPage.selectDefaultCampaignDuration();
	}

	@Given("User clicks SCHEDULE CAMPAIGN button")
	public void user_clicks_schedule_campaign_button() {
		influencerCampaignSubmitPage.clickScheduleCampaignButton();
	}

	@When("User enters Company address: {string}")
	public void user_enters_company_address(String address) {
		influencerCampaignSubmitPage.enterCompanyAddress(address);
	}

	@When("User enters Suburb\\/City: {string}")
	public void user_enters_suburb_city(String city) {
		influencerCampaignSubmitPage.enterSuburbOrCity(city);
	}

	@When("User enters State: {string}")
	public void user_enters_state(String state) {
		influencerCampaignSubmitPage.enterState(state);
	}

	@When("User enters Zip\\/Postal code: {string}")
	public void user_enters_zip_postal_code(String zipCode) {
		influencerCampaignSubmitPage.enterZipCode(zipCode);
	}

	@When("User clicks SUBMIT button")
	public void user_clicks_submit_button() {
		influencerCampaignSubmitPage.clickSubmitButton();
	}

	@Then("User is successfully created Influencer Campaign")
	public void user_is_successfully_created_influencer_campaign() {
		// Place Holder messsage only since nothing happen when clicking the Submit
		// button
		System.out.println("Successfully Created Influencer Campaign");
	}

	@When("User waits for Brief page to be displayed")
	public void user_waits_for_brief_page_to_be_displayed() {
		influencerCampaignBriefPage.verifyBriefPageIsDisplayed();
	}

	@When("User waits for Budget page to be displayed")
	public void user_waits_for_budget_page_to_be_displayed() {
		influencerCampaignBudgetPage.verifyEstimatedCampaignBudgetFieldIsDisplayed();
	}



	@Then("{string} is displayed for Preffered gender for creators")
	public void is_displayed_for_preffered_gender_for_creators(String errorMessage) {
		influencerCampaignBudgetPage.verifyErrorMessageIsDisplayedForPrefferedGenderForCreators(errorMessage);
	}



	@Then("{string} is displayed for Creators to be located")
	public void is_displayed_for_creators_to_be_located(String errorMessage) {
		influencerCampaignBudgetPage.verifyErrorMessageIsDisplayedForCreatorsTobeLocated(errorMessage);
	}

	@Then("{string} is displayed for target audience")
	public void is_displayed_for_target_audience(String errorMessage) {
		influencerCampaignBudgetPage.verifyErrorMessageIsDisplayedForTargetAudience(errorMessage);
	}

	@Then("{string} is displayed for Hoping to reach")
	public void is_displayed_for_hoping_to_reach(String errorMessage) {
		influencerCampaignBudgetPage.verifyErrorMessageIsDisplayedForHopingToReach(errorMessage);
	}

	@Then("{string} is displayed for Audience live")
	public void is_displayed_for_audience_live(String errorMessage) {
		influencerCampaignBudgetPage.verifyErrorMessageIsDisplayedForAudienceLive(errorMessage);
	}

}
