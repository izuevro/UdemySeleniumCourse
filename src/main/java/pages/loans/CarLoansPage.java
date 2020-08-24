package pages.loans;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarLoansPage {

    WebDriver driver;

    public CarLoansPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By tabAgreements = By.xpath("//div[contains(text(), 'Agreements')]");

    /**
     * Нажать кнопку "Agreements"
     */
    @Step("Нажать кнопку \"Agreements\"")
    public CarLoansPage selectAgreementsTab() {
        driver.findElement(tabAgreements).click();
        return this;
    }

}
