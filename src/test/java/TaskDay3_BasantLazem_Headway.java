import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TaskDay3_BasantLazem_Headway {
    WebDriver driver;
    public By SignUpPartialLink = By.linkText("Signup / Login");
    public By SignUpName = By.xpath("//input[@data-qa=\"signup-name\"]");
    public By SignUpEmail = By.xpath("//input[@data-qa=\"signup-email\"]");
    public By SignUpButton = By.xpath("//button[@data-qa=\"signup-button\"]");
    public By VisibilityPath = By.xpath("//h2[@class=\"title text-center\"]");
    public By genderButton = By.xpath("\"//h2[@class=\\\"title text-center\\\"]\"");
    public By PasswordPath = By.xpath("//input[@type='password']");
    public By Days = By.xpath("//select[@data-qa='days']");
    public By Month = By.xpath("//select[@data-qa='months']");
    public By Year = By.xpath("//select[@data-qa='years']");

    public By newSettler = By.xpath("\"//input[@name=\\\"newsletter\\\"]\"");
    public By optinButton = By.xpath("//input[@name=\"optin\"]");
    public By firstName = By.xpath("\"//input[@data-qa=\\\"first_name\\\"]\"");
    public By LastName = By.xpath("//input[@data-qa=\"last_name\"]");

    public By Company = By.xpath("//input[@data-qa=\"company\"]");
    public By address = By.xpath("//input[@data-qa=\"address\"]");
    public By Country = By.xpath("//input[@data-qa=\"country\"]");

    public By state = By.xpath("//input[@data-qa=\"state\"]");
    public By city = By.xpath("//input[@data-qa=\"city\"]");
    public By zipcode =By.xpath("//input[@data-qa=\"zipcode\"]");
    public By mobilenumber =By.xpath("//input[@data-qa=\"mobile_number\"]");

    public By submitButton = By.xpath("//button[@type=\"submit\"]");
    public By visible = By.xpath("//b");



    @BeforeMethod
    public void OpenBrowser(){
        driver = new EdgeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void TestAutoEx ()
    {
        NewUserSignUp("basant","basant@gmail.com");
        AccountInfoFilling();

    }


    //---------- Actions or Business Steps -------
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
    public void NewUserSignUp (String X , String Y){
        clickOn(SignUpPartialLink);
        driver.findElement(SignUpName).sendKeys(X);
        driver.findElement(SignUpEmail).sendKeys(Y);
        clickOn(SignUpButton);


    }
    public void AccountInfoFilling (){
        checkVisibility(VisibilityPath, "'ENTER ACCOUNT INFORMATION'");
        driver.findElement(PasswordPath).sendKeys("Password123");
        clickOn(genderButton);
        selectFromDropDownMenu(Days,25);
        selectFromDropDownMenu(Month,12);
        selectFromDropDownMenu(Year,12);
        driver.findElement(firstName).sendKeys("basant");
        driver.findElement(LastName).sendKeys("lazem");
        driver.findElement(Company).sendKeys("Giza Systems");
        driver.findElement(address).sendKeys("Cairo");
        driver.findElement(state).sendKeys("cairo");
        driver.findElement(city).sendKeys("zipcode");
        driver.findElement(mobilenumber).sendKeys("01004937727");

        clickOn(newSettler);
        clickOn(optinButton);
        clickOn(submitButton);

        checkVisibility(visible,"Create Account Button");



    }


}
