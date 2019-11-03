package ui.tests.pages;
import com.codeborne.selenide.Condition;

import static ui.tests.pages.components.MenuSelectOfItemLocators.*;
import static com.codeborne.selenide.Selenide.*;

public class SelectedItemPage extends BasePage {

    public PreviewOfPurchasePage clickOnButtonAddToCard() {

        $(ADD_ITEM_TO_CARD).waitUntil(Condition.visible, 20000);
        $(ADD_ITEM_TO_CARD).click();
        return page(PreviewOfPurchasePage.class);
    }

}
