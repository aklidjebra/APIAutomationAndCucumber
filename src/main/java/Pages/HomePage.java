package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(linkText = "Sign Up")
    WebElement signUp;
    @FindBy(linkText = "Log In")
    WebElement login;
    @FindBy(linkText = "Messenger")
    WebElement messenger;

    //input[contains(text()^='diplay')] -- starts with display
    //input[contains(text()$='diplay')] -- ends with display
    //input[contains(text()*='diplay')] -- anywhere with display

    public void UIvalidations() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (signUp.isDisplayed()) {
            System.out.println(signUp.getText() + " : is displayed");
        }
        if (login.isDisplayed()) {
            System.out.println(login.getText() + " : is displayed");
        }
        if (messenger.isDisplayed()) {
            System.out.println(messenger.getText() + " : is displayed");
        }
    }
}
