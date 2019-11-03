package ui.tests.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsContainer;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static ui.tests.pages.components.MenuLocators.*;


public class MenuElement extends ElementsContainer {

    public void moveToWomenPartofMenu(String Item) {

        $(WOMEN).hover();
        $(By.linkText(Item)).waitUntil(Condition.visible, 20000);
    }

    public void clickOnItem(String Item) {
        $(By.linkText(Item)).click();
    }

}
