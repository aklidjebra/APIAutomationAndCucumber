package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(linkText = "Forgot account?")
    WebElement forgotAccount;

    @FindBy(xpath = "//input[@id='email']")
    WebElement userName;

    @FindBy(xpath = "//input[@id='pass']")
    WebElement pass;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement login;

    public void clickForgotAccount() {
        forgotAccount.click();
    }

    public void fillUsernamePass(String usName, String password) {
        userName.sendKeys(usName);
        pass.sendKeys(password);
    }

    public void clickOnLogin() {
        String loginn = login.getText();
        login.click();
        System.out.println(loginn + ": has been clicked");
    }

}
