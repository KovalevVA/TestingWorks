package ui.tests.pages.components;

import com.codeborne.selenide.ElementsContainer;
import org.openqa.selenium.By;

public class MenuSelectOfItemLocators extends ElementsContainer {

    public static final By ITEM_CLOTHES = By.xpath("//div[contains(@class, 'right-block')]/h5/a[contains(@class, 'product-name')]");
    public static final By ADD_ITEM_TO_CARD = By.xpath("//a[contains(@class, 'button ajax_add_to_cart_button " +
            "btn btn-default')]/span");
}
