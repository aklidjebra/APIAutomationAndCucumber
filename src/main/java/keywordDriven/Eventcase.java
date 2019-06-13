package keywordDriven;

import Pages.HomePage;
import org.openqa.selenium.support.PageFactory;

public class Eventcase extends BaseClass {


    public void FuncCOREEventCase(String sFunctionname) {
        switch (functionNames.valueOf(sFunctionname)) {

            case UIvalidations:
                HomePage homePage = PageFactory.initElements(driver, HomePage.class);
                homePage.UIvalidations();
                break;

            case driverInit:
                driverInit();
                break;

        }
    }

    private enum functionNames {
        UIvalidations,
        driverInit
    }

}
