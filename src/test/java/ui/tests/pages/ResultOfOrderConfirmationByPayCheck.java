package ui.tests.pages;

import static ui.tests.pages.components.ResultOfOrderConfirmationByPayCheckComponents.RESULT_OF_PAYMENT_BY_PAY_CHECK;
import static com.codeborne.selenide.Selenide.$;

public class ResultOfOrderConfirmationByPayCheck {
    public boolean ifPaymentByPayCheckSuccessfull () {

        return ($(RESULT_OF_PAYMENT_BY_PAY_CHECK).getText().equals("Your order on My Store is complete."));
    }
}
