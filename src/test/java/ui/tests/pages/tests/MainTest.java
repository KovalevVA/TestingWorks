package ui.tests.pages.tests;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static ui.tests.pages.MainPage.*;

public class MainTest {

    @BeforeTest
    @Parameters({"browser"})


    public void BrowserSetup(String browser) {

        Configuration.browser = browser;
        Configuration.timeout = 20000;
        Configuration.headless = false;
        Configuration.remote = "http://localhost:4444/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        Configuration.browserCapabilities = capabilities;

        if (browser == "firefox") {

            WebDriverManager.firefoxdriver().setup();

        }
        if (browser == "chrome") {

            WebDriverManager.chromedriver().setup();
        } else {
            WebDriverManager.edgedriver().setup();
        }
    }

    //Данный тест помещает покупку в корзину и проверяет, что корзина не пуста и покупка действительно находится в корзине

    @Test(invocationCount = 10)
    @Parameters({"url", "email_to_sign_in", "password_to_sign_in", "item_to_buy"})

    public void AddingPurchaseToCartFunction(String url, String email_to_sign_in, String password_to_sign_in,
                                             String item_to_buy) {

        openMainPage(url)
                .goToTheLoginPage()
                .enterCredentialsAndClickOnSignInButton(email_to_sign_in, password_to_sign_in)
                .moveToWomenPartOfMenuAndClickOnItem(item_to_buy)
                .moveToClothes()
                .clickOnButtonAddToCard()
                .isPurchaseSuccessfullyAddedToCart();
    }

    //Данный тест помещает выбранный товар в корзину и проверяет возможность покупки с помощью BankWire

    @Test(invocationCount = 10)
    @Parameters({"url", "email_to_sign_in", "password_to_sign_in", "item_to_buy"})
    public void PaymentWithBankWireFunction(String url, String email_to_sign_in, String password_to_sign_in,
                                            String item_to_buy) {

        openMainPage(url)
                .goToTheLoginPage()
                .enterCredentialsAndClickOnSignInButton(email_to_sign_in, password_to_sign_in)
                .moveToWomenPartOfMenuAndClickOnItem(item_to_buy)
                .moveToClothes()
                .clickOnButtonAddToCard()
                .clickOnButtonProceedToCheckout()
                .clickOnButtonProcceedToCheckout()
                .clickOnButtonProceedToCheckout()
                .tickOnAgreeToTermsAndclickOnButtonProceedToCheckout()
                .clickOnButtonPayByBankWire()
                .clickOnConfirmButton()
                .ifPaymentByBankWireSuccessfull();
    }

    //Данный тест помещает выбранный товар в корзину и проверяет возможность покупки с помощью PayCheck

    @Test(invocationCount = 10)
    @Parameters({"url", "email_to_sign_in", "password_to_sign_in", "item_to_buy"})
    public void PaymentWithPayCheckFunction(String url, String email_to_sign_in, String password_to_sign_in,
                                            String item_to_buy) {

        openMainPage(url)
                .goToTheLoginPage()
                .enterCredentialsAndClickOnSignInButton(email_to_sign_in, password_to_sign_in)
                .moveToWomenPartOfMenuAndClickOnItem(item_to_buy)
                .moveToClothes()
                .clickOnButtonAddToCard()
                .clickOnButtonProceedToCheckout()
                .clickOnButtonProcceedToCheckout()
                .clickOnButtonProceedToCheckout()
                .tickOnAgreeToTermsAndclickOnButtonProceedToCheckout()
                .clickOnButtonPayByCheck()
                .clickOnButtonOrderConfirmation()
                .ifPaymentByPayCheckSuccessfull();
    }
}

