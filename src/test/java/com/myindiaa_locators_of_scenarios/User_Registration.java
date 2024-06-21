package com.myindiaa_locators_of_scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Registration {
	WebDriver driver;
	public User_Registration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "nav-link-accountList-nav-line-1")
	private WebElement navigateToSingin;
	@FindBy(id = "createAccountSubmit")
	private WebElement createAccount;
	@FindBy(id = "ap_customer_name")
	private WebElement name;
	@FindBy(id = "ap_phone_number")
	private WebElement phone_number;
	@FindBy(id = "ap_password")
	private WebElement setPassword;
	@FindBy(id = "continue")
	private WebElement VerifyMobile;
	@FindBy(xpath = "//button[text()='Start Puzzle']")
	private WebElement StartPuzzle;
	
	
	public void navigateTOsingnIn() {
		this.navigateToSingin.click();
	}
	public void CreateAccount() {
		this.createAccount.click();
	}
	public void YourName() {
		this.name.sendKeys("Vijay kumar");
	}
	public void PhoneNumber() {
		this.phone_number.sendKeys("8809766036");
	}
	public void SetPassword() {
		this.setPassword.sendKeys("Vijay@123");
	}
	public void MobileVerification() {
		this.VerifyMobile.click();
	}
	public void SolvePuzzle() {
		this.StartPuzzle.click();
	}
	
}
