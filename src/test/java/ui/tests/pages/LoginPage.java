package ui.tests.pages;

import static ui.tests.pages.components.LoginPageComponents.PASSWORD_INPUT;
import static ui.tests.pages.components.LoginPageComponents.LOGIN_INPUT;
import static ui.tests.pages.components.LoginPageComponents.SIGN_IN_BUTTON;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage extends BasePage {

    public MainPage enterCredentialsAndClickOnSignInButton (String email, String password) {

        $(LOGIN_INPUT).sendKeys(email);
        $(PASSWORD_INPUT).sendKeys(password);
        $(SIGN_IN_BUTTON).click();
        return page(MainPage.class);
    }

}
