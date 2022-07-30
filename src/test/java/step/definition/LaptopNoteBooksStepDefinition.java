package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base{
	
	LaptopNoteBooksPageObject laptopnotebookspageobject = new LaptopNoteBooksPageObject();
	
//	Background
	
	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopnotebookspageobject.moveOverLaptopsAndNotebooksTab();
		logger.info("Mouse moved to Laptop & NoteBook tab successfully.");
		Utils.hardWait(1000);
	    
	}
	@When("User click Show all Laptop & NoteBook option")
	public void user_click_show_all_laptop_note_book_option() {
		laptopnotebookspageobject.clickOnShowAllLaptopsAndNotebooksLink();
		logger.info("User clicked on show all Laptop & NoteBook option successfullly.");
		Utils.hardWait(1000);
	}
//	Scenario 1   
	
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopnotebookspageobject.clickOnmacBookItem();
		logger.info("User clicked on MacBook item successfully.");
		Utils.hardWait(1000);
	}
	@Then("User should see {int} item\\(s){double} showed to the cart")
	public void user_should_see_item_s_showed_to_the_cart(Integer int1, Double double1) {
		laptopnotebookspageobject.isOneItemShowedToCart();
		logger.info("User see 1 item(s)-602.00 showed to the cart.");
		Utils.hardWait(1000);
	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopnotebookspageobject.clickOnOneItemToCart();
		logger.info("User clicked on on cart option successfully.");
		Utils.hardWait(1000);
	}
	@Then("User click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopnotebookspageobject.clickOnRedXButton();
		logger.info("User clicked on red X button successfully.");
		Utils.hardWait(1000);
	}
	@Then("Item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		laptopnotebookspageobject.isZeroItemInCart();
		logger.info("The item removed from the cart successfully.");
		Utils.takeScreenshotForStep();
		Utils.hardWait(1000);
	}
//	Scenario 2
	@Given("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String string) {
		laptopnotebookspageobject.clickOnProductComparisonOnMacBook();
		logger.info("User clicked on product comparison icon successfully.");
		Utils.hardWait(1000);
	}
	@Given("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopnotebookspageobject.clickOnProductComparisonOnMacBookAir();
		logger.info("User clicked on product comparison icon on MacBook Air successfullty.");
		Utils.hardWait(1000);
	}
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopnotebookspageobject.clickOnProductComparisonLink();
		logger.info("User clicked on Product comparison link successfully");
		Utils.hardWait(1000);
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptopnotebookspageobject.isUserSeesProductComparisonChart();
		logger.info("User sees Product Comparison Chart successfully. ");
		Utils.takeScreenshotForStep();
		Utils.hardWait(1000);
	}
	
//	Scenario 3
	@And("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
		laptopnotebookspageobject.clickOnHeartIconOnSonyVaioLaptop();
		logger.info("User clicked on heart icon to add Sony VaIO laptop to wish list successfully");
		Utils.hardWait(1000);
	}
	@Then("User should get a message {string}")
	public void user_should_get_a_message(String expected) {
	String expectedMessageFromUI = expected;
	String actualMessageFromUI = laptopnotebookspageobject.getLoginOrCreatAccountMessage();
	Assert.assertEquals(actualMessageFromUI, expectedMessageFromUI);
	logger.info("User get the message: You must login or create an account to save Sony VAIO to your wish list! successfully");
	Utils.takeScreenshotForStep();
	Utils.hardWait(1000);
	}
	
//	Scenario 4
	@And("User click on {string} item")
	public void user_click_on_item(String string) {
		laptopnotebookspageobject.clickOnmacBookProItem();
		logger.info("User clicked on Macbook Pro item successfully.");
		Utils.hardWait(1000);
	}
	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String expectedPrice) {
		Assert.assertEquals(expectedPrice, laptopnotebookspageobject.getPriceTag());
		logger.info("User sees 2000.000 price tag is present on UI successfully");
		Utils.takeScreenshotForStep();
		Utils.hardWait(1000);
	}
}
