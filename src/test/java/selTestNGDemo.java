import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.Select;



public class selTestNGDemo {
    @Test
    public static void Demoo() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        // navigate to URL
        driver.get("https://automationexercise.com/");
        //Click on Sign up
        driver.findElement(By.linkText("Signup / Login")).click();
        // verify signup button is visible
        Boolean visible = driver.findElement(By.className("signup-form")).isDisplayed();
        String output = String.format("is visible for sign up  = %b ", visible);
        System.out.println(output);
        // enter name and email
        driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]")).sendKeys("basant lazem");
        driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("basantlazem@gmail.com");
        //click on sign up button
        driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
        //Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Boolean visiblee = driver.findElement(By.xpath("//h2[@class=\"title text-center\"]")).isDisplayed();
        String outputt = String.format("is visible for 'ENTER ACCOUNT INFORMATION'  = %b ", visiblee);
        System.out.println(outputt);
        //9.Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("//label[@for=\"id_gender2\"]")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("p@ssword123");
        Select drpDay = new Select(driver.findElement(By.xpath("//select[@data-qa='days']")));
        drpDay.selectByIndex(26);
        Select drpMnth = new Select(driver.findElement(By.xpath("//select[@data-qa='months']")));
        drpMnth.selectByIndex(12);
        Select drpYears = new Select(driver.findElement(By.xpath("//select[@data-qa='years']")));
        drpYears.selectByIndex(10);


        //10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//input[@name=\"newsletter\"]")).click();
        //11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("//input[@name=\"optin\"]")).click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        driver.findElement(By.xpath("//input[@data-qa=\"first_name\"]")).sendKeys("basant");

        driver.findElement(By.xpath("//input[@data-qa=\"last_name\"]")).sendKeys("ahmed");

        driver.findElement(By.xpath("//input[@data-qa=\"company\"]")).sendKeys("giza systems");

        driver.findElement(By.xpath("//input[@data-qa=\"address\"]")).sendKeys("address");

        driver.findElement(By.xpath("//input[@data-qa=\"address2\"]")).sendKeys("address2");

        Select drpCntry = new Select(driver.findElement(By.xpath("//select[@data-qa=\"country\"]")));
        drpCntry.selectByIndex(2);
        driver.findElement(By.xpath("//input[@data-qa=\"state\"]")).sendKeys("Giza");

        driver.findElement(By.xpath("//input[@data-qa=\"city\"]")).sendKeys("Giza");

        driver.findElement(By.xpath("//input[@data-qa=\"zipcode\"]")).sendKeys("12511");

        driver.findElement(By.xpath("//input[@data-qa=\"mobile_number\"]")).sendKeys("01004937727");


        //13. Click 'Create Account button'
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        //14. Verify that 'ACCOUNT CREATED!' is visible
        Boolean visibleb = driver.findElement(By.xpath("//b")).isDisplayed();
        String outputb = String.format("is visible for sign up  = %b ", visibleb);
        System.out.println(outputb);
        //driver.navigate().to("https://www.google.com/");
//Elemetns :
        // id
        // name
        // class name
        // CSS selector
        // xpath
        // link Text ( no recom )
        // Partial Link Text ( no recom )
        // Tag Name
        // xpath : /html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea
        //driver.findElement(By.id("APjFqb")).sendKeys("Giza Systems");


    }


//    @Test
//    public void test1() {
//        System.out.println("Test 1");
//    }
//
//    @Test( dependsOnMethods = {"test3"})
//    public void test2() {
//        System.out.println("Test 2");
//    }
//    @Test
//    public void test3() {
//        //Assert.fail("faileddd");
//        System.out.println("Test 3");
//    }
//
//    @BeforeMethod
//    public void beforeMethod(){
//        System.out.println("Before Method to run Before each TC");
//    }
//
//    @AfterMethod
//    public void AfterMethod(){
//        System.out.println("After Method to run After each TC");
//    }
//
//    @BeforeClass
//    public void BeforeClass (){
//        System.out.println("Before Class Run");
//    }
//
//    @AfterClass
//    public void AfterClass (){
//        System.out.println("After Class Run");
//    }
}


