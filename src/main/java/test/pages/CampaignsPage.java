package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CampaignsPage {
	
	private WebDriver driver;

	private By createCampaignButton = By.xpath("//button[@data-cy-element='create-campaign-button']");
	

	public CampaignsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickCreateCampaignButton() {
		driver.findElement(createCampaignButton).click();
	}

}
