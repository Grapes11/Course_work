import firstpage.FirstPage;
import fivepage.FivePage;
import fourpage.FourPage;
import threepage.SelectFlight;
import threepage.ThreePage;
import twopage.TwoPage;
import twopage.Type;
import twopage.ServiceClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class ControlTest {
    private static EventFiringWebDriver eventDriver;
    @BeforeClass
    public static void beforeClassMethod() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        eventDriver = new EventFiringWebDriver(driver);
        EventHandlers handler = new EventHandlers();
        eventDriver.register(handler);
    }

    @Before
    public void beforeMethod() {
        eventDriver.get("http://newtours.demoaut.com/");
        eventDriver.manage().window().maximize();
        eventDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test1() {
        FirstPage firstPage = new FirstPage(eventDriver);
        firstPage.login("test1","test1");

        TwoPage twoPage = new TwoPage(eventDriver);
        twoPage.typeAndAmount(eventDriver, Type.ONE_WAY,2);
        twoPage.departingFrom("Sydney", "January", 9);
        twoPage.arrivingIn("London", "January",15);
        twoPage.preferencesChoice(eventDriver, ServiceClass.BUSINESS_CLASS, "Blue Skies Airlines");
        twoPage.findFlight();

        ThreePage threePage = new ThreePage(eventDriver);
        threePage.depart(eventDriver, SelectFlight.BLUE_SKIES_AIRLINE$361);
        threePage.comeback(eventDriver,SelectFlight.BLUE_SKIES_AIRLINE$631);
        threePage.reserveFlight();

        FourPage fourPage = new FourPage(eventDriver);
        fourPage.fullNamePassengersAndMeal0("Nikita", "Vinogradov", "Bland");
        fourPage.fullNamePassengersAndMeal1("Artem", "Arhipov", "Muslim");
        fourPage.fillingCardData("Visa", 12391, 11, 2010, "Nikita", "Sergeevich", "Vinohradov");
        fourPage.billingAddress("1325 Borregas Ave.","Sunnyvale", "SF", 94089, "UGANDA");
        fourPage.deliveryAddress("1325 Borregas Ave.","Sunnyvale", "SF", 94089, "UGANDA");
        fourPage.buyFlight();

        FivePage fivePage = new FivePage(eventDriver);
        fivePage.logOut();
    }

    @After
    public void afterMethod() {
        eventDriver.quit();
    }

}
