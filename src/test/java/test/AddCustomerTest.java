package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import page.SummaryPage;
import page.VerifyProfile;
import util.BrowserFactory;


public class AddCustomerTest {

	WebDriver driver;
	
	@Test
	@Parameters({"username", "password", "fullname", "company", "email", "phone", "address", "city", "state", "zip", "country"})
	public void validUserShouldBeAbleToAddCustomer(String userName, String password, String fullName, String companyName, String iemail, String iphone, String iaddress, String icity, String istate, String izip, String icountry) throws InterruptedException {
		driver = BrowserFactory.init();

	LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSignInButton();
		
	DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage();
		Thread.sleep(1000);
		dashboardPage.clickCustomerButton();
		dashboardPage.clickAddCustomerButton();
	
	AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		Thread.sleep(1000);
		addCustomerPage.insertFullName(fullName);
		addCustomerPage.insertCompanyOption(companyName);
		addCustomerPage.insertEmail(iemail);
		addCustomerPage.insertPhone(iphone);
		addCustomerPage.insertAddress(iaddress);
		
		addCustomerPage.insertCity(icity);
		addCustomerPage.insertState(istate);
		addCustomerPage.insertip(izip);
		
		addCustomerPage.insertCountry(icountry);
		addCustomerPage.clickSave();
		
	SummaryPage	summaryPage = PageFactory.initElements(driver, SummaryPage.class);
		summaryPage.validateSummaryPage();
		
	VerifyProfile verifyProfile = PageFactory.initElements(driver, VerifyProfile.class);
		verifyProfile.verfiyEnteredName();
	
	}
	@Test
	@Parameters({"username", "password", "fullname", "company", "email", "phone", "address", "city", "state", "zip", "country"})
	public void userShouldBeAbleToUseSearchbarOnListCustomer(String userName, String password, String fullName, String companyName, String iemail, String iphone, String iaddress, String icity, String istate, String izip, String icountry) throws InterruptedException {
		driver = BrowserFactory.init();

		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
			loginPage.insertUserName(userName);
			loginPage.insertPassword(password);
			loginPage.clickSignInButton();
			
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
			dashboardPage.validateDashboardPage();
			Thread.sleep(1000);
			dashboardPage.clickCustomerButton();
			//dashboardPage.clickAddCustomerButton();
			dashboardPage.clickCustomerButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
			Thread.sleep(1000);
			addCustomerPage.insertFullName(fullName);
			addCustomerPage.insertCompanyOption(companyName);
			addCustomerPage.insertEmail(iemail);
			addCustomerPage.insertPhone(iphone);
			addCustomerPage.insertAddress(iaddress);
			
			addCustomerPage.insertCity(icity);
			addCustomerPage.insertState(istate);
			addCustomerPage.insertip(izip);
			
			addCustomerPage.insertCountry(icountry);
			addCustomerPage.clickSave();
			
		SummaryPage	summaryPage = PageFactory.initElements(driver, SummaryPage.class);
			summaryPage.validateSummaryPage();
			
		VerifyProfile verifyProfile = PageFactory.initElements(driver, VerifyProfile.class);
			verifyProfile.verfiyEnteredName();
	}
	
	
}
