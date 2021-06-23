package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class InfluencerCampaignSubmitPage {

	private WebDriver driver;

	private By startDate = By.xpath("//span[text()='Start date']");
	private By datePickerTodayDate = By.xpath("//div[contains(@class, 'react-datepicker__day--today')]");

	private By campaignDuration = By.xpath("//span[text()='Campaign duration']");
	private By campaignDurationSlider = By.xpath("//div[@role='slider']");
	private By h1Text = By.xpath("//span[text()=\"That’s one good looking campaign\"]");
	private By scheduleCampaignButton = By.xpath("//button[@data-cy-element='schedule-campaign-button']/div");
	private By companyAddressField = By.name("street_address");
	private By suburbOrCityField = By.name("city");
	private By stateField = By.xpath("//div[text()='State']/parent::div//input");
	private By zipCodeField = By.name("postcode");
	private By submitButton = By.xpath("//span[text()='Submit']");

	public InfluencerCampaignSubmitPage(WebDriver driver) {
		this.driver = driver;
	}

	public void selectStartDateToday() {
		driver.findElement(startDate).click();
		driver.findElement(datePickerTodayDate).click();

	}

	public void selectDefaultCampaignDuration() {
		driver.findElement(campaignDuration).click();
		driver.findElement(campaignDurationSlider).click();
		driver.findElement(h1Text).click();
	}

	public void clickScheduleCampaignButton() {
		driver.findElement(scheduleCampaignButton).click();
	}

	public void enterCompanyAddress(String address) {
		driver.findElement(companyAddressField).clear();
		driver.findElement(companyAddressField).sendKeys(address);
	}

	public void enterSuburbOrCity(String city) {
		driver.findElement(suburbOrCityField).clear();
		driver.findElement(suburbOrCityField).sendKeys(city);
	}

	public void enterState(String state) {
		driver.findElement(stateField).sendKeys(state);
		driver.findElement(stateField).sendKeys(Keys.RETURN);
	}
	
	public void enterZipCode(String zipCode) {
		driver.findElement(zipCodeField).clear();
		driver.findElement(zipCodeField).sendKeys(zipCode);
	}
	
	public void clickSubmitButton() {
		driver.findElement(submitButton).click();
	}
}
