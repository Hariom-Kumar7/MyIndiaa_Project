
package com.myindiaa_locators_of_scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_out_functionality {
WebDriver driver;
	
	public Check_out_functionality(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@id='a-autoid-3-announce']")
	 private WebElement addtoCart;
	//@FindBy(xpath = "//a[@id='nav-cart']")
	@FindBy(id ="nav-cart")
	WebElement seeAddtoCart;
	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	 WebElement buynow;
	
	public void addtoCartBtn() {
		this.addtoCart.click();
	}
	public void seeCart() {
		this.seeAddtoCart.click();
	}
	public void checkout() {
		this.buynow.click();
	}
	
	
}
