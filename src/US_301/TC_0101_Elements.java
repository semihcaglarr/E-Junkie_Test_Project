package US_301;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class TC_0101_Elements {

    public TC_0101_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//h4[text()='Demo eBook']/../button")
    public WebElement addCart;

    @FindBy(css="iframe[class='EJIframeV3 EJOverlayV3']")
    public WebElement iframe1;

    @FindBy(css = "button[data-option='Paypal']")
    public WebElement paypalButton;

    @FindBy(css = "[class='Actions']>button+button")
    public WebElement addPromoCode;

    @FindBy(css = "[class='Promo-Code-Value']")
    public WebElement promoCodeText;

    @FindBy(xpath = "//button[text()='Apply']")
    public WebElement promoCodeApply;

    @FindBy(xpath = "//span[text()='Invalid promo code']")
    public WebElement invalidPromoCode;
}
