package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class RetailPageObject extends Base {
	
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h1//a[text()='TEST ENVIRONMENT']")
	private WebElement retailPage;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountLink;
	@FindBy(xpath = "//li//a[text()='Login']")
	private WebElement loginLink;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailField;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;
	@FindBy(xpath = "//div//input[@value='Login']")
	private WebElement loginButton;
	@FindBy (xpath = "//div[@id='content']//h2[text()='My Account']")
	private WebElement myAccuntDashboard;
	// Scenario 1 Register as an Affiliate user with Cheque Payment Method
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement regForAffiliateAccount;
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyField;
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement websiteField;
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxIdField;
	@FindBy(xpath = "//input[@value = 'cheque']")
	private WebElement chequeRadioButton;
	@FindBy(xpath = "//input[@id= 'input-cheque']")
	private WebElement chequePayeeName;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement aboutUsCheckBox;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement continueButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	// Scenario 2 Edit your affiliate information from Cheque payment method to Bank Transfer
	@FindBy(xpath = "//li//a[text()='Edit your affiliate information']")
	private WebElement editAffiliatedInformationLink;
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankRadioButton;
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankNameFiled;
	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement branchNumber;
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftDoceField;
	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement nameOfAccount;
	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accNumber;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueBttnOnAccountEdit;
	@FindBy(xpath = "(//div[@class='alert alert-success alert-dismissible'])[1]")
	private WebElement successMessageOnEditAccount;
////Scenario 3: Edit your account Information
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInfo;
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameFiled;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement accountEmailField;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement accounttelephoneField;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueBttnOnEditAccountInfo;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageOnEditAccountInfo;

	public String getToRetailPage() {
		String tetEnvironmentTextOnUI = retailPage.getText();
		return tetEnvironmentTextOnUI;
	}
	public void clickOnMyAccount() {
		myAccountLink.click();
	}
	public void clickOnLogin() {
		loginLink.click();
	}
	public void enterEmailAdd(String email) {
		emailField.sendKeys(email);
	}
	public void enterPassword (String password) {
		passwordField.sendKeys(password);
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
	public String getLoggedinDashboard() {
		Utils.highlightelementBackground(myAccuntDashboard);
		String myAccountTextOnLoggedinPage = myAccuntDashboard.getText();
		return myAccountTextOnLoggedinPage;
	}
	
// Scenario 1
	public void clickOnRegForAffiliateAccountText() {
		regForAffiliateAccount.click();
	}
	public void enterCompanyName(String company) {
		companyField.sendKeys(company);
	}
	public void enterWebsite(String website) {
		websiteField.sendKeys(website);
	}
	public void enterTaxId(String taxID) {
		taxIdField.sendKeys(taxID);
	}
	public void clickOnChequeRadioButton() {
		chequeRadioButton.click();
	}

	public void enterChequePayeeName(String payPalEmail) {
		chequePayeeName.sendKeys(payPalEmail);
	}
	public void clickOnAboutUsCheckBox() {
		aboutUsCheckBox.click();
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}
	public String getSuccessMessageOnAffiliatedAccount() {
		Utils.highlightelementBackground(successMessage);
		String successMessageOnAffiliatedAccount = successMessage.getText();
		return successMessageOnAffiliatedAccount;
	}
	
	// Scenario 2 Edit your affiliate information from Cheque payment method to Bank Transfer
	
	public void clickOnEditAffiliatedInformationLink() {
		editAffiliatedInformationLink.click();
	}
	
	public void clickOnBankRadioButton() {
		bankRadioButton.click();
	}
	public void enterBankName(String bankName) {
		bankNameFiled.sendKeys(bankName);
	}
	public void enterBranchNumber(String abaNumber) {
		branchNumber.sendKeys(abaNumber);
	}
	public void enterSwiftCode(String swiftCode) {
		swiftDoceField.sendKeys(swiftCode);
	}
	public void enterAccountName(String accountName) {
		nameOfAccount.sendKeys(accountName);
	}
	public void enterAccountNumber(String accountNumber) {
		accNumber.sendKeys(accountNumber);
	}
	public void clickOnContinueBttnOnAccountEdit() {
		continueBttnOnAccountEdit.click();
	}
	public String getsuccessMessageOnEditAccount() {
		Utils.highlightelementBackground(successMessageOnEditAccount);
		String successMessageDisplayOnEditAccount = successMessageOnEditAccount.getText();
		return successMessageDisplayOnEditAccount;
	}
	
	// Scenario 3 Edit your account Information 
	
	public void clickOnEditYourAccountInfo() {
		editYourAccountInfo.click();
	}
	public void clearFirstNameField() {
		firstNameFiled.clear();
	}
		
	public void editFirstName(String firstname) {
		firstNameFiled.sendKeys(firstname);
	}
	
	public void clearLastNameField() {
		lastNameField.clear();
	}
	public void editLastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}
	public void clearAccountEmailField() {
		accountEmailField.clear();
	}
	public void editAccountEmailField(String email) {
		accountEmailField.sendKeys(email);
	}
	
	public void clearTelephoneNumberField() {
		accounttelephoneField.clear();
	}
	public void editTelephoneNumber(String telephone) {
		accounttelephoneField.sendKeys(telephone);
	}
	public void clickOncontinueBttnOnEditAccountInfo() {
		continueBttnOnEditAccountInfo.click();
	}
	public String getSuccessMessageOnEditAccountInfo() {
		Utils.highlightelementBackground(successMessageOnEditAccountInfo);
		String successMessageOnEditAccountInformation = successMessageOnEditAccountInfo.getText();
		return successMessageOnEditAccountInformation;
	}
	
}
