package fourpage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FourPage {
    /**
     * драйвер браузера.
     */
    private WebDriver driver;
    /**
     * имя первого пассажира.
     */
    @FindBy(xpath = "//input[@name='passFirst0']")
    private
    WebElement passFirst0;
    /**
     * фамилия первого пассажира.
     */
    @FindBy(xpath = "//input[@name='passLast0']")
    private
    WebElement passLast0;
    /**
     * тип питания первого пассажира.
     */
    @FindBy(xpath = "//select[@name='pass.0.meal']")
    private
    WebElement meal0;

    /**
     * имя второго пассажира.
     */
    @FindBy(xpath = "//input[@name='passFirst1']")
    private
    WebElement passFirst1;
    /**
     * фамилия второго пассажира.
     */
    @FindBy(xpath = "//input[@name='passLast1']")
    private
    WebElement passLast1;
    /**
     * тип питания второго пассажира.
     */
    @FindBy(xpath = "//select[@name='pass.1.meal']")
    private
    WebElement meal1;

    /**
     * тип кредитной карты.
     */
    @FindBy(xpath = "//select[@name='creditCard']")
    private
    WebElement creditCard;
    /**
     * номер кредитной карты.
     */
    @FindBy(xpath = "//input[@name='creditnumber']")
    private
    WebElement creditNumber;
    /**
     * день окончания карты.
     */
    @FindBy(xpath = "//select[@name='cc_exp_dt_mn']")
    private
    WebElement expirationDay;
    /**
     * год окончания карты.
     */
    @FindBy(xpath = "//select[@name='cc_exp_dt_yr']")
    private
    WebElement expirationYear;
    /**
     * имя владельца карты.
     */
    @FindBy(xpath = "//input[@name='cc_frst_name']")
    private
    WebElement cardFirstName;
    /**
     * отчество владельца карты.
     */
    @FindBy(xpath = "//input[@name='cc_mid_name']")
    private
    WebElement cardMiddleName;
    /**
     * фамилия владельца карты.
     */
    @FindBy(xpath = "//input[@name='cc_last_name']")
    private
    WebElement cardLastName;

    /**
     * адрес представления счета.
     */
    @FindBy(xpath = "//input[@name='billAddress1']")
    private
    WebElement billAddress1;
    /**
     * адрес представления счета.
     */
    @FindBy(xpath = "//input[@name='billAddress2']")
    private
    WebElement billAddress2;
    /**
     * город представления счета.
     */
    @FindBy(xpath = "//input[@name='billCity']")
    private
    WebElement billCity;
    /**
     * штат представления счета.
     */
    @FindBy(xpath = "//input[@name='billState']")
    private
    WebElement billState;
    /**
     * почтовый индекс представления счета.
     */
    @FindBy(xpath = "//input[@name='billZip']")
    private
    WebElement billZip;
    /**
     * астрана представления счета.
     */
    @FindBy(xpath = "//select[@name='billCountry']")
    private
    WebElement billCountry;

    /**
     * адрес доставки.
     */
    @FindBy(xpath = "//input[@name='delAddress1']")
    private
    WebElement delAddress1;
    /**
     * адрес доставки.
     */
    @FindBy(xpath = "//input[@name='delAddress2']")
    private
    WebElement delAddress2;
    /**
     * город доставки.
     */
    @FindBy(xpath = "//input[@name='delCity']")
    private
    WebElement delCity;
    /**
     * штат доставки.
     */
    @FindBy(xpath = "//input[@name='delState']")
    private
    WebElement delState;
    /**
     * почтовый индекс доставки.
     */
    @FindBy(xpath = "//input[@name='delZip']")
    private
    WebElement delZip;
    /**
     * страна доставки.
     */
    @FindBy(xpath = "//select[@name='delCountry']")
    private
    WebElement delCountry;
    /**
     * покупка билетов.
     */
    @FindBy(xpath = "//input[@name='buyFlights']")
    private
    WebElement buyFlights;

    /**
     * @param driver1 драйвер браузера
     *              Происходит инициализация
     *              элементов четвертой страницы.
     */
    public FourPage(final WebDriver driver1) {
        final Wait<WebDriver> wait = new WebDriverWait(driver1, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(driver1
                .findElement(By.xpath("//input[@name='buyFlights']"))));
        PageFactory.initElements(driver1, this);
        this.driver = driver1;
    }

    /**
     * @param firstName имя
     * @param lastName фамилия
     * @param meal тип питания
     *             Информация о первом пассажире.
     */
    public void fullNamePassengersAndMeal0(
            final String firstName, final String lastName, final String meal) {
        passFirst0.sendKeys(firstName);
        passLast0.sendKeys(lastName);
        Select meals = new Select(meal0);
        meals.selectByVisibleText(meal);
    }
    /**
     * @param firstName имя
     * @param lastName фамилия
     * @param meal тип питания
     *             Информация о втором пассажире.
     */
    public void fullNamePassengersAndMeal1(
            final String firstName, final String lastName, final String meal) {
        passFirst1.sendKeys(firstName);
        passLast1.sendKeys(lastName);
        Select meals = new Select(meal1);
        meals.selectByVisibleText(meal);
    }


    /**
     * @param cardType тип карты
     * @param number номер карты
     * @param day день окончания карты
     * @param year год окончания карты
     * @param firstName имя
     * @param middleName отчество
     * @param lastName фамилия
     */
    public void fillingCardData(final String cardType, final long number,
                                final int day, final int year,
                                final String firstName, final String middleName,
                                final String lastName) {
        Select creditCard1 = new Select(creditCard);
        creditCard1.selectByVisibleText(cardType);
        creditNumber.sendKeys(String.valueOf(number));
        Select expirationDay1 = new Select(expirationDay);
        expirationDay1.selectByVisibleText(String.valueOf(day));
        Select expirationYear1 = new Select(expirationYear);
        expirationYear1.selectByVisibleText(String.valueOf(year));
        cardFirstName.sendKeys(firstName);
        cardMiddleName.sendKeys(middleName);
        cardLastName.sendKeys(lastName);
    }

    /**
     * @param address адресс
     * @param city город
     * @param state штат
     * @param postalCode почтовый индекс
     * @param country страна
     *                Адрес для выставления счета.
     */
    public void billingAddress(final String address, final String city,
                               final String state, final int postalCode,
                               final String country) {
        billAddress1.clear();
        billAddress1.sendKeys(address);
        billCity.clear();
        billCity.sendKeys(city);
        billState.clear();
        billState.sendKeys(state);
        billZip.clear();
        billZip.sendKeys(String.valueOf(postalCode));
        Select billCountry1 = new Select(billCountry);
        billCountry1.selectByVisibleText(country);
    }
    /**
     * @param address адресс
     * @param city город
     * @param state штат
     * @param postalCode почтовый индекс
     * @param country страна
     *                Адрес доставки.
     */
    public void deliveryAddress(final String address, final String city,
                                final String state, final int postalCode,
                                final String country) {
        delAddress1.clear();
        delAddress1.sendKeys(address);
        delCity.clear();
        delCity.sendKeys(city);
        delState.clear();
        delState.sendKeys(state);
        delZip.clear();
        delZip.sendKeys(String.valueOf(postalCode));
        Select delCountry1 = new Select(delCountry);
        delCountry1.selectByVisibleText(country);
    }

    /**
     * Покупка билетов.
     */
    public void buyFlight() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {
            e.getMessage();
        } finally {
            buyFlights.click();
        }
    }

}
