package twopage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public enum Type {
    /**
     * поездка туда и обратно.
     */
    ROUND_TRIP("//input[@value='roundtrip']"),
    /**
     * поездка в одну сторону.
     */
    ONE_WAY("//input[@value='oneway']");

    /**
     * xpath элемента.
     */
    private String xpath;

    Type(final String xpath1) {
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
