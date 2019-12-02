package fivepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FivePage {
    /**
     * кнопка возвращение на страницу
     * покупки билетов.
     */
    @FindBy(xpath = "//td[@align='right']/a[@href='mercuryreservation.php']")
    private
    WebElement backToFlights;
    /**
     * кнопка возвращения
     * на домашнюю страницу.
     */
    @FindBy(xpath = "//td[@align='right']/a[@href='mercurywelcome.php']")
    private
    WebElement backToHome;
    /**
     * кнопка выхода с сайта.
     */
    @FindBy(xpath = "//td[@align='right']/a[@href='mercurysignoff.php']")
    private
    WebElement logOut;

    /**
     * @param driver драйвер браузера
     *              Происходит инициализация
     *              элементов пятоц страницы.
     */
    public FivePage(final WebDriver driver) {
        final Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By
                        .xpath("//td[@align='right']/"
                                + "a[@href='mercuryreservation.php']"))));
        PageFactory.initElements(driver, this);
    }

    /**
     * возвращение на страницу
     * покупки билетов.
     */
    public void backToFlights() {
        backToFlights.click();
    }

    /**
     * возвращение на домашнюю страницу.
     */
    public void backToHome() {
        backToHome.click();
    }

    /**
     * выход с сайта.
     */
    public void logOut() {
        logOut.click();
    }
}
