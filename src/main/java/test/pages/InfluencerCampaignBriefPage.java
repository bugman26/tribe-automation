package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InfluencerCampaignBriefPage {
	
	private WebDriver driver;

	private By visualDirectionUploadBoards = By.xpath("//div[@data-testid='empty-moodboard-image']//input");
	private By contentWeLoveToHearFromYouField = By.name("objective");
	private By dosField = By.xpath("//textarea[@placeholder='Add a note like “post at a time your engagement is highest”']");
	private By dontsField = By.xpath("//textarea[@placeholder='Add a note like “don’t submit photos you haven’t captured yourself”']");
	private By addTwitterButton = By.xpath("//span[@data-cy-element='twitter-plus-button']");
	private By twitterHashTagField = By.name("tags");
	private By twitterHashTagEnterButton = By.xpath("//button[@data-form='twitterHandle']");
	private By twitterUrlField = By.name("urls");
	private By twitterUrlHashTagEnterButton = By.xpath("//button[@data-form='twitterURL']");
	
	
	
	public InfluencerCampaignBriefPage(WebDriver driver) {
		this.driver = driver;
	}

	public void uploadVisualDirection(int boardNumber, String imageName) {
		
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/test/data/" + imageName;
		driver.findElements(visualDirectionUploadBoards).get(boardNumber-1).sendKeys(imagePath);
		
	}
	
	public void enterContentWeLoveFromHearFromYou(String text) {
		driver.findElement(contentWeLoveToHearFromYouField).clear();
		driver.findElement(contentWeLoveToHearFromYouField).sendKeys(text);
	}
	
	
	public void enterDos(String text) {
		driver.findElement(dosField).clear();
		driver.findElement(dosField).sendKeys(text);
	}
	
	public void enterDonts(String text) {
		driver.findElement(dontsField).clear();
		driver.findElement(dontsField).sendKeys(text);
	}
	
	public void clickAddTwitterButton() {
		driver.findElement(addTwitterButton).click();
	}
	
	public void enterTwitterHashTag(String text) {
		driver.findElement(twitterHashTagField).clear();
		driver.findElement(twitterHashTagField).sendKeys(text);
		driver.findElement(twitterHashTagEnterButton).click();
	}
	
	public void enterTwitterUrlTag(String text) {
		driver.findElement(twitterUrlField).clear();
		driver.findElement(twitterUrlField).sendKeys(text);
		driver.findElement(twitterUrlHashTagEnterButton).click();
	}
	
	public void verifyBriefPageIsDisplayed() {
		driver.findElement(visualDirectionUploadBoards).isDisplayed();
	}

}
