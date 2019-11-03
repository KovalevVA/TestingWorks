package ui.tests.pages.components;

import com.codeborne.selenide.ElementsContainer;
import org.openqa.selenium.By;

public class LoginPageComponents extends ElementsContainer {

    public static final By LOGIN_INPUT = By.xpath("*//input[@id='email']");
    public static final By PASSWORD_INPUT = By.xpath("*//input[@id='passwd']");
    public static final By SIGN_IN_BUTTON = By.xpath("//button[@id='SubmitLogin']/span");

}
