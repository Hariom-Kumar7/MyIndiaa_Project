package com.myindiaa_locators_of_scenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Products {
	@FindBy(xpath ="//input[@type='text']")
	private WebElement clickOnsearch;
	@FindBy(xpath ="//input[@type='text']")
	private WebElement search;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement clickOnsearchBtn;
	
	
   public void clickOntextField() {
	   this.clickOnsearch.click();
   }
	public void sendInSearch(String search ) {
		this.search.sendKeys(search);
	}
	public void searchBtn() {
		this.clickOnsearchBtn.click();
	}
}
