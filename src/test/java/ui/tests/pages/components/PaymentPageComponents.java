package ui.tests.pages.components;

import com.codeborne.selenide.ElementsContainer;
import org.openqa.selenium.By;

public class PaymentPageComponents extends ElementsContainer {

    public static final By BUTTON_PAY_BY_BANK_WIRE = By.xpath("//a[contains(@class, 'bankwire')]");
    public static final By BUTTON_PAY_BY_CHECK = By.xpath("//a[contains(@class, 'cheque')]");
}
