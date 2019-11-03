package ui.tests.pages;

import com.codeborne.selenide.Condition;

import static ui.tests.pages.components.ProccedToCheckoutButtons.BUTTON_PROCEED_TO_CHECKOUT;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class AddressPage extends BasePage {

    public ShippingPage clickOnButtonProceedToCheckout () {

        $(BUTTON_PROCEED_TO_CHECKOUT).waitUntil(Condition.visible, 20000).scrollTo().click();
        return page(ShippingPage.class);
    }

}
