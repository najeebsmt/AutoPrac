package seleniumImplimentation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumImplimentation {
    Actions actions;

    public void mouseHower(WebElement element, WebDriver driver){
        actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void click(WebElement element){
        element.click();
    }

    public void pause(){
        try {
            Thread.sleep(5000);
        } catch(Exception e) {
            System.out.println("Exception value is "+e);
        }

    }
    public void selectByVisibleText(WebElement selectSize, String text){
        Select size = new Select(selectSize);
        size.selectByVisibleText(text);
    }

    public boolean validateATC(WebDriver driver, WebElement element, String expectedText){
        String displayText = element.getText();
        if(displayText.equals(expectedText)){
            return true;
        }
        return false;
    }


}

