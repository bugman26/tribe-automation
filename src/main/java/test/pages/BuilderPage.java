package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuilderPage {
	

	private WebDriver driver;

	private By createInfluencerCampaignButton = By.xpath("//span[text()='Create an influencer campaign']");
	

	public BuilderPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickCreateInfluencerCampaignButton() {
		driver.findElement(createInfluencerCampaignButton).click();
	}

}
