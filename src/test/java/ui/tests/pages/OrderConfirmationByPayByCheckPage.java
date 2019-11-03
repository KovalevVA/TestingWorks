package ui.tests.pages;

import static ui.tests.pages.components.OrderConfirmationByPayByCheckPageComponents.BUTTON_CONFIRM_ORDER;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class OrderConfirmationByPayByCheckPage {

    public ResultOfOrderConfirmationByPayCheck clickOnButtonOrderConfirmation() {

        $(BUTTON_CONFIRM_ORDER).click();
        return page(ResultOfOrderConfirmationByPayCheck.class);

    }
}
