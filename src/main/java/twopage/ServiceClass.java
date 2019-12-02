package twopage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public enum ServiceClass {
    /**
     * экономный класс.
     */
    ECONOMY_CLASS("//input[@value='Coach']"),
    /**
     * бизнес класс.
     */
    BUSINESS_CLASS("//input[@value='Business']"),
    /**
     * первый класс.
     */
    FIRST_CLASS("//input[@value='First']");

    /**
     * xpath элемента.
     */
    private String xpath;


    ServiceClass(final String xpath1) {
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
