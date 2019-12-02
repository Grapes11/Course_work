package firstpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

 public class FirstPage {
     /**
      * поле имени.
      */
    @FindBy(xpath = "//input[@name='userName']")
    private
    WebElement loginField;
     /**
      * поле пароля.
      */
    @FindBy(xpath = "//input[@name='password']")
    private
    WebElement passwordField;
     /**
      * кнопка входа сайт.
      */
    @FindBy(xpath = "//input[@name='login']")
    private
    WebElement signIn;

     /**
      * @param driver драйвер браузера
      *              Происходит инициализация
      *              элементов первой страницы.
      */
    public FirstPage(final WebDriver driver) {
        final Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(driver
                .findElement(By.xpath("//input[@name='userName']"))));
        PageFactory.initElements(driver, this);
    }

     /**
      * @param login логин
      * @param password пароль
      *                 Реализуется ввод имени
      *                 и пароля и вход на сайт.
      */
    public void login(final String login, final String password) {
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        signIn.click();
    }
}
