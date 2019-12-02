package twopage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TwoPage {
    /**
     * элемент страницы.
     */
    private WebElement webElement;
    /**
     * число пассажиров.
     */
    @FindBy(xpath = "//select[@name='passCount']")
    private
    WebElement passCount;
    /**
     * откуда вылет.
     */
    @FindBy(xpath = "//select[@name='fromPort']")
    private
    WebElement fromPort;
    /**
     * месяц вылета.
     */
    @FindBy(xpath = "//select[@name='fromMonth']")
    private
    WebElement fromMonth;
    /**
     * день вылета.
     */
    @FindBy(xpath = "//select[@name='fromDay']")
    private
    WebElement fromDay;
    /**
     * куда прибытие.
     */
    @FindBy(xpath = "//select[@name='toPort']")
    private
    WebElement toPort;
    /**
     * месяц прибытия.
     */
    @FindBy(xpath = "//select[@name='toMonth']")
    private
    WebElement toMonth;
    /**день прибытия.
     */
    @FindBy(xpath = "//select[@name='toDay']")
    private
    WebElement toDay;
    /**
     * авиалинии.
     */
    @FindBy(xpath = "//select[@name='airline']")
    private
    WebElement airline;
    /**
     * поиск рейса.
     */
    @FindBy(xpath = "//input[@name='findFlights']")
    private
    WebElement findFlights;

    /**
     * @param driver драйвер браузера
     *            Происходит инициализация
     *             элементов второй страницы.
     */
    public TwoPage(final WebDriver driver) {
        final Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(driver
                .findElement(By.xpath("//input[@value='roundtrip']"))));
        PageFactory.initElements(driver, this);
    }


    /**
     * @param driver драйвер
     * @param type тип поездки
     * @param amount число пассажиров
     */
    public void typeAndAmount(final WebDriver driver,
                              final Type type, final int amount) {
        if (type.equals(Type.ONE_WAY)) {
            webElement = Type.ONE_WAY.init(driver);
            webElement.click();
        } else {
            webElement = Type.ROUND_TRIP.init(driver);
            webElement.click();
        }
        Select passCount1 = new Select(passCount);
        passCount1.selectByValue(String.valueOf(amount));
    }

    /**
     * @param port откуда вылет
     * @param month месяц вылета
     * @param day день вылета
     */
    public void departingFrom(final String port,
                              final String month, final int day) {
        Select fromPort1 = new Select(fromPort);
        fromPort1.selectByValue(port);
        Select fromMonth1 = new Select(fromMonth);
        fromMonth1.selectByVisibleText(month);
        Select fromDay1 = new Select(fromDay);
        fromDay1.selectByValue(String.valueOf(day));
    }

    /**
     * @param port место прибытия
     * @param month месяц прибытия
     * @param day день прибытия
     */
    public void arrivingIn(final String port,
                           final String month, final int day) {
        Select toPort1 = new Select(toPort);
        toPort1.selectByValue(port);
        Select toMonth1 = new Select(toMonth);
        toMonth1.selectByVisibleText(month);
        Select toDay1 = new Select(toDay);
        toDay1.selectByValue(String.valueOf(day));
    }

    /**
     * @param driver драйвер
     * @param serviceClass класс билета
     * @param choiceAirline выбранные авиалинии
     */
    public void preferencesChoice(final WebDriver driver,
                                  final ServiceClass serviceClass,
                                  final String choiceAirline) {
        if (serviceClass.equals(ServiceClass.BUSINESS_CLASS)) {
            webElement = ServiceClass.BUSINESS_CLASS.init(driver);
            webElement.click();
        } else {
            if (serviceClass.equals(ServiceClass.FIRST_CLASS)) {
                webElement = ServiceClass.FIRST_CLASS.init(driver);
                webElement.click();
            } else {
                webElement = ServiceClass.ECONOMY_CLASS.init(driver);
                webElement.click();
            }
        }
        Select airline1 = new Select(airline);
        airline1.selectByVisibleText(choiceAirline);
    }

    /**
     * поиск рейса.
     */
    public void findFlight() {
        findFlights.click();
    }

}
