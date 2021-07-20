package cartTest;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.AddToCartPage;

public class AddToCartTest {
    WebDriver driver;
    AddToCartPage page;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver-2");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        page = new AddToCartPage(driver);

    }

    @Test
    public void validateATC(){
        Assert.assertTrue(page.validateATC(driver));
        driver.quit();
    }

}
