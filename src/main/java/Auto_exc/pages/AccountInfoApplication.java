package Auto_exc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountInfoApplication {
    WebDriver driver;
    String pageURL= "https://automationexercise.com/signup";
    public By VisibilityPath = By.xpath("//h2[@class=\"title text-center\"]");
    public By genderButton =By.id("id_gender2");
    public By PasswordPath = By.xpath("//input[@type='password']");
    public By Days = By.xpath("//select[@data-qa='days']");
    public By Month = By.xpath("//select[@data-qa='months']");
    public By Year = By.xpath("//select[@data-qa='years']");

    public By newSettler = By.id("newsletter");
    public By optinButton = By.id("optin");
    public By firstName = By.id("first_name");
    public By LastName = By.id("last_name");

    public By Company = By.xpath("//input[@data-qa=\"company\"]");
    public By address = By.xpath("//input[@data-qa=\"address\"]");
    public By Country = By.xpath("//input[@data-qa=\"country\"]");

    public By state = By.xpath("//input[@data-qa=\"state\"]");
    public By city = By.xpath("//input[@data-qa=\"city\"]");
    public By zipcode =By.xpath("//input[@data-qa=\"zipcode\"]");
    public By mobilenumber =By.xpath("//input[@data-qa=\"mobile_number\"]");

    public By submitButton = By.xpath("//button[@type=\"submit\"]");
    public By visible = By.xpath("//b");

    public AccountInfoApplication(WebDriver driver) {
        this.driver= driver;
    }

    public  void checkVisibility (By by, String item){
        Boolean visible = driver.findElement(by).isDisplayed();
        String output = String.format(" Is visible for " + item + " = %b ", visible);
        System.out.println(output);
    }

    public void clickOn(By by) {
        driver.findElement(by).click();
    }

    public void selectFromDropDownMenu(By by , int Index){
        Select drpDay = new Select(driver.findElement(by));
        drpDay.selectByIndex(Index);
    }
    public void AccountInfoFilling (){
        checkVisibility(VisibilityPath,"'ENTER ACCOUNT INFORMATION'");
        clickOn(genderButton);
        driver.findElement(PasswordPath).sendKeys("Password123");
        selectFromDropDownMenu(Days,25);
        selectFromDropDownMenu(Month,12);
        selectFromDropDownMenu(Year,12);
        driver.findElement(firstName).sendKeys("basant");
        driver.findElement(LastName).sendKeys("lazem");
        driver.findElement(Company).sendKeys("Giza Systems");
        driver.findElement(address).sendKeys("Cairo");
        driver.findElement(state).sendKeys("cairo");
        driver.findElement(city).sendKeys("Cairo");
        driver.findElement(zipcode).sendKeys("12511");
        driver.findElement(mobilenumber).sendKeys("01004937727");
        clickOn(newSettler);
        clickOn(optinButton);
        clickOn(submitButton);
        checkVisibility(visible,"Create Account Button");
    }

}

