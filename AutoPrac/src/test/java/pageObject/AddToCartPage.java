package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumImplimentation.SeleniumImplimentation;

public class AddToCartPage {


    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[7]/div/div[1]/div/a[1]/img")
            WebElement itemImage;
    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[2]/a[2]/span")
            WebElement more;
    @FindBy(xpath = "//select[@id='group_1']")
            WebElement size;
    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
            WebElement addToCart;
    @FindBy(linkText = "Proceed to checkout")
          WebElement proceedToCheckout;
    @FindBy(linkText = "Proceed to checkout")
    WebElement proceedToCheckout2;
    @FindBy(className = "page-subheading")
          WebElement createAnAccount;

    SeleniumImplimentation selenium;
    public AddToCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        selenium = new SeleniumImplimentation();
    }

    public boolean validateATC(WebDriver driver){
        selenium.mouseHower(itemImage,driver);
        selenium.click(more);
        selenium.selectByVisibleText(size,"M");
        selenium.click(addToCart);
        selenium.pause();
        selenium.click(proceedToCheckout);
        selenium.pause();
        selenium.click(proceedToCheckout2);

       return selenium.validateAddToCart(driver,createAnAccount,"CREATE AN ACCOUNT");

    }


}
