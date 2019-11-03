package ui.tests.pages.components;

import com.codeborne.selenide.ElementsContainer;
import org.openqa.selenium.By;

public class PreviewOfPurchasePageComponents extends ElementsContainer {

    public static final By STATUS_OF_PURCHASE = By.tagName("h2");
    public static final By BUTTON_CONTINUE_SHOPPING = By.xpath("//span[contains(@class, " +
            "'continue btn btn-default button exclusive-medium')]/span");

}
