package ui.tests.pages;
import static ui.tests.pages.components.PreviewOfPurchasePageComponents.*;
import static ui.tests.pages.components.ProccedToCheckoutButtons.*;
import static com.codeborne.selenide.Selenide.*;

public class PreviewOfPurchasePage extends BasePage {

    public SummaryOfPurchasePage clickOnButtonProceedToCheckout () {

        $(BUTTON_PROCEED_TO_CHECKOUT).click();
        return page(SummaryOfPurchasePage.class);
    }

    public WomenClothesPage clickOnContinueShopping () {

            $(BUTTON_CONTINUE_SHOPPING).click();
            return page(WomenClothesPage.class);


    }

    public boolean isPurchaseSuccessfullyAddedToCart () {

        return ($(STATUS_OF_PURCHASE).getText().equals("Product successfully added to your shopping cart"));

    }

}
