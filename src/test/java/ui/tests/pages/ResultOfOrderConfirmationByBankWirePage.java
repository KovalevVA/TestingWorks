package ui.tests.pages;
import static ui.tests.pages.components.ResultOfOrderConfirmationByBankWirePageComponents.RESULT_OF_PAYMENT_BY_BANK_WIRE;
import static com.codeborne.selenide.Selenide.$;

public class ResultOfOrderConfirmationByBankWirePage {

    public boolean ifPaymentByBankWireSuccessfull () {

        return ($(RESULT_OF_PAYMENT_BY_BANK_WIRE).getText().equals("Your order on My Store is complete."));
    }
}
