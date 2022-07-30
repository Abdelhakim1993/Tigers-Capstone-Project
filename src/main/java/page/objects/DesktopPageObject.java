package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.Utils;

public class DesktopPageObject extends Base{
	
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}
	
//	Background
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsTab;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	public void moveTonDesktopsTab() {
		Utils.hoverMouseOverElement(desktopsTab);
	}
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	
//	Scenario 1
	
	@FindBy (tagName = "img")
	private List<WebElement> items; //driver.FindElements -->> return is list of elements
	public List<WebElement> getToAllItemPresentOnDesktopPage() {
		List<WebElement> itemsOnDesktop = items;
		return itemsOnDesktop;
	}
	
//	Scenario 2
	
	@FindBy(xpath = "//h4//a[text()='HP LP3065']")
	private WebElement addToCartHPLP3065;
	@FindBy(xpath = "//input[@name='quantity']")
	private WebElement quantity1;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;
	@FindBy(xpath = "(//a[text()='HP LP3065'])[3]")
	private WebElement hpAddedToCartSuccessMessage;
	
	public void addHPLP3065ToCart() {
		addToCartHPLP3065.click();
	}
	public void clearQuantity1() {
		quantity1.clear();
	}
	
	public void selectQuantity1(int a) {
		quantity1.sendKeys("1");
	}
	public void clickOnaddToCartButton() {
	addToCartButton.click();
	}
		

//	Scenario 3
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement addToCartCanonEOS5D;
	@FindBy(xpath= "//select[@id='input-option226']")
	private WebElement DropDownMenu;
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantityOfCamera;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartCameraButton;
	@FindBy(xpath = "//a[text()='shopping cart']")
	private WebElement cameraAddedToCartSuccessMessage;
	
	public void addCanonEOS5DToCart() {
		addToCartCanonEOS5D.click();
	}
	public void selectDropDownMenu() {
		Select select = new Select(DropDownMenu);
		select.selectByValue("15");
	}
	
	public void clearQuantityOfCamera() {
		quantityOfCamera.clear();
	}
	
	public void selectQuantityOfCamera(int a) {
		quantityOfCamera.sendKeys("1");
	}
	public void addCameraToCartButton() {
		addToCartCameraButton.click();
	}
	
	
//	Scenario 4
	
	@FindBy(xpath = "//img[@title='Canon EOS 5D Camera']")
	private WebElement canon5dItem;
	
	@FindBy(xpath="//a[text()='Write a review']")
	private WebElement writeAreviewLink;
	
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement writeReviewNameField;
	
	@FindBy(xpath = "//textarea[@id=\"input-review\"]")
	private WebElement reviewInputField;
	
	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement>rating;
	
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButtonOnReviewPage;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement thankForYourReview;
	
	public void clickOncanon5dItem() {
		canon5dItem.click();
	}
	public void clickOnwriteAreviewLink() {
		writeAreviewLink.click();
	}
	public void clearReviewName(String yourname) {
		writeReviewNameField.clear();
	}
	public void writeYourReviewNameField(String yourname) {
		writeReviewNameField.sendKeys(yourname);
	}
	public void writeYourReview(String yourReview) {
		reviewInputField.sendKeys(yourReview);
	}
	public void selectRating(String ratingValue) {
	List<WebElement> ratingElements = rating; 
	for (WebElement element : ratingElements) {
		if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
		element.click();	
		break;
		}
	}
	}
	public void clickOncontinueButtonOnReviewPage() {
		continueButtonOnReviewPage.click();
	}
	public String getthankForYourReviewMessage() {
		String thankYouForYourReview = thankForYourReview.getText();
		return thankYouForYourReview;
	}
}
