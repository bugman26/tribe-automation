package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.utilities.StringManipulations;

public class InfluencerCampaignBrandPage {

	private WebDriver driver;

	private By brandLogoBox = By.xpath("//div[@data-testid='empty-moodboard-image']");
	private By brandLogoUploadBox = By.xpath("//div[@data-testid='empty-moodboard-image']//input");
	private By brandNameField = By.xpath("//input[@placeholder='Brand name']");
	private By checkButton = By.xpath("//a[@data-cy-element='save-brand-logo']/div");
	private String errorMessage = "//span[contains(text(), 'errorMessage')]";
	

	public InfluencerCampaignBrandPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickBrandLogoBox() {
		driver.findElement(brandLogoBox).click();
	}

	public void uploadBrandLogo(String imageName) {

		String imagePath = System.getProperty("user.dir") + "/src/test/resources/test/data/" + imageName;
		driver.findElement(brandLogoUploadBox).sendKeys(imagePath);
		

	}

	public void enterBrandName(String brandName) {

		if (brandName.equalsIgnoreCase("Generate Unique Brand Name")) {
			brandName = StringManipulations.generateRandomString(10, "aphaNumeric");
		}

		driver.findElement(brandNameField).sendKeys(brandName);

	}

	public void clickCheckButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(checkButton));
		Thread.sleep(3000);
		driver.findElement(checkButton).click();
	}
	
	public void verifyErrorMessageIsDisplayed(String errorMessageText) {
		driver.findElement(By.xpath(errorMessage.replace("errorMessage", errorMessageText))).isDisplayed();
	}

}
