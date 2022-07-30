package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base{
	
	HomePageObject homepageobject = new HomePageObject();
	
//	Scenario 1
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homepageobject.clickOnCurrency();
		logger.info("User clicked on currency link successfully.");
		Utils.hardWait(1000);
	}
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homepageobject.choseEuro();
		logger.info("User chose the Euro from dropdown successfully.");
		Utils.hardWait(1000);
	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homepageobject.isCurrencyValueDisplayed();
		logger.info("The currency value changed to Euro successfully.");
		Utils.takeScreenshotForStep();
		Utils.hardWait(1000);
	    
	}
	
//	Scenario 2
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homepageobject.clickOnShoppingCart();
		logger.info("User clicked on shopping cart link successfully.");
		Utils.hardWait(1000);
	}
	@Then("{string} message should display")
	public void message_should_display(String expectedMessageOnUI) {
		Assert.assertEquals(expectedMessageOnUI, homepageobject.emptyShoppingCartMessage());
		logger.info("The message, Your shopping cart is empty displayed successfully.");
		Utils.takeScreenshotForStep();
		Utils.hardWait(5000);
		
	    
	}


}
