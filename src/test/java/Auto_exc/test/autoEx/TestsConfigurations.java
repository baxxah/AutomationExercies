package Auto_exc.test.autoEx;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Auto_exc.pages.signUp_Login;
import Auto_exc.pages.DriverFactory;

public class TestsConfigurations {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {

        driver = DriverFactory.initDriver("chrome");
        new signUp_Login(driver).navigateToautoEx();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
