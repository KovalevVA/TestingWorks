package ui.tests.pages;


import static com.codeborne.selenide.Selenide.*;
import static ui.tests.pages.components.MenuSelectOfItemLocators.*;

public class WomenClothesPage extends BasePage {

    public SelectedItemPage moveToClothes() {
        $(ITEM_CLOTHES).scrollTo().hover();
        return page(SelectedItemPage.class);
    }

}
