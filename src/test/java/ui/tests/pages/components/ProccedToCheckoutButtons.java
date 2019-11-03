package ui.tests.pages.components;

import com.codeborne.selenide.ElementsContainer;
import org.openqa.selenium.By;

public class ProccedToCheckoutButtons extends ElementsContainer {

    public static final By BUTTON_PROCEED_TO_CHECKOUT = By.xpath
            ("*//a[contains(@class, 'btn btn-default button button-medium')]/span");
    public static final By BUTTON_PROCEED_TO_CHECKOUT_ON_SUMMARY_OF_PURCHASE_PAGE = By.xpath("//a[contains(@class, " +
            "'button btn btn-default standard-checkout button-medium')]/span");
}
