package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.DesktopPageObject;

import utilities.Utils;

public class DesktopPageStepDefinition extends Base {

	DesktopPageObject desktoppagebbject = new DesktopPageObject();

//	Scenario 1 : Background
		
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktoppagebbject.moveTonDesktopsTab();
		logger.info("User moved over the desktop tab successfully!");
		Utils.hardWait(1000);
	}
		
	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktoppagebbject.clickOnShowAllDesktops();
		logger.info("User clicked on show all desptop link successfully");
		Utils.hardWait(1000);
		Utils.takeScreenshotForStep();
	}
	
//	Scenario 1 : User verify all items are present in Desktops tab

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopsAllItems = desktoppagebbject.getToAllItemPresentOnDesktopPage();
		for (WebElement element : desktopsAllItems) {
			Assert.assertTrue(element.isDisplayed());
		logger.info(element.getAttribute("title") + " is present.");
		}
		Utils.hardWait(1000);
		Utils.takeScreenshotForStep();
	}
//	Scenario 2 : User add HP LP 3065 from Desktops tab to the cart

	@And("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktoppagebbject.addHPLP3065ToCart();
		logger.info("User clicked on add to cart option successfully!");
		Utils.hardWait(1000);
	
	}

	@And("User select quantity {int}")
	public void user_select_quantity(int a) {
		desktoppagebbject.clearQuantity1();
		desktoppagebbject.selectQuantity1(a);
		logger.info("User selected the quantity successfully.");
		Utils.hardWait(1000);
	}

	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktoppagebbject.clickOnaddToCartButton();
		logger.info("User clicked on add to cart button successfully");
		Utils.hardWait(1000);
		Utils.takeScreenshotForStep();
	}
		
//	Scenario 3 : User add Canon EOS 5D from Desktops tab to the cart

	@And("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktoppagebbject.addCanonEOS5DToCart();
		logger.info("User added Canon EOS 5D to cart successfully.");
		Utils.hardWait(1000);
	}

	@And("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktoppagebbject.selectDropDownMenu();
		logger.info("User selected color red from the dropdown menu successfully");
		Utils.hardWait(1000);
		Utils.takeScreenshotForStep();
	}
	


//	Scenario 4 : User add a review to Canon EOS 5D item in Desktops tab

	@Given("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktoppagebbject.clickOncanon5dItem();
		logger.info("User clicked on Can 5D item successfully.");
		Utils.hardWait(1000);
	}

	@Given("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktoppagebbject.clickOnwriteAreviewLink();
		logger.info("User clicked on Write a review link successfully.");
		Utils.hardWait(1000);
	}

	@Given("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		desktoppagebbject.clearReviewName("yourname");
		desktoppagebbject.writeYourReviewNameField(data.get(0).get("yourname"));
		desktoppagebbject.writeYourReview(data.get(0).get("yourReview"));
		desktoppagebbject.selectRating(data.get(0).get("Rating"));
		logger.info("User filled the review information successfully");
		Utils.hardWait(2000);
	}

	@Given("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktoppagebbject.clickOncontinueButtonOnReviewPage();
		logger.info("User clicked on continue button successfully.");
		Utils.hardWait(1000);
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		String expectedText = "Thank you for your review. It has been submitted to the webmaster for approval.";
		String actualText = desktoppagebbject.getthankForYourReviewMessage();
		Assert.assertEquals(expectedText, actualText);
		Utils.hardWait(1000);
		Utils.takeScreenshotForStep();
		
	}

}
