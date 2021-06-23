package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class InfluencerCampaignCampaignPage {

	private WebDriver driver;

	String campaignObjectivesSelection = "//div[@data-testid='builder-campaign-objectives-selection']//span[text()=\"campaignObjectiveText\"]";
	private By campaignTitleField = By.name("product_name");
	private By coverImageUploadBox = By.xpath("//div[@data-element='image-cropper']/input");
	private By callToActionField = By.name("call_to_action");
	private By aboutYouField = By.name("product_text");
	private By category1Field = By.id("product_category_primary_id");
	private By continueButton = By.xpath("//button[@data-cy-element='continue-button']");
	private By cropButton = By.xpath("//button/div[text()='Crop']");

	public InfluencerCampaignCampaignPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickBrandLogoBox(String campaignObjectiveText) {
		driver.findElement(
				By.xpath(campaignObjectivesSelection.replace("campaignObjectiveText", campaignObjectiveText))).click();
	}

	public void enterCampaignTitle(String text) {
		driver.findElement(campaignTitleField).clear();
		driver.findElement(campaignTitleField).sendKeys(text);
	}

	public void uploadCoverImage(String imageName) throws InterruptedException {

		String imagePath = System.getProperty("user.dir") + "/src/test/resources/test/data/" + imageName;
		driver.findElement(coverImageUploadBox).sendKeys(imagePath);
		driver.findElement(cropButton).click();

	}

	public void enterCallToAction(String text) {
		driver.findElement(callToActionField).clear();
		driver.findElement(callToActionField).sendKeys(text);
	}

	public void enterAboutYou(String text) {
		driver.findElement(aboutYouField).clear();
		driver.findElement(aboutYouField).sendKeys(text);
	}

	public void enterCategory1(String text) {
		driver.findElement(category1Field).sendKeys(text);
		driver.findElement(category1Field).sendKeys(Keys.ENTER);
	}

	public void clickContinueButton() {
		driver.findElement(continueButton).click();
	}
}
