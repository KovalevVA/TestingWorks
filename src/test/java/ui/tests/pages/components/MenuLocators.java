package ui.tests.pages.components;

import org.openqa.selenium.By;

public class MenuLocators {

    public static final By WOMEN = By.xpath("*//ul[contains(@class, 'sf-menu clearfix menu-content " +
            "sf-js-enabled sf-arrows')]/li[1]/a[contains(@class, 'sf-with-ul')]");

    public static final By LOGO = By.xpath("//img[contains(@class, 'logo img-responsive')]");
}
