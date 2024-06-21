package com.myindiaproject_Amazon_Scenarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myindiaa_locators_of_scenarios.Check_out_functionality;
import com.myindiaa_locators_of_scenarios.Login_Functionality;
import com.myindiaa_locators_of_scenarios.Search_Products;
import com.myindiaa_locators_of_scenarios.User_Registration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Senarios_and_Test_Cases {

	WebDriver driver;
	User_Registration user_Registration;
	Login_Functionality login_Functionality;
	Search_Products search_Products;
	Check_out_functionality check_out_functionality;
	@BeforeMethod
	public void setUp() throws IOException {
		//create an object of the properties class which is related to java.util class
		Properties pr = new Properties();
		
		FileInputStream file = new FileInputStream("C:\\Users\\kumar\\Documents\\workspace-spring-tool-suite-4-4.21.1.RELEASE\\MyIndiaa_Project\\src\\test\\resources\\data.properties");
		pr.load(file);
		//driver setup
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		driver.get(pr.getProperty("baseURL"));
		user_Registration = new User_Registration(driver);
		login_Functionality = new Login_Functionality(driver);
		search_Products = new Search_Products();
		check_out_functionality = new Check_out_functionality(driver);
	}
	@Test
	public void ApplicationOpening() {
		System.out.println("Application Opened");
		
	}
	@Test(priority = 0)
	public void userRegistration() throws InterruptedException {
		user_Registration.navigateTOsingnIn();
		Thread.sleep(2000);
		user_Registration.CreateAccount();
		Thread.sleep(2000);
		user_Registration.YourName();
		Thread.sleep(2000);
		user_Registration.PhoneNumber();
		Thread.sleep(2000);
		user_Registration.SetPassword();
		Thread.sleep(2000);
		user_Registration.MobileVerification();
		Thread.sleep(2000);
		user_Registration.SolvePuzzle();
		Thread.sleep(2000);
		
	}
	@Test(priority = 1)
	public void testLoginOperation() throws InterruptedException {
		login_Functionality.signInOptionBtn();
		Thread.sleep(2000);
		login_Functionality.sendUserName("7258026878");
		Thread.sleep(2000);
		login_Functionality.continueBtn();
		Thread.sleep(2000);
		login_Functionality.passwordfield("9102427798");
		Thread.sleep(2000);
		login_Functionality.signinBtn();
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void search() throws InterruptedException {
		search_Products.clickOntextField();
		search_Products.sendInSearch("Laptop");
		Thread.sleep(2000);
		search_Products.searchBtn();
		Thread.sleep(2000);
		search_Products.clickOntextField();
		search_Products.sendInSearch("Smart Watch");
		Thread.sleep(2000);
		search_Products.searchBtn();
		Thread.sleep(2000);
	}
	@Test 
	public void checkOutFunctionality() throws InterruptedException {
		check_out_functionality.addtoCartBtn();
		Thread.sleep(2000);
		check_out_functionality.seeCart();
		Thread.sleep(2000);
		check_out_functionality.checkout();
		Thread.sleep(2000);
	}
	@AfterMethod()
	public void tearDown() {
		driver.close();
	}
}
