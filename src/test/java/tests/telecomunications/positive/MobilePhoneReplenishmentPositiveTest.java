package tests.telecomunications.positive;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.MobileReplenishmentTestData.*;
import static constants.Constant.Urls.*;

@Feature("Тестовый проект по Selenium на Udemy")
@Owner("Роман Зуев")
public class MobilePhoneReplenishmentPositiveTest extends BaseTest {

    @Test
    @DisplayName("Проверка редиректа на страницу авторизации")
    @Story("Тестовый проект по Selenium на Udemy")
    public void checkIsRedirectToAuth() {
        basePage.goToUrl(getMobilePaymentUrl());
        mobilePhoneReplenishmentPage.selectCardFromWallet();
        basePage.isAuthWidgetPresent();
    }

    @Test
    @DisplayName("Проверка детальной информации платежа при оплате мобильного телефона")
    @Story("Тестовый проект по Selenium на Udemy")
    public void checkMinimumReplenishmentAmount() {
        basePage.goToUrl(getMobilePaymentUrl());
        mobilePhoneReplenishmentPage
                .enterPhoneNumber(getMobilePaymentPhoneNumber())
                .enterAmount("1")
                .enterCardFrom(getMobilePaymentCard())
                .enterCardExpDate(getMobilePaymentCardExpDate())
                .enterCardCvv(getMobilePaymentCardSvv())
                .submitToTheCart()
                .checkPaymentDetailsIsPresentInTheCart("Mobile payment. Phone number +380987654321");
    }
}
