package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InfluencerCampaignBudgetPage {

	private WebDriver driver;

	private By estimatedCampaignBudgetField = By.xpath("//input[@data-testid='estimated-budget-input']");
	private String preferredGenderForYourCreatiorsSelectors = "//input[@name='demographic_gender']/following-sibling::span//span[text()='choice']";
	private String whereWouldYouLikeYourCreatorsToBeLocatedSelectors = "//input[@name='demographic_target_region_ids']/following-sibling::span//span[text()='choice']";
	private String preferredAgeOfTargetAudienceSelectors = "//input[@name='audience_age_range']/following-sibling::span//span[text()='choice']";
	private String whatGenderAreHopingToReachSelectors = "//input[@name='audience_gender']/following-sibling::span//span[text()='choice']";
	private String whereDoesThisAudienceLiveSelectors = "//input[@name='audience_location_codes']/following-sibling::span//span[text()='choice']";
	private String errorMessageForFieldNames = "//span[text()='questions']/parent::h4/parent::div/parent::div//span[text()='errorMessageText']";
	public InfluencerCampaignBudgetPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterEstimatedCampaignBudget(String amount) {
		driver.findElement(estimatedCampaignBudgetField).clear();
		driver.findElement(estimatedCampaignBudgetField).sendKeys(amount);

	}

	public void selectPreferredGenderForYourCreators(String choice) {
		driver.findElement(By.xpath(preferredGenderForYourCreatiorsSelectors.replace("choice", choice))).click();
	}

	public void selectWhereWouldYouLikeYourCreatorsToBeLocated(String choice) {
		driver.findElement(By.xpath(whereWouldYouLikeYourCreatorsToBeLocatedSelectors.replace("choice", choice)))
				.click();
	}

	public void selectPreferredAgeOfTargetAudience(String choice) {
		driver.findElement(By.xpath(preferredAgeOfTargetAudienceSelectors.replace("choice", choice))).click();
	}
	
	public void selectWhatGenderAreYouHopingToReach(String choice) {
		driver.findElement(By.xpath(whatGenderAreHopingToReachSelectors.replace("choice", choice))).click();
	}
	
	public void selectWhereDoesThisAudienceLive(String choice) {
		driver.findElement(By.xpath(whereDoesThisAudienceLiveSelectors.replace("choice", choice))).click();
	}
	
	
	public void verifyEstimatedCampaignBudgetFieldIsDisplayed() {
		driver.findElement(estimatedCampaignBudgetField).isDisplayed();
	}
	
	public void verifyErrorMessageIsDisplayedForPrefferedGenderForCreators(String errorMessage) {
		driver.findElement(By.xpath(errorMessageForFieldNames.replace("questions", "Preferred gender for your Creators?").replace("errorMessageText", errorMessage))).isDisplayed();
	}
	
	public void verifyErrorMessageIsDisplayedForCreatorsTobeLocated(String errorMessage) {
		driver.findElement(By.xpath(errorMessageForFieldNames.replace("questions", "Where would you like your Creators to be located?").replace("errorMessageText", errorMessage))).isDisplayed();
	}
	
	public void verifyErrorMessageIsDisplayedForTargetAudience(String errorMessage) {
		driver.findElement(By.xpath(errorMessageForFieldNames.replace("questions", "Preferred age of your target audience?").replace("errorMessageText", errorMessage))).isDisplayed();
	}
	
	public void verifyErrorMessageIsDisplayedForHopingToReach(String errorMessage) {
		driver.findElement(By.xpath(errorMessageForFieldNames.replace("questions", "What gender are you hoping to reach?").replace("errorMessageText", errorMessage))).isDisplayed();
	}
	
	public void verifyErrorMessageIsDisplayedForAudienceLive(String errorMessage) {
		driver.findElement(By.xpath(errorMessageForFieldNames.replace("questions", "Where does this audience live?").replace("errorMessageText", errorMessage))).isDisplayed();
	}
	
	

}
