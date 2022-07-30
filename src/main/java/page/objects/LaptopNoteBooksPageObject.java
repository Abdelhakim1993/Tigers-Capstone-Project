package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class LaptopNoteBooksPageObject extends Base {
	
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	
//	Background
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement LaptopsAndNotebooksTab;
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement ShowAllLaptopsAndNotebooksLink;
	
	public void moveOverLaptopsAndNotebooksTab() {
		Utils.hoverMouseOverElement(LaptopsAndNotebooksTab);
	}
	public void clickOnShowAllLaptopsAndNotebooksLink() {
		ShowAllLaptopsAndNotebooksLink.click();
	}
	
//	Scenario 1
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookItem;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement oneItemToCart;
	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement redXButton;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartShow0Item;
	@FindBy(xpath = "//button//span[@id='cart-total']")
	private WebElement zeroItemInCart;
	
	public void clickOnmacBookItem() {
		macBookItem.click();
	}
	public void clickOnaddToCartButton() {
		addToCartButton.click();
	}
	public boolean isOneItemShowedToCart() {
		Utils.highlightelementBackground(oneItemToCart);
			if(oneItemToCart.isDisplayed()) {
				return true;
			}else {
				return false;
			}
	}
	public void clickOnOneItemToCart() {
		oneItemToCart.click();
	}
	public void clickOnRedXButton() {
		redXButton.click();
	}
	public boolean isZeroItemInCart() {
		Utils.highlightelementBackground(zeroItemInCart);
		if(zeroItemInCart.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
//	Scenario 2 
	
	@FindBy(xpath="(//i[@class='fa fa-exchange'])[2]")
	private WebElement productComparisonOnMacBook;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement productComparisonOnMacBookAir;
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement productComparisonLink;
	@FindBy(xpath = "//table[@class='table table-bordered']")
	private WebElement productComparisonChart;
	
	public void clickOnProductComparisonOnMacBook() {
		productComparisonOnMacBook.click();
	}
	public void clickOnProductComparisonOnMacBookAir() {
		productComparisonOnMacBookAir.click();
	}
	public void clickOnProductComparisonLink() {
		productComparisonLink.click();
	}
	public boolean isUserSeesProductComparisonChart() {
		Utils.highlightelementBackground(productComparisonChart);
		if(productComparisonChart.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
//	Scenario 3
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement heartIconOnSonyVaioLaptop;
	@FindBy(xpath="(//div[@class='alert alert-success alert-dismissible'])/text()[1]")
	private WebElement youMust;
	@FindBy(xpath = "//a[text()='login']")
	private WebElement loginInTheMessage;
	@FindBy (xpath = "(//div[@class='alert alert-success alert-dismissible'])/text()[2]")
	private WebElement or;
	@FindBy(xpath = "//a[text()='create an account']")
	private WebElement createAnAccountInTheMessage;
	@FindBy (xpath = "(//div[@class='alert alert-success alert-dismissible'])/text()[3]")
	private WebElement toSave;
	@FindBy(xpath = "(//a[text()='Sony VAIO'])[1]")
	private WebElement SonyVAIOInTheMessage;
	@FindBy (xpath = "(//div[@class='alert alert-success alert-dismissible'])/text()[4]")
	private WebElement toYour;
	@FindBy(xpath = "(//a[text()='wish list'])[1]")
	private WebElement wishListInTheMessage;
	@FindBy (xpath = "(//div[@class='alert alert-success alert-dismissible'])/text()[5]")
	private WebElement exclamationMark;
	
	public void clickOnHeartIconOnSonyVaioLaptop() {
		heartIconOnSonyVaioLaptop.click();
	}
	public String getLoginOrCreatAccountMessage() {
		String actualResult =  "You must " + loginInTheMessage.getText() + " or " + createAnAccountInTheMessage.getText() + " to save " + SonyVAIOInTheMessage.getText() + " to your " + wishListInTheMessage.getText() + "!";
		return actualResult;
	}
	@FindBy(xpath = "//h4//a[text()='MacBook Pro']")
	private WebElement macBookProItem;
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement priceTag;
	public void clickOnmacBookProItem() {
		macBookProItem.click();
	}
	public String getPriceTag() {
		Utils.highlightelementBackground(priceTag);
		String actualPrice = priceTag.getText();
		return actualPrice;
	}
}
