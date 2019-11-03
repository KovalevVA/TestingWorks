package ui.tests.pages;

import static ui.tests.pages.components.OrderConfirmationByBankWirePageComponents.BUTTON_CONFIRM_ORDER;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
public class OrderConfirmationByBankWirePage extends BasePage {

    public ResultOfOrderConfirmationByBankWirePage clickOnConfirmButton () {

        $(BUTTON_CONFIRM_ORDER).click();
        return page(ResultOfOrderConfirmationByBankWirePage.class);

    }


}
