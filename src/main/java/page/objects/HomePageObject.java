package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class HomePageObject extends Base{

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currency;
	
	@FindBy(xpath = "//li//button[text()='€ Euro']")
	private WebElement euro;
	
	@FindBy(xpath = "//strong[contains(text(),\"€\")]")
	private WebElement currencyValue;
	
	public void clickOnCurrency() {
		currency.click();
	}
	public void choseEuro() {
		euro.click();
	}
	
	public boolean isCurrencyValueDisplayed() {
		Utils.highlightelementBackground(currencyValue);
		if(currencyValue.isDisplayed()) {
			return true;
		}else {
		return false;
		}
	}
	
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCart;
	@FindBy(xpath = "(//p[text()='Your shopping cart is empty!'])[2]")
	private WebElement emptyShoppingCart;
	
	public void clickOnShoppingCart() {
		shoppingCart.click();
	}
	
	public String emptyShoppingCartMessage() {
		Utils.highlightelementBackground(emptyShoppingCart);
		String actualTextOnUI = emptyShoppingCart.getText();
		return actualTextOnUI;
	}
}
