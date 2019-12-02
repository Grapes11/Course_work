package threepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public enum SelectFlight {
    /**
     * рейс BLUE_SKIES_AIRLINE
     * стоимостью 360$.
     */
    BLUE_SKIES_AIRLINE$360(
            "//input[contains(@value, 'Blue Skies Airlines$360')]"),
    /**
     * рейс BLUE_SKIES_AIRLINE
     * стоимостью 361$.
     */
    BLUE_SKIES_AIRLINE$361(
            "//input[contains(@value, 'Blue Skies Airlines$361')]"),
    /**
     * рейс PANGEA_AIRLINES
     * стоимостью 362$.
     */
    PANGEA_AIRLINES$362("//input[contains(@value, 'Pangea Airlines$362')]"),
    /**
     * рейс UNIFIED_AIRLINES
     * стоимостью 363$.
     */
    UNIFIED_AIRLINES$363("//input[contains(@value, 'Unified Airlines$363')]"),
    /**
     * рейс BLUE_SKIES_AIRLINE
     * стоимостью 630$.
     */
    BLUE_SKIES_AIRLINE$630(
            "//input[contains(@value, 'Blue Skies Airlines$630')]"),
    /**
     * рейс BLUE_SKIES_AIRLINE
     * стоимостью 631$.
     */
    BLUE_SKIES_AIRLINE$631(
            "//input[contains(@value, 'Blue Skies Airlines$631')]"),
    /**
     * рейс PANGEA_AIRLINES
     * стоимостью 632$.
     */
    PANGEA_AIRLINES$632("//input[contains(@value, 'Pangea Airlines$632')]"),
    /**
     * рейс UNIFIED_AIRLINES
     * стоимостью 633$.
     */
    UNIFIED_AIRLINES$633("//input[contains(@value, 'Unified Airlines$633')]");
    /**
     * xpath элемента.
     */
    private String xpath;

    SelectFlight(final String xpath1) {
        this.xpath = xpath1;
    }

    /**
     * @param driver драйвер браузера
     * @return возвращает
     * инициализированный элемент.
     */
    public WebElement init(final WebDriver driver) {
        return driver.findElement(By.xpath(xpath));
    }
}
