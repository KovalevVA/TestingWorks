package ui.tests.pages;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.$;
import static ui.tests.pages.components.ShippingPageComponents.AGREE_TO_TERMS_CHECKBOX;
import static ui.tests.pages.components.ProccedToCheckoutButtons.BUTTON_PROCEED_TO_CHECKOUT;

public class ShippingPage extends BasePage {

    public PaymentPage tickOnAgreeToTermsAndclickOnButtonProceedToCheckout () {
        $(AGREE_TO_TERMS_CHECKBOX).click();
        $(BUTTON_PROCEED_TO_CHECKOUT).scrollTo().click();
        return page(PaymentPage.class);
    }


}
