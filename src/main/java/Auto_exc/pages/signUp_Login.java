package Auto_exc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class signUp_Login {
    WebDriver driver;
    String pageURL="https://automationexercise.com/";
    public By SignUpPartialLink = By.xpath("//a[@href=\"/login\"]");
    public By SignUpName = By.xpath("//input[@data-qa=\"signup-name\"]");
    public By SignUpEmail = By.xpath("//input[@data-qa=\"signup-email\"]");
    public By SignUpButton = By.xpath("//button[@data-qa=\"signup-button\"]");

    public signUp_Login(WebDriver driver) {
        this.driver = driver ;
}

    public void Register (String X , String Y , Boolean headless)
    {
            clickOn(SignUpPartialLink);
            driver.findElement(SignUpName).sendKeys(X);
            driver.findElement(SignUpEmail).sendKeys(Y);
            clickOn(SignUpButton);

    }
    public void navigateToautoEx() {
            driver.navigate().to(pageURL);

    }
    public void clickOn(By by)
    {

        driver.findElement(by).click();
    }

}
