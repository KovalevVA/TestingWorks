package ui.tests.pages.components;

import com.codeborne.selenide.ElementsContainer;
import org.openqa.selenium.By;

public class AddressPageComponents extends ElementsContainer {
    public static final By EMAIL_ADDRESS_SELECT_ELEMENT = By.cssSelector("select#id_address_delivery." +
            "address_select,form-control.xh-highlight)");
}
