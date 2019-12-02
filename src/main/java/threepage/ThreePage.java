package threepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThreePage {
    /**
     * элемент страницы.
     */
    private WebElement webElement;
    /**
     * резервирование рейса.
     */
    @FindBy(xpath = "//input[@name='reserveFlights']")
    private
    WebElement reserveFlights;

    /**
     * @param driver драйвер браузера
     *            Происходит инициализация
     *             элементов третьей страницы.
     */
    public ThreePage(final WebDriver driver) {
        final Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(driver
                .findElement(By.xpath("//input[@name='reserveFlights']"))));
        PageFactory.initElements(driver, this);
    }

    /**
     * @param driver драйвер
     * @param selectFlight выбранный рейс
     */
    public void depart(final WebDriver driver,
                       final SelectFlight selectFlight) {
        switch (selectFlight) {
            case BLUE_SKIES_AIRLINE$361:
                webElement = SelectFlight.BLUE_SKIES_AIRLINE$361.init(driver);
                webElement.click();
                break;
            case PANGEA_AIRLINES$362:
                webElement = SelectFlight.PANGEA_AIRLINES$362.init(driver);
                webElement.click();
                break;
            case UNIFIED_AIRLINES$363:
                webElement = SelectFlight.UNIFIED_AIRLINES$363.init(driver);
                webElement.click();
                break;
            default:
                webElement = SelectFlight.BLUE_SKIES_AIRLINE$360.init(driver);
                webElement.click();
        }
    }

    /**
     * @param driver драйвер
     * @param selectFlight выбранный рейс
     */
    public void comeback(final WebDriver driver,
                         final SelectFlight selectFlight) {
        switch (selectFlight) {
            case BLUE_SKIES_AIRLINE$631:
                webElement = SelectFlight.BLUE_SKIES_AIRLINE$631.init(driver);
                webElement.click();
                break;
            case PANGEA_AIRLINES$632:
                webElement = SelectFlight.PANGEA_AIRLINES$632.init(driver);
                webElement.click();
                break;
            case UNIFIED_AIRLINES$633:
                webElement = SelectFlight.UNIFIED_AIRLINES$633.init(driver);
                webElement.click();
                break;
            default:
                webElement = SelectFlight.BLUE_SKIES_AIRLINE$630.init(driver);
                webElement.click();
        }
    }

    /**
     * резервирование рейса.
     */
    public void reserveFlight() {
        reserveFlights.click();
    }

}


