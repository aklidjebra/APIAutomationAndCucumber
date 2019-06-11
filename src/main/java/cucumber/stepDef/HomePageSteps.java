package cucumber.stepDef;

import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageSteps {
    public static WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;

    @Given("^I browse to facebook$")
    public void i_browse_to_facebook() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
    }

    @Then("^I write (.*) and (.*)")
    public void i_fillup_fields(String user, String pass) {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.fillUsernamePass(user, pass);
    }

    @Then("^I click login$")
    public void i_click_login() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickOnLogin();
    }


    @When("^I validate all header buttons$")
    public void I_validate_all_header_buttons() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.UIvalidations();
    }

    @And("^I close the browser$")
    public void i_quit_the_app() {
        driver.quit();
    }


}
