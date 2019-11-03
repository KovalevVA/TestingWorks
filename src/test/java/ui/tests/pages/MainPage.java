package ui.tests.pages;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static ui.tests.pages.components.MainPageComponents.SIGN_IN;
import ui.tests.pages.components.MenuElement;


public class MainPage {

        private MenuElement menu;

        public static MainPage openMainPage(String url) {
            open(url);
            return page(MainPage.class);
        }

        public WomenClothesPage moveToWomenPartOfMenuAndClickOnItem(String Item) {
            menu.moveToWomenPartofMenu(Item);
            menu.clickOnItem(Item);
            return page(WomenClothesPage.class);
        }

        public LoginPage goToTheLoginPage() {
            $(SIGN_IN).click();
            return page(LoginPage.class);
        }


    }
