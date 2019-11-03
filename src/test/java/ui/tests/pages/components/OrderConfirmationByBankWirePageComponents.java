package ui.tests.pages.components;

import com.codeborne.selenide.ElementsContainer;
import org.openqa.selenium.By;

public class OrderConfirmationByBankWirePageComponents extends ElementsContainer {

    public static final By BUTTON_CONFIRM_ORDER = By.xpath("//button[contains(@class, 'button btn btn-default button-medium')]" +
            "/span");

}
