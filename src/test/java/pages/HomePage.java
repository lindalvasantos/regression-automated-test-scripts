package pages;

//import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.TimeOutForExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = TimeOutForExecution.TIME_OUT; ;
    
    private final String pageUrl = "http://advantageonlineshopping.com/#/";    
    private final String pageLoadedText = "";
    
    
    
    /*
     * ***************************************************************************************** 
     * LOCATORS: This is done through the use of @FindBy annotations
     * @see: Page Objects in Selenium tests
     * ***************************************************************************************** 
     */  
    @FindBy(css = "#mobile-section ul li:nth-of-type(2) a.img")
    @CacheLookup
    private WebElement _10;

    @FindBy(id = "shoppingCartLink")
    @CacheLookup
    private WebElement _20;

    @FindBy(id = "helpLink")
    @CacheLookup
    private WebElement aboutAosVersionsManagementConsole;

    @FindBy(name = "subjectTextareaContactUs")
    @CacheLookup
    private WebElement allYouWantFromATablet;

    @FindBy(css = ".ng-scope header nav ul.roboto-light.desktop-handler li:nth-of-type(4) a.img")
    @CacheLookup
    private WebElement categoriesTopResultsFor;

    @FindBy(name = "categoryListboxContactUs")
    @CacheLookup
    private WebElement category;

    @FindBy(id = "checkOutPopUp")
    @CacheLookup
    private WebElement checkout000;

    @FindBy(css = ".ng-scope header nav ul.roboto-light.desktop-handler li:nth-of-type(5) a.menu.navLinks.roboto-regular.ng-scope")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "a.a-button.ng-binding")
    @CacheLookup
    private WebElement continueShopping;

    @FindBy(css = "a.create-new-account.ng-scope")
    @CacheLookup
    private WebElement createNewAccount;

    @FindBy(css = ".ng-scope header nav div.logo a")
    @CacheLookup
    private WebElement dvantageDemo;

    @FindBy(name = "email")
    @CacheLookup
    private WebElement email1;

    @FindBy(name = "remember_me")
    @CacheLookup
    private WebElement email2;

    @FindBy(name = "emailContactUs")
    @CacheLookup
    private WebElement email3;

    @FindBy(name = "explore_now_btn")
    @CacheLookup
    private WebElement exploreNow1;

    @FindBy(name = "explore_now_btn")
    @CacheLookup
    private WebElement exploreNow2;

    @FindBy(name = "explore_now_btn")
    @CacheLookup
    private WebElement exploreNow3;

    @FindBy(name = "explore_now_btn")
    @CacheLookup
    private WebElement exploreNow4;

    @FindBy(css = "a.forgot-Passwowd.ng-scope")
    @CacheLookup
    private WebElement forgotYourPassword;

    @FindBy(id = "menuUserLink")
    @CacheLookup
    private WebElement myAccountMyOrdersSign;

    @FindBy(css = ".ng-scope header nav ul.roboto-light.desktop-handler li:nth-of-type(8) a.menu.navLinks.roboto-regular.ng-scope")
    @CacheLookup
    private WebElement ourProducts;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement password;

    @FindBy(css = ".ng-scope header nav ul.roboto-light.desktop-handler li:nth-of-type(6) a.menu.navLinks.roboto-regular.ng-scope")
    @CacheLookup
    private WebElement popularItems;

    @FindBy(name = "productListboxContactUs")
    @CacheLookup
    private WebElement product;

    @FindBy(css = "#toast a")
    @CacheLookup
    private WebElement productAddedSuccessfully;

    @FindBy(css = "a[href='#/product/3']")
    @CacheLookup
    private WebElement seeOffer1;

    @FindBy(id = "see_offer_btn")
    @CacheLookup
    private WebElement seeOffer2;

    @FindBy(id = "send_btnundefined")
    @CacheLookup
    private WebElement send;

    @FindBy(name = "mobile_search")
    @CacheLookup
    private WebElement shopNow;

    @FindBy(id = "sign_in_btnundefined")
    @CacheLookup
    private WebElement signIn;

    @FindBy(id = "autoComplete")
    @CacheLookup
    private WebElement signOut;

    @FindBy(css = ".ng-scope header nav ul.roboto-light.desktop-handler li:nth-of-type(7) a.menu.navLinks.roboto-regular.ng-scope")
    @CacheLookup
    private WebElement specialOffer;

    @FindBy(name = "username")
    @CacheLookup
    private WebElement username;

    @FindBy(css = "a.roboto-medium.viewAll.ng-scope")
    @CacheLookup
    private WebElement viewAll;

    @FindBy(css = "a[href='#/product/16']")
    @CacheLookup
    private WebElement viewDetails1;

    @FindBy(css = "a[href='#/product/10']")
    @CacheLookup
    private WebElement viewDetails2;

    @FindBy(css = "a[href='#/product/21']")
    @CacheLookup
    private WebElement viewDetails3;
    
    
    
    /*
     * ***************************************************************************************** 
     * CONSTRUCTORS: 
     * Page Factory will initialize every WebElement variable 
     * In this case we will use Page Factory in the constructor to initialize the Object
     * @see: Page Factory + Constructor
     * ***************************************************************************************** 
     */    

    public HomePage() {
    }

    public HomePage(WebDriver driver) {
        this();
        this.driver = driver;
        // Lindalva: manually included this to Initialize Elements
     	PageFactory.initElements(driver, this); 
    }

    public HomePage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public HomePage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    
    /*
     * ***************************************************************************************** 
     * METHODS: 
     * Test methods
     * ***************************************************************************************** 
     */  
    
    //Lindalva: open home page
	public HomePage openHomePage() {
		driver.get(pageUrl);
		return this;
	}
    
    
    /**
     * Click on 0 Link.
     *
     * @return the Home class instance.
     */
    public HomePage click1Link0() {
        _10.click();
        return this;
    }

    /**
     * Click on 0 Link.
     *
     * @return the Home class instance.
     */
    public HomePage click2Link0() {
        _20.click();
        return this;
    }

    /**
     * Click on About Aos Versions Management Console Link.
     *
     * @return the Home class instance.
     */
    public HomePage clickAboutAosVersionsManagementConsoleLink() {
        aboutAosVersionsManagementConsole.click();
        return this;
    }

    /**
     * Click on Categories Top Results For View All Link.
     *
     * @return the Home class instance.
     */
    public HomePage clickCategoriesTopResultsForLink() {
        categoriesTopResultsFor.click();
        return this;
    }

    /**
     * Click on Checkout 0.00 Button.
     *
     * @return the Home class instance.
     */
    public HomePage clickCheckout000Button() {
        checkout000.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the Home class instance.
     */
    public HomePage clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Continue Shopping Link.
     *
     * @return the Home class instance.
     */
    public HomePage clickContinueShoppingLink() {
        continueShopping.click();
        return this;
    }

    /**
     * Click on Create New Account Link.
     *
     * @return the Home class instance.
     */
    public HomePage clickCreateNewAccountLink() {
        createNewAccount.click();
        return this;
    }

    /**
     * Click on Dvantage Demo Link.
     *
     * @return the Home class instance.
     */
    public HomePage clickDvantageDemoLink() {
        dvantageDemo.click();
        return this;
    }

    /**
     * Click on Explore Now Button.
     *
     * @return the Home class instance.
     */
    public HomePage clickExploreNow1Button() {
        exploreNow1.click();
        return this;
    }

    /**
     * Click on Explore Now Button.
     *
     * @return the Home class instance.
     */
    public HomePage clickExploreNow2Button() {
        exploreNow2.click();
        return this;
    }

    /**
     * Click on Explore Now Button.
     *
     * @return the Home class instance.
     */
    public HomePage clickExploreNow3Button() {
        exploreNow3.click();
        return this;
    }

    /**
     * Click on Explore Now Button.
     *
     * @return the Home class instance.
     */
    public HomePage clickExploreNow4Button() {
        exploreNow4.click();
        return this;
    }

    /**
     * Click on Forgot Your Password Link.
     *
     * @return the Home class instance.
     */
    public HomePage clickForgotYourPasswordLink() {
        forgotYourPassword.click();
        return this;
    }

    /**
     * Click on My Account My Orders Sign Out Link.
     *
     * @return the Home class instance.
     */
    public HomePage clickMyAccountMyOrdersSignLink() {
        myAccountMyOrdersSign.click();
        return this;
    }

    /**
     * Click on Our Products Link.
     *
     * @return the Home class instance.
     */
    public HomePage clickOurProductsLink() {
        ourProducts.click();
        return this;
    }

    /**
     * Click on Popular Items Link.
     *
     * @return the Home class instance.
     */
    public HomePage clickPopularItemsLink() {
        popularItems.click();
        return this;
    }

    /**
     * Click on Product Added Successfully Link.
     *
     * @return the Home class instance.
     */
    public HomePage clickProductAddedSuccessfullyLink() {
        productAddedSuccessfully.click();
        return this;
    }

    /**
     * Click on See Offer Button.
     *
     * @return the Home class instance.
     */
    public HomePage clickSeeOffer1Button() {
        seeOffer1.click();
        return this;
    }

    /**
     * Click on See Offer Button.
     *
     * @return the Home class instance.
     */
    public HomePage clickSeeOffer2Button() {
        seeOffer2.click();
        return this;
    }

    /**
     * Click on Send Button.
     *
     * @return the Home class instance.
     */
    public HomePage clickSendButton() {
        send.click();
        return this;
    }

    /**
     * Click on Sign In Button.
     *
     * @return the Home class instance.
     */
    public HomePage clickSignInButton() {
        signIn.click();
        return this;
    }

    /**
     * Click on Special Offer Link.
     *
     * @return the Home class instance.
     */
    public HomePage clickSpecialOfferLink() {
        specialOffer.click();
        return this;
    }

    /**
     * Click on View All Link.
     *
     * @return the Home class instance.
     */
    public HomePage clickViewAllLink() {
        viewAll.click();
        return this;
    }

    /**
     * Click on View Details Link.
     *
     * @return the Home class instance.
     */
    public HomePage clickViewDetails1Link() {
        viewDetails1.click();
        return this;
    }

    /**
     * Click on View Details Link.
     *
     * @return the Home class instance.
     */
    public HomePage clickViewDetails2Link() {
        viewDetails2.click();
        return this;
    }

    /**
     * Click on View Details Link.
     *
     * @return the Home class instance.
     */
    public HomePage clickViewDetails3Link() {
        viewDetails3.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the Home class instance.
     */
    public HomePage fill() {
        setUsernameTextField();
        setPasswordPasswordField();
        setEmail1CheckboxField();
        setEmail2CheckboxField();
        setSignOutTextField();
        setShopNowTextField();
        setCategoryDropDownListField();
        setProductDropDownListField();
        setEmail3TextField();
        setAllYouWantFromATabletTextareaField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the Home class instance.
     */
    public HomePage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to All You Want From A Tablet Textarea field.
     *
     * @return the Home class instance.
     */
    public HomePage setAllYouWantFromATabletTextareaField() {
        return setAllYouWantFromATabletTextareaField(data.get("ALL_YOU_WANT_FROM_A_TABLET"));
    }

    /**
     * Set value to All You Want From A Tablet Textarea field.
     *
     * @return the Home class instance.
     */
    public HomePage setAllYouWantFromATabletTextareaField(String allYouWantFromATabletValue) {
        allYouWantFromATablet.sendKeys(allYouWantFromATabletValue);
        return this;
    }

    /**
     * Set default value to Category Drop Down List field.
     *
     * @return the Home class instance.
     */
    public HomePage setCategoryDropDownListField() {
        return setCategoryDropDownListField(data.get("CATEGORY"));
    }

    /**
     * Set value to Category Drop Down List field.
     *
     * @return the Home class instance.
     */
    public HomePage setCategoryDropDownListField(String categoryValue) {
        new Select(category).selectByVisibleText(categoryValue);
        return this;
    }

    /**
     * Set default value to Email Text field.
     *
     * @return the Home class instance.
     */
    public HomePage setEmail1CheckboxField() {
        return setEmail1CheckboxField(data.get("EMAIL"));
    }

    /**
     * Set Email Checkbox field.
     *
     * @return the Home class instance.
     */
    public HomePage setEmail1CheckboxField(String emailValue) {
        email1.sendKeys(emailValue);
        return this;
    }

    /**
     * Set Email Checkbox field.
     *
     * @return the Home class instance.
     */
    public HomePage setEmail2CheckboxField() {
        if (!email2.isSelected()) {
            email2.click();
        }
        return this;
    }

    /**
     * Set default value to Email Text field.
     *
     * @return the Home class instance.
     */
    public HomePage setEmail3TextField() {
        return setEmail3TextField(data.get("EMAIL_3"));
    }

    /**
     * Set value to Email Text field.
     *
     * @return the Home class instance.
     */
    public HomePage setEmail3TextField(String email3Value) {
        email3.sendKeys(email3Value);
        return this;
    }

    /**
     * Set default value to Password Password field.
     *
     * @return the Home class instance.
     */
    public HomePage setPasswordPasswordField() {
        return setPasswordPasswordField(data.get("PASSWORD"));
    }

    /**
     * Set value to Password Password field.
     *
     * @return the Home class instance.
     */
    public HomePage setPasswordPasswordField(String passwordValue) {
        password.sendKeys(passwordValue);
        return this;
    }

    /**
     * Set default value to Product Drop Down List field.
     *
     * @return the Home class instance.
     */
    public HomePage setProductDropDownListField() {
        return setProductDropDownListField(data.get("PRODUCT"));
    }

    /**
     * Set value to Product Drop Down List field.
     *
     * @return the Home class instance.
     */
    public HomePage setProductDropDownListField(String productValue) {
        new Select(product).selectByVisibleText(productValue);
        return this;
    }

    /**
     * Set default value to Shop Now Text field.
     *
     * @return the Home class instance.
     */
    public HomePage setShopNowTextField() {
        return setShopNowTextField(data.get("SHOP_NOW"));
    }

    /**
     * Set value to Shop Now Text field.
     *
     * @return the Home class instance.
     */
    public HomePage setShopNowTextField(String shopNowValue) {
        shopNow.sendKeys(shopNowValue);
        return this;
    }

    /**
     * Set default value to Sign Out Text field.
     *
     * @return the Home class instance.
     */
    public HomePage setSignOutTextField() {
        return setSignOutTextField(data.get("SIGN_OUT"));
    }

    /**
     * Set value to Sign Out Text field.
     *
     * @return the Home class instance.
     */
    public HomePage setSignOutTextField(String signOutValue) {
        signOut.sendKeys(signOutValue);
        return this;
    }

    /**
     * Set default value to Username Text field.
     *
     * @return the Home class instance.
     */
    public HomePage setUsernameTextField() {
        return setUsernameTextField(data.get("USERNAME"));
    }

    /**
     * Set value to Username Text field.
     *
     * @return the Home class instance.
     */
    public HomePage setUsernameTextField(String usernameValue) {
        username.sendKeys(usernameValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the Home class instance.
     */
    public HomePage submit() {
        clickCheckout000Button();
        return this;
    }

    /**
     * Unset default value from Category Drop Down List field.
     *
     * @return the Home class instance.
     */
    public HomePage unsetCategoryDropDownListField() {
        return unsetCategoryDropDownListField(data.get("CATEGORY"));
    }

    /**
     * Unset value from Category Drop Down List field.
     *
     * @return the Home class instance.
     */
    public HomePage unsetCategoryDropDownListField(String categoryValue) {
        new Select(category).deselectByVisibleText(categoryValue);
        return this;
    }

    /**
     * Unset Email Checkbox field.
     *
     * @return the Home class instance.
     */
    public HomePage unsetEmail2CheckboxField() {
        if (email2.isSelected()) {
            email2.click();
        }
        return this;
    }

    /**
     * Unset default value from Product Drop Down List field.
     *
     * @return the Home class instance.
     */
    public HomePage unsetProductDropDownListField() {
        return unsetProductDropDownListField(data.get("PRODUCT"));
    }

    /**
     * Unset value from Product Drop Down List field.
     *
     * @return the Home class instance.
     */
    public HomePage unsetProductDropDownListField(String productValue) {
        new Select(product).deselectByVisibleText(productValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the Home class instance.
     */
    @SuppressWarnings("deprecation")
	public HomePage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the Home class instance.
     */
    @SuppressWarnings("deprecation")
	public HomePage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

