package pages;

//import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpeakersPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#mobile-section ul li:nth-of-type(2) a.img")
    @CacheLookup
    private WebElement _10;

    @FindBy(css = ".ng-scope div:nth-of-type(3) section.ng-scope article div:nth-of-type(3) div.ng-scope div.category-type-products.ng-isolate-scope div:nth-of-type(2) ul li:nth-of-type(2) p:nth-of-type(2) a.productPrice.ng-binding")
    @CacheLookup
    private WebElement _12900;

    @FindBy(css = ".ng-scope div:nth-of-type(3) section.ng-scope article div:nth-of-type(3) div.ng-scope div.category-type-products.ng-isolate-scope div:nth-of-type(2) ul li:nth-of-type(4) p:nth-of-type(2) a.productPrice.ng-binding")
    @CacheLookup
    private WebElement _16999;

    @FindBy(id = "shoppingCartLink")
    @CacheLookup
    private WebElement _20;

    @FindBy(css = ".ng-scope div:nth-of-type(3) section.ng-scope article div:nth-of-type(3) div.ng-scope div.category-type-products.ng-isolate-scope div:nth-of-type(2) ul li:nth-of-type(6) p:nth-of-type(2) a.productPrice.ng-binding")
    @CacheLookup
    private WebElement _20000;

    @FindBy(css = ".ng-scope div:nth-of-type(3) section.ng-scope article div:nth-of-type(3) div.ng-scope div.category-type-products.ng-isolate-scope div:nth-of-type(2) ul li:nth-of-type(1) p:nth-of-type(2) a.productPrice.ng-binding")
    @CacheLookup
    private WebElement _26999;

    @FindBy(css = ".ng-scope div:nth-of-type(3) section.ng-scope article div:nth-of-type(3) div.ng-scope div.category-type-products.ng-isolate-scope div:nth-of-type(2) ul li:nth-of-type(3) p:nth-of-type(2) a.productPrice.ng-binding")
    @CacheLookup
    private WebElement _4499;

    @FindBy(css = ".ng-scope div:nth-of-type(3) section.ng-scope article div:nth-of-type(3) div.ng-scope div.category-type-products.ng-isolate-scope div:nth-of-type(2) ul li:nth-of-type(7) p:nth-of-type(2) a.productPrice.ng-binding")
    @CacheLookup
    private WebElement _4999;

    @FindBy(css = ".ng-scope div:nth-of-type(3) section.ng-scope article div:nth-of-type(3) div.ng-scope div.category-type-products.ng-isolate-scope div:nth-of-type(2) ul li:nth-of-type(5) p:nth-of-type(2) a.productPrice.ng-binding")
    @CacheLookup
    private WebElement _8499;

    @FindBy(id = "helpLink")
    @CacheLookup
    private WebElement aboutAosVersionsManagementConsole;

    @FindBy(id = "compatibility_0")
    @CacheLookup
    private WebElement anyDeviceThatHasBluetoothEnabled1;

    @FindBy(id = "compatibility_1")
    @CacheLookup
    private WebElement anyDeviceThatHasBluetoothEnabled2;

    @FindBy(id = "wireless_technology_0")
    @CacheLookup
    private WebElement bluetooh;

    @FindBy(id = "wireless_technology_1")
    @CacheLookup
    private WebElement bluetooth;

    @FindBy(id = "manufacturer_0")
    @CacheLookup
    private WebElement bose;

    @FindBy(css = ".ng-scope div:nth-of-type(3) section.ng-scope article div:nth-of-type(3) div.ng-scope div.category-type-products.ng-isolate-scope div:nth-of-type(2) ul li:nth-of-type(1) p:nth-of-type(1) a.productName.ng-binding")
    @CacheLookup
    private WebElement boseSoundlinkBluetoothSpeakerIii;

    @FindBy(css = ".ng-scope div:nth-of-type(3) section.ng-scope article div:nth-of-type(3) div.ng-scope div.category-type-products.ng-isolate-scope div:nth-of-type(2) ul li:nth-of-type(2) p:nth-of-type(1) a.productName.ng-binding")
    @CacheLookup
    private WebElement boseSoundlinkWirelessSpeaker;

    @FindBy(css = "a[href='#/product/19']")
    @CacheLookup
    private WebElement buyNow1;

    @FindBy(name = "buy_now")
    @CacheLookup
    private WebElement buyNow2;

    @FindBy(css = ".ng-scope header nav ul.roboto-light.desktop-handler li:nth-of-type(4) a.img")
    @CacheLookup
    private WebElement categoriesTopResultsFor;

    @FindBy(id = "checkOutPopUp")
    @CacheLookup
    private WebElement checkout000;

    @FindBy(css = ".ng-scope header nav ul.roboto-light.desktop-handler li:nth-of-type(5) a.menu.navLinks.roboto-regular.ng-scope")
    @CacheLookup
    private WebElement contactUs;

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

    @FindBy(css = "a.forgot-Passwowd.ng-scope")
    @CacheLookup
    private WebElement forgotYourPassword;

    @FindBy(css = ".ng-scope div:nth-of-type(3) section.ng-scope article div:nth-of-type(2) nav.pages.categoryDataFixedNav a:nth-of-type(1)")
    @CacheLookup
    private WebElement home;

    @FindBy(id = "manufacturer_1")
    @CacheLookup
    private WebElement hp;

    @FindBy(css = ".ng-scope div:nth-of-type(3) section.ng-scope article div:nth-of-type(3) div.ng-scope div.category-type-products.ng-isolate-scope div:nth-of-type(2) ul li:nth-of-type(3) p:nth-of-type(1) a.productName.ng-binding")
    @CacheLookup
    private WebElement hpRoarMiniWirelessSpeaker;

    @FindBy(css = ".ng-scope div:nth-of-type(3) section.ng-scope article div:nth-of-type(3) div.ng-scope div.category-type-products.ng-isolate-scope div:nth-of-type(2) ul li:nth-of-type(4) p:nth-of-type(1) a.productName.ng-binding")
    @CacheLookup
    private WebElement hpRoarPlusWirelessSpeaker;

    @FindBy(css = ".ng-scope div:nth-of-type(3) section.ng-scope article div:nth-of-type(3) div.ng-scope div.category-type-products.ng-isolate-scope div:nth-of-type(2) ul li:nth-of-type(5) p:nth-of-type(1) a.productName.ng-binding")
    @CacheLookup
    private WebElement hpRoarWirelessSpeaker;

    @FindBy(css = ".ng-scope div:nth-of-type(3) section.ng-scope article div:nth-of-type(3) div.ng-scope div.category-type-products.ng-isolate-scope div:nth-of-type(2) ul li:nth-of-type(6) p:nth-of-type(1) a.productName.ng-binding")
    @CacheLookup
    private WebElement hpS9500BluetoothWirelessSpeaker;

    @FindBy(css = "a.titleItemsCount.ng-binding")
    @CacheLookup
    private WebElement items7;

    @FindBy(id = "weight_0")
    @CacheLookup
    private WebElement lb055;

    @FindBy(id = "weight_1")
    @CacheLookup
    private WebElement lb10;

    @FindBy(id = "weight_2")
    @CacheLookup
    private WebElement lb11;

    @FindBy(id = "weight_3")
    @CacheLookup
    private WebElement lb125;

    @FindBy(id = "weight_4")
    @CacheLookup
    private WebElement lb126;

    @FindBy(id = "weight_5")
    @CacheLookup
    private WebElement lb195;

    @FindBy(id = "weight_6")
    @CacheLookup
    private WebElement lb303;

    @FindBy(id = "manufacturer_2")
    @CacheLookup
    private WebElement logitech;

    @FindBy(css = ".ng-scope div:nth-of-type(3) section.ng-scope article div:nth-of-type(3) div.ng-scope div.category-type-products.ng-isolate-scope div:nth-of-type(2) ul li:nth-of-type(7) p:nth-of-type(1) a.productName.ng-binding")
    @CacheLookup
    private WebElement logitechX100SpeakerSystemWireless;

    @FindBy(id = "menuUserLink")
    @CacheLookup
    private WebElement myAccountMyOrdersSign;

    @FindBy(css = ".ng-scope header nav ul.roboto-light.desktop-handler li:nth-of-type(8) a.menu.navLinks.roboto-regular.ng-scope")
    @CacheLookup
    private WebElement ourProducts;

    private final String pageLoadedText = "Bose Soundlink Bluetooth Speaker III";

    private final String pageUrl = "/#/category/Speakers/4";

    @FindBy(name = "password")
    @CacheLookup
    private WebElement password;

    @FindBy(css = ".ng-scope header nav ul.roboto-light.desktop-handler li:nth-of-type(6) a.menu.navLinks.roboto-regular.ng-scope")
    @CacheLookup
    private WebElement popularItems;

    @FindBy(css = "#toast a")
    @CacheLookup
    private WebElement productAddedSuccessfully;

    @FindBy(id = "sign_in_btnundefined")
    @CacheLookup
    private WebElement signIn;

    @FindBy(id = "autoComplete")
    @CacheLookup
    private WebElement signOut;

    @FindBy(css = "a.select.ng-binding")
    @CacheLookup
    private WebElement speakers;

    @FindBy(css = ".ng-scope header nav ul.roboto-light.desktop-handler li:nth-of-type(7) a.menu.navLinks.roboto-regular.ng-scope")
    @CacheLookup
    private WebElement specialOffer;

    @FindBy(name = "username")
    @CacheLookup
    private WebElement usernameFieldIsRequired;

    @FindBy(css = "a.roboto-medium.viewAll.ng-scope")
    @CacheLookup
    private WebElement viewAll;

    public SpeakersPage() {
    }

    public SpeakersPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public SpeakersPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public SpeakersPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on 0 Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage click1Link0() {
        _10.click();
        return this;
    }

    /**
     * Click on 0 Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage click2Link0() {
        _20.click();
        return this;
    }

    /**
     * Click on About Aos Versions Management Console Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickAboutAosVersionsManagementConsoleLink() {
        aboutAosVersionsManagementConsole.click();
        return this;
    }

    /**
     * Click on Bose Soundlink Bluetooth Speaker Iii Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickBoseSoundlinkBluetoothSpeakerIiiLink() {
        boseSoundlinkBluetoothSpeakerIii.click();
        return this;
    }

    /**
     * Click on Bose Soundlink Wireless Speaker Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickBoseSoundlinkWirelessSpeakerLink() {
        boseSoundlinkWirelessSpeaker.click();
        return this;
    }

    /**
     * Click on Buy Now Button.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickBuyNow1Button() {
        buyNow1.click();
        return this;
    }

    /**
     * Click on Buy Now Button.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickBuyNow2Button() {
        buyNow2.click();
        return this;
    }

    /**
     * Click on Categories Top Results For View All Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickCategoriesTopResultsForLink() {
        categoriesTopResultsFor.click();
        return this;
    }

    /**
     * Click on Checkout 0.00 Button.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickCheckout000Button() {
        checkout000.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Create New Account Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickCreateNewAccountLink() {
        createNewAccount.click();
        return this;
    }

    /**
     * Click on Dvantage Demo Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickDvantageDemoLink() {
        dvantageDemo.click();
        return this;
    }

    /**
     * Click on Forgot Your Password Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickForgotYourPasswordLink() {
        forgotYourPassword.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Hp Roar Mini Wireless Speaker Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickHpRoarMiniWirelessSpeakerLink() {
        hpRoarMiniWirelessSpeaker.click();
        return this;
    }

    /**
     * Click on Hp Roar Plus Wireless Speaker Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickHpRoarPlusWirelessSpeakerLink() {
        hpRoarPlusWirelessSpeaker.click();
        return this;
    }

    /**
     * Click on Hp Roar Wireless Speaker Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickHpRoarWirelessSpeakerLink() {
        hpRoarWirelessSpeaker.click();
        return this;
    }

    /**
     * Click on Hp S9500 Bluetooth Wireless Speaker Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickHpS9500BluetoothWirelessSpeakerLink() {
        hpS9500BluetoothWirelessSpeaker.click();
        return this;
    }

    /**
     * Click on 7 Items Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickItemsLink7() {
        items7.click();
        return this;
    }

    /**
     * Click on 129.00 Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickLink12900() {
        _12900.click();
        return this;
    }

    /**
     * Click on 169.99 Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickLink16999() {
        _16999.click();
        return this;
    }

    /**
     * Click on 200.00 Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickLink20000() {
        _20000.click();
        return this;
    }

    /**
     * Click on 269.99 Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickLink26999() {
        _26999.click();
        return this;
    }

    /**
     * Click on 44.99 Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickLink4499() {
        _4499.click();
        return this;
    }

    /**
     * Click on 49.99 Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickLink4999() {
        _4999.click();
        return this;
    }

    /**
     * Click on 84.99 Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickLink8499() {
        _8499.click();
        return this;
    }

    /**
     * Click on Logitech X100 Speaker System Wireless Speakers Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickLogitechX100SpeakerSystemWirelessLink() {
        logitechX100SpeakerSystemWireless.click();
        return this;
    }

    /**
     * Click on My Account My Orders Sign Out Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickMyAccountMyOrdersSignLink() {
        myAccountMyOrdersSign.click();
        return this;
    }

    /**
     * Click on Our Products Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickOurProductsLink() {
        ourProducts.click();
        return this;
    }

    /**
     * Click on Popular Items Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickPopularItemsLink() {
        popularItems.click();
        return this;
    }

    /**
     * Click on Product Added Successfully Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickProductAddedSuccessfullyLink() {
        productAddedSuccessfully.click();
        return this;
    }

    /**
     * Click on Sign In Button.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickSignInButton() {
        signIn.click();
        return this;
    }

    /**
     * Click on Speakers Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickSpeakersLink() {
        speakers.click();
        return this;
    }

    /**
     * Click on Special Offer Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickSpecialOfferLink() {
        specialOffer.click();
        return this;
    }

    /**
     * Click on View All Link.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage clickViewAllLink() {
        viewAll.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage fill() {
        setUsernameFieldIsRequiredTextField();
        setPasswordPasswordField();
        setEmail1CheckboxField();
        setEmail2CheckboxField();
        setSignOutTextField();
        setAnyDeviceThatHasBluetoothEnabled1CheckboxField();
        setAnyDeviceThatHasBluetoothEnabled2CheckboxField();
        setBoseCheckboxField();
        setHpCheckboxField();
        setLogitechCheckboxField();
        setLbCheckboxField055();
        setLbCheckboxField10();
        setLbCheckboxField11();
        setLbCheckboxField125();
        setLbCheckboxField126();
        setLbCheckboxField195();
        setLbCheckboxField303();
        setBluetoohCheckboxField();
        setBluetoothCheckboxField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set Any Device That Has Bluetooth Enabled Or A 3.5 Mm Audio Connector. Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setAnyDeviceThatHasBluetoothEnabled1CheckboxField() {
        if (!anyDeviceThatHasBluetoothEnabled1.isSelected()) {
            anyDeviceThatHasBluetoothEnabled1.click();
        }
        return this;
    }

    /**
     * Set Any Device That Has Bluetooth Enabled Or A 3.5 Mm Audio Connector. Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setAnyDeviceThatHasBluetoothEnabled2CheckboxField() {
        if (!anyDeviceThatHasBluetoothEnabled2.isSelected()) {
            anyDeviceThatHasBluetoothEnabled2.click();
        }
        return this;
    }

    /**
     * Set Bluetooh Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setBluetoohCheckboxField() {
        if (!bluetooh.isSelected()) {
            bluetooh.click();
        }
        return this;
    }

    /**
     * Set Bluetooth Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setBluetoothCheckboxField() {
        if (!bluetooth.isSelected()) {
            bluetooth.click();
        }
        return this;
    }

    /**
     * Set Bose Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setBoseCheckboxField() {
        if (!bose.isSelected()) {
            bose.click();
        }
        return this;
    }

    /**
     * Set default value to Email Text field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setEmail1CheckboxField() {
        return setEmail1CheckboxField(data.get("EMAIL"));
    }

    /**
     * Set Email Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setEmail1CheckboxField(String emailValue) {
        email1.sendKeys(emailValue);
        return this;
    }

    /**
     * Set Email Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setEmail2CheckboxField() {
        if (!email2.isSelected()) {
            email2.click();
        }
        return this;
    }

    /**
     * Set Hp Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setHpCheckboxField() {
        if (!hp.isSelected()) {
            hp.click();
        }
        return this;
    }

    /**
     * Set 0.55 Lb Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setLbCheckboxField055() {
        if (!lb055.isSelected()) {
            lb055.click();
        }
        return this;
    }

    /**
     * Set 1.0 Lb Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setLbCheckboxField10() {
        if (!lb10.isSelected()) {
            lb10.click();
        }
        return this;
    }

    /**
     * Set 1.1 Lb Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setLbCheckboxField11() {
        if (!lb11.isSelected()) {
            lb11.click();
        }
        return this;
    }

    /**
     * Set 1.25 Lb Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setLbCheckboxField125() {
        if (!lb125.isSelected()) {
            lb125.click();
        }
        return this;
    }

    /**
     * Set 1.26 Lb Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setLbCheckboxField126() {
        if (!lb126.isSelected()) {
            lb126.click();
        }
        return this;
    }

    /**
     * Set 1.95 Lb Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setLbCheckboxField195() {
        if (!lb195.isSelected()) {
            lb195.click();
        }
        return this;
    }

    /**
     * Set 3.03 Lb Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setLbCheckboxField303() {
        if (!lb303.isSelected()) {
            lb303.click();
        }
        return this;
    }

    /**
     * Set Logitech Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setLogitechCheckboxField() {
        if (!logitech.isSelected()) {
            logitech.click();
        }
        return this;
    }

    /**
     * Set default value to Password Password field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setPasswordPasswordField() {
        return setPasswordPasswordField(data.get("PASSWORD"));
    }

    /**
     * Set value to Password Password field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setPasswordPasswordField(String passwordValue) {
        password.sendKeys(passwordValue);
        return this;
    }

    /**
     * Set default value to Sign Out Text field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setSignOutTextField() {
        return setSignOutTextField(data.get("SIGN_OUT"));
    }

    /**
     * Set value to Sign Out Text field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setSignOutTextField(String signOutValue) {
        signOut.sendKeys(signOutValue);
        return this;
    }

    /**
     * Set default value to Username Field Is Required Text field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setUsernameFieldIsRequiredTextField() {
        return setUsernameFieldIsRequiredTextField(data.get("USERNAME_FIELD_IS_REQUIRED"));
    }

    /**
     * Set value to Username Field Is Required Text field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage setUsernameFieldIsRequiredTextField(String usernameFieldIsRequiredValue) {
        usernameFieldIsRequired.sendKeys(usernameFieldIsRequiredValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage submit() {
        clickCheckout000Button();
        return this;
    }

    /**
     * Unset Any Device That Has Bluetooth Enabled Or A 3.5 Mm Audio Connector. Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage unsetAnyDeviceThatHasBluetoothEnabled1CheckboxField() {
        if (anyDeviceThatHasBluetoothEnabled1.isSelected()) {
            anyDeviceThatHasBluetoothEnabled1.click();
        }
        return this;
    }

    /**
     * Unset Any Device That Has Bluetooth Enabled Or A 3.5 Mm Audio Connector. Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage unsetAnyDeviceThatHasBluetoothEnabled2CheckboxField() {
        if (anyDeviceThatHasBluetoothEnabled2.isSelected()) {
            anyDeviceThatHasBluetoothEnabled2.click();
        }
        return this;
    }

    /**
     * Unset Bluetooh Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage unsetBluetoohCheckboxField() {
        if (bluetooh.isSelected()) {
            bluetooh.click();
        }
        return this;
    }

    /**
     * Unset Bluetooth Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage unsetBluetoothCheckboxField() {
        if (bluetooth.isSelected()) {
            bluetooth.click();
        }
        return this;
    }

    /**
     * Unset Bose Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage unsetBoseCheckboxField() {
        if (bose.isSelected()) {
            bose.click();
        }
        return this;
    }

    /**
     * Unset Email Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage unsetEmail2CheckboxField() {
        if (email2.isSelected()) {
            email2.click();
        }
        return this;
    }

    /**
     * Unset Hp Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage unsetHpCheckboxField() {
        if (hp.isSelected()) {
            hp.click();
        }
        return this;
    }

    /**
     * Unset 0.55 Lb Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage unsetLbCheckboxField055() {
        if (lb055.isSelected()) {
            lb055.click();
        }
        return this;
    }

    /**
     * Unset 1.0 Lb Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage unsetLbCheckboxField10() {
        if (lb10.isSelected()) {
            lb10.click();
        }
        return this;
    }

    /**
     * Unset 1.1 Lb Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage unsetLbCheckboxField11() {
        if (lb11.isSelected()) {
            lb11.click();
        }
        return this;
    }

    /**
     * Unset 1.25 Lb Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage unsetLbCheckboxField125() {
        if (lb125.isSelected()) {
            lb125.click();
        }
        return this;
    }

    /**
     * Unset 1.26 Lb Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage unsetLbCheckboxField126() {
        if (lb126.isSelected()) {
            lb126.click();
        }
        return this;
    }

    /**
     * Unset 1.95 Lb Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage unsetLbCheckboxField195() {
        if (lb195.isSelected()) {
            lb195.click();
        }
        return this;
    }

    /**
     * Unset 3.03 Lb Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage unsetLbCheckboxField303() {
        if (lb303.isSelected()) {
            lb303.click();
        }
        return this;
    }

    /**
     * Unset Logitech Checkbox field.
     *
     * @return the SpeakersPage class instance.
     */
    public SpeakersPage unsetLogitechCheckboxField() {
        if (logitech.isSelected()) {
            logitech.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the SpeakersPage class instance.
     */
    @SuppressWarnings("deprecation")
	public SpeakersPage verifyPageLoaded() {
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
     * @return the SpeakersPage class instance.
     */
    @SuppressWarnings("deprecation")
	public SpeakersPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

