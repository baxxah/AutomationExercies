import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TaskDay3 {
    WebDriver driver;
    //public By SignUpPartialLink = By.linkText("Signup / Login");

    @BeforeMethod
    public void OpenBrowser(){
        driver = new EdgeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void NewUserSignUp ()
    {
        clickOn("//a[@href=\"/login\"]");
        FillField("//input[@data-qa=\"signup-name\"]", "basant lazem");
        FillField("//input[@data-qa=\"signup-email\"]","basantlazemm@gmail.com");
        clickOn("//button[@data-qa=\"signup-button\"]");
        checkVisibility("//h2[@class=\"title text-center\"]", "'ENTER ACCOUNT INFORMATION'");

        ///Filling Account Info
        clickOn("//label[@for=\"id_gender2\"]");

        FillField("//input[@type='password']","p@ssword123");

        selectFromDropDownMenu("//select[@data-qa='days']" , 25);
        selectFromDropDownMenu("//select[@data-qa='months']" , 12);
        selectFromDropDownMenu("//select[@data-qa='years']" , 20);

        clickOn("//input[@name=\"newsletter\"]");
        clickOn("//input[@name=\"optin\"]");

        FillField("//input[@data-qa=\"first_name\"]","Basant");
        FillField("//input[@data-qa=\"last_name\"]" , " Ahmed");
        FillField("//input[@data-qa=\"company\"]" , "Giza Systems");
        FillField("//input[@data-qa=\"address\"]" , "Cairo");
        FillField("//input[@data-qa=\"address2\"]","Cairo2");

        selectFromDropDownMenu("//select[@data-qa=\"country\"]",2);

        FillField("//input[@data-qa=\"state\"]","Cairo");
        FillField("//input[@data-qa=\"city\"]","Cairo");
        FillField("//input[@data-qa=\"zipcode\"]","12511");
        FillField("//input[@data-qa=\"mobile_number\"]","010000555");

        clickOn("//button[@type=\"submit\"]");
        checkVisibility("//b","Create Account Button");



    }


    //---------- Actions or Business Steps -------
    public  void checkVisibility (String path , String item){
        Boolean visible = driver.findElement(By.xpath(path)).isDisplayed();
        String output = String.format(" Is visible for " + item + " = %b ", visible);
        System.out.println(output);
    }

    public void clickOn(String path) {
        driver.findElement(By.xpath(path)).click();
    }

    public void FillField(String path, String input){
        driver.findElement(By.xpath(path)).sendKeys(input);
    }

    public void selectFromDropDownMenu(String path , int Index){
        Select drpDay = new Select(driver.findElement(By.xpath(path)));
        drpDay.selectByIndex(Index);
    }


}
