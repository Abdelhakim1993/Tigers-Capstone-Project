package step.definition;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base {
	RetailPageObject retailpageobject = new RetailPageObject();
	//Background 
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = retailpageobject.getToRetailPage();
		Assert.assertEquals(expectedText, actualText);
		logger.info("User is on the reatil page successfully.");
	}
	@And("User click on My Account")
	public void user_click_on_my_account() {
		retailpageobject.clickOnMyAccount();
		logger.info("User clicked on my account link successfully.");
	}
	@When("User click on Login")
	public void user_click_on_login() {
		retailpageobject.clickOnLogin();
		logger.info("User clicked on login link successfully.");
	}
	@And("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String email, String password) {
		retailpageobject.enterEmailAdd("hakimo.gharbi@tekschool.com");
		retailpageobject.enterPassword("hakimo1993");
		logger.info("User entered email address and password successfully");
	}
	@And("User click on Login button")
	public void user_click_on_login_button() {
		retailpageobject.clickOnLoginButton();
		logger.info("User clicked on login button successfully.");
	}
	@Then("User should be logged in to My Account dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		String expectedText = "My Account";
		String ActulText = retailpageobject.getLoggedinDashboard();
		Assert.assertEquals(expectedText, ActulText);
		logger.info("User landed on login dashboard successfully.");
		Utils.takeScreenshotForStep();
	}

	
// Scenario 1:	Register as an Affiliate user with Cheque Payment Method

	@When("User click on Register for an Affiliate Account link")
	public void User_click_on_Register_for_an_Affiliate_Account_link() {
		retailpageobject.clickOnRegForAffiliateAccountText();
		logger.info("Register account link was clicked successfully");
	}
	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailpageobject.enterCompanyName(data.get(0).get("company"));
		retailpageobject.enterWebsite(data.get(0).get("website"));
		retailpageobject.enterTaxId(data.get(0).get("taxID"));
		retailpageobject.clickOnChequeRadioButton();
		retailpageobject.enterChequePayeeName(data.get(0).get("chequepayeename"));
		logger.info("User filled the affiliated account form successfully");
	}
	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailpageobject.clickOnAboutUsCheckBox();
		logger.info("User checked the About Us successfully");
	}
	@And("User click on Continue button")
	public void user_click_on_continue_button() {
		retailpageobject.clickOnContinueButton();
		logger.info("User clicked on the continue button succcessfully");
	}
	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		String expectedMessage = "Success: Your account has been successfully updated.";
		String actualMessage = retailpageobject.getSuccessMessageOnAffiliatedAccount();
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("User see a success message successfully");
		Utils.takeScreenshotForStep();
	}
	
	//Scenario 2: Edit your affiliate information from Cheque payment method to Bank Transfer
	@When("User click on Edit your affiliate information link")
	public void User_click_on_Edit_your_affiliate_information_link() {	
		retailpageobject.clickOnEditAffiliatedInformationLink();
		logger.info("User clicked on Edit Affiliated Information Link successfully");
	}
	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailpageobject.clickOnBankRadioButton();
		logger.info("User selected Bank Radio Button successfully");
	}
	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailpageobject.enterBankName(data.get(0).get("bankName"));
		retailpageobject.enterBranchNumber(data.get(0).get("abaNumber"));
		retailpageobject.enterSwiftCode(data.get(0).get("swiftCode"));
		retailpageobject.enterAccountName(data.get(0).get("accountName"));
		retailpageobject.enterAccountNumber(data.get(0).get("accountNumber"));
		logger.info("User filled Bank information successfully");
		Utils.takeScreenshotForStep();
	}
////Scenario 3: Edit your account Information 
	@When("User click on Edit your account information link") 
	public void User_click_on_Edit_your_account_information_link() {	
		retailpageobject.clickOnEditYourAccountInfo();
		logger.info("User clicked on edit your account link successfully");
	} 
	@And("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		retailpageobject.clearFirstNameField();
		retailpageobject.clearLastNameField();
		retailpageobject.clearAccountEmailField();
		retailpageobject.clearTelephoneNumberField();
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailpageobject.editFirstName(data.get(0).get("firstname"));
		retailpageobject.editLastName(data.get(0).get("lastName"));
		retailpageobject.editAccountEmailField(data.get(0).get("email"));
		retailpageobject.editTelephoneNumber(data.get(0).get("telephone"));
		logger.info("User modified the information successfully");
	}
	@And("User click on continue button")
	public void User_click_on_continue_button() {
		retailpageobject.clickOncontinueBttnOnEditAccountInfo();
		logger.info("User clicked on the continue button successfully");
	}
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		String expectedMessage = "Success: Your account has been successfully updated."; 
		String actualMessage = retailpageobject.getSuccessMessageOnEditAccountInfo();
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("User see a message: Success: Your account has been successfully updated.");
		Utils.takeScreenshotForStep();
	}
}
