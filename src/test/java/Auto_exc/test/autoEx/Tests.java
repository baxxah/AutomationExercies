package Auto_exc.test.autoEx;

import Auto_exc.pages.AccountInfoApplication;
import Auto_exc.pages.DriverFactory;
import Auto_exc.pages.signUp_Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Auto_exc.pages.JsonFileManager;
import Auto_exc.pages.PropertiesReader;


import java.time.Duration;

public class Tests {
    public WebDriver driver ;
    public signUp_Login signupLoginPage ;

    public AccountInfoApplication accountInfoApplication ;
    @BeforeClass
    public void beforeClass() {
        JsonFileManager testData;
        PropertiesReader.loadProperties();
        testData = new JsonFileManager("src/test/resources/Test Data/TestData.json");
    }

    @Test

    public void signNewUser(){
        String email = "Basant"+ System.currentTimeMillis() +"@gmail.com";
        signupLoginPage.navigateToautoEx();
        signupLoginPage.Register("Basantx" , email, true);
        accountInfoApplication.AccountInfoFilling();

    }


    @BeforeMethod
    public void beforeMethod() {
        driver = DriverFactory.initDriver();
        signupLoginPage = new signUp_Login(driver);
        accountInfoApplication = new AccountInfoApplication(driver);
        signupLoginPage.navigateToautoEx();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }


}
