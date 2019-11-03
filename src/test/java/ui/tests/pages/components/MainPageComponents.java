package ui.tests.pages.components;

import com.codeborne.selenide.ElementsContainer;
import org.openqa.selenium.By;

public class MainPageComponents extends ElementsContainer {

    public static final By SIGN_IN = By.xpath("*//a[contains(@class, 'login')]");
}
