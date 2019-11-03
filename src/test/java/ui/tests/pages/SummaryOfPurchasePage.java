package ui.tests.pages;
import static com.codeborne.selenide.Selenide.*;
import static ui.tests.pages.components.ProccedToCheckoutButtons.BUTTON_PROCEED_TO_CHECKOUT_ON_SUMMARY_OF_PURCHASE_PAGE;

public class SummaryOfPurchasePage extends BasePage {

    public AddressPage clickOnButtonProcceedToCheckout () {

        $(BUTTON_PROCEED_TO_CHECKOUT_ON_SUMMARY_OF_PURCHASE_PAGE).scrollTo().click();
        return page(AddressPage.class);

    }
}
