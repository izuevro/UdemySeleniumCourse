package tests.loans.positive;

import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.getCarLoansUrl;

public class CarLoansPositiveTest extends BaseTest {

    @Test
    @DisplayName("Проверка перехода на страницу \"Agreements\"")
    @Story("Тестовый проект по Selenium на Udemy")
    public void selectAgreementsTabInPublicSession(){
        basePage.goToUrl(getCarLoansUrl());
        carLoansPage.selectAgreementsTab();
        basePage.isAuthWidgetPresent();
    }
}
