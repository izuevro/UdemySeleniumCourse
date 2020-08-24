package pages.telecomunications;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import static io.qameta.allure.Allure.parameter;

public class MobilePhoneReplenishmentPage extends BasePage {
    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonWallet = By.xpath("//div[@data-qa-node='debitSourceSource']"),
            inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']"),
            inputAmount = By.xpath("//input[@data-qa-node='amount']"),
            inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']"),
            inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']"),
            inputCardCvv = By.xpath("//input[@data-qa-node='cvvdebitSource']"),
            buttonSubmitToTheCart = By.xpath("//button[@data-qa-node='submit']"),
            paymentDetails = By.xpath("//span[@data-qa-node='details']");

    /**
     * Выбрать карту из кошелька
     */
    @Step("Выбрать карту из кошелька")
    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        driver.findElement(buttonWallet).click();
        return this;
    }

    /**
     * Ввести номер телефона без кода страны
     *
     * @param number номер телефона
     */
    @Step("Ввести номер телефона \"{number}\"")
    public MobilePhoneReplenishmentPage enterPhoneNumber(String number) {
        parameter("Номер телефона", number);
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }

    /**
     * Ввести сумму для перевода
     *
     * @param amount сумма перевода
     */
    @Step("Ввести сумму для перевода \"{amount}\"")
    public MobilePhoneReplenishmentPage enterAmount(String amount) {
        parameter("Сумма перевода", amount);
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }

    /**
     * Ввести номер карты
     *
     * @param card номер карты
     */
    @Step("Ввести номер карты \"{card}\"")
    public MobilePhoneReplenishmentPage enterCardFrom(String card) {
        parameter("Номер карты", card);
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }

    /**
     * Ввести срок действия карты
     *
     * @param expDate срок действия карты
     */
    @Step("Ввести срок действия карты \"{expDate}\"")
    public MobilePhoneReplenishmentPage enterCardExpDate(String expDate) {
        parameter("Cрок действия карты", expDate);
        driver.findElement(inputCardExpDate).sendKeys(expDate);
        return this;
    }

    /**
     * Ввести cvv-код карты
     *
     * @param cvv cvv-код карты
     */
    @Step("Ввести cvv-код карты \"{cvv}\"")
    public MobilePhoneReplenishmentPage enterCardCvv(String cvv) {
        parameter("Cvv-код карты", cvv);
        driver.findElement(inputCardCvv).sendKeys(cvv);
        return this;
    }

    /**
     * Нажать кнопку подтверждения "To the cart"
     */
    @Step("Нажать кнопку подтверждения \"To the cart\"")
    public MobilePhoneReplenishmentPage submitToTheCart() {
        driver.findElement(buttonSubmitToTheCart).click();
        return this;
    }

    /**
     * Проверить отображение блока детальной информации платежа
     *
     * @param text текст детальной информации
     */
    @Step("Проверить отображение блока детальной информации платежа")
    public MobilePhoneReplenishmentPage checkPaymentDetailsIsPresentInTheCart(String text) {
        parameter("Текст детальной информации", text);
        waitElementIsVisible(driver.findElement(paymentDetails));
        WebElement details = driver.findElement(paymentDetails);
        Assertions.assertEquals(text, details.getText());
        return this;
    }
}
