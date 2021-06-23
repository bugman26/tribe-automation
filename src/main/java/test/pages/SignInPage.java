package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

	private WebDriver driver;

	private By emailField = By.name("email");
	private By passwordField = By.name("password");
	private By logInButton = By.xpath("//span[contains(text(), 'Log In')]");

	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterEmail(String email) {
		driver.findElement(emailField).sendKeys(email);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void clickLogInButton() {
		driver.findElement(logInButton).click();
	}
}
