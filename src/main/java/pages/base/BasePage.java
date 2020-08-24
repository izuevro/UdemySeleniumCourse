package pages.base;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.TimeoutVariables.getExplicitWait;
import static io.qameta.allure.Allure.link;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By authWidget = By.xpath("//*[@src='https://login-widget.privat24.ua/']");

    /**
     * Метод для навигации по страницам
     */
    @Step("Перейти по адресу \"{url}\"")
    public void goToUrl(String url) {
        driver.get(url);
    }

    /**
     * Ожидание элемента в DOM
     */
    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, getExplicitWait()).until(visibilityOf(element));
        return element;
    }

    /**
     * Проверка фрейма авторизации на видимость
     */
    @Step("Проверить отображение фрайма авторизации")
    public void isAuthWidgetPresent() {
        WebElement authFrame = driver.findElement(authWidget);
        waitElementIsVisible(authFrame);
    }
}
