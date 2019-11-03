package ui.tests.pages;

import static ui.tests.pages.components.PaymentPageComponents.BUTTON_PAY_BY_BANK_WIRE;
import static ui.tests.pages.components.PaymentPageComponents.BUTTON_PAY_BY_CHECK;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;



public class PaymentPage extends BasePage {

    public OrderConfirmationByBankWirePage clickOnButtonPayByBankWire() {

        $(BUTTON_PAY_BY_BANK_WIRE).click();
        return page(OrderConfirmationByBankWirePage.class);

    }

    public OrderConfirmationByPayByCheckPage clickOnButtonPayByCheck() {

        $(BUTTON_PAY_BY_CHECK).click();
        return page(OrderConfirmationByPayByCheckPage.class);
    }
}

