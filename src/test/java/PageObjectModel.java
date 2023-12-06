//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class PageObjectModel {
//   public  WebDriver driver;
//   private final By googleSearchBar_textarea = By.xpath("xpath");
//   private final By firstSearchResult_h = By.xpath("//h3[@class='LC20lb MBeu0 DKV0Md'])[1]");
//        @Test
//        public static void DemooPOM() {
//            WebDriver  driver = new EdgeDriver();
//            driver.manage().window().maximize();
//            // navigate to URL
//            driver.get("https://automationexercise.com/");
//            //Click on Sign up
//            driver.findElement(By.linkText("Signup / Login")).click();
//            // verify signup button is visible
//            Boolean visible = driver.findElement(By.className("signup-form")).isDisplayed();
//            String output = String.format("is visible for sign up  = %b ", visible);
//            System.out.println(output);
//            // enter name and email
//            driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]")).sendKeys("basant lazem");
//            driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("basantlazem@gmail.com");
//            //click on sign up button
//            driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
//            //Verify that 'ENTER ACCOUNT INFORMATION' is visible
//            Boolean visiblee = driver.findElement(By.xpath("//h2[@class=\"title text-center\"]")).isDisplayed();
//            String outputt = String.format("is visible for 'ENTER ACCOUNT INFORMATION'  = %b ", visiblee);
//            System.out.println(outputt);
//            //9.Fill details: Title, Name, Email, Password, Date of birth
//            driver.findElement(By.xpath("div[@class=\"radio-inline\"]")).click();
//}
//         @Test
//         public void TestSearch(){
//            googleSearch("xpath");
//        driver.findElement(By.xpath(googleSearchBar_textarea)).sendKeys("Giza", Keys.ENTER);
//             Assert.assertTrue(getFirstSearchResultText(),"Giza");
//        }
//
//         @Test
//         public void TestSearch2(){
//
//         }
//         // --------- Business Steps or Actions ------
//         public void googleSearch(String SearchData){
//            driver.findElement(googleSearchBar_textarea).sendKeys(SearchData,Keys.ENTER);
//    }
//    public String getFirstSearchResultText(){
//            String firstSearchResultText = driver.findElement(firstSearchResult_h).getText();
//            return firstSearchResultText;
//    }
//    public void assertOnFirstSearchResult (String expRes){
////        String firstSearchResultText = driver.findElement(firstSearchResult_h).getText();
//        }
//}
