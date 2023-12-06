import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Assignment_3_BasantLazem {
    WebDriver driver;

    @Test
    public void HeadlessExecution(){
        driver = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        WebDriver driverChrome = new ChromeDriver(options);


        driverChrome.get("https://www.browserstack.com/");
        System.out.println("Title is: " +driverChrome.getTitle());
        Assert.assertEquals(driverChrome.getTitle(), "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        //driverChrome.quit();

    }
    //Headless browser testing is a shift-left design thinking. This means it moves to test to the left in the SDLC workflow by implementing Headless testing.

    @Test
    public void ActionClass () {
        driver.get("https://jqueryui.com/droppable/");
        WebElement elementdrag = driver.findElement(By.id("draggable"));
        WebElement elementdrop = driver.findElement(By.id("droppable"));
        Actions builder = new Actions(driver);

        Actions dragandDrop = (Actions) builder.clickAndHold(elementdrag).moveToElement(elementdrop).release(elementdrop).build();
        dragandDrop.perform();
    }

    @Test
    public void FileUpload (){
        driver.get("https://the-internet.herokuapp.com/upload");
        File filetoupload = new File("D:\\Hands_On\\first_auto_proj_mavn_sel\\src\\screeeenshot\\test.png");
        WebElement fileInput = driver.findElement(By.id("file-upload"));
        fileInput.sendKeys(filetoupload.getAbsolutePath());
        driver.findElement(By.id("file-submit")).click();

    }


    @Test
    public void TakingScreenshots (){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        System.out.println("Screenshot taken : " + screenshot.getAbsolutePath());
         try {
             Files.move(screenshot, new File("D:\\Hands_On\\first_auto_proj_mavn_sel\\src\\screeeenshot\\test.png"));
         }catch (IOException e){
             e.printStackTrace();
         }


    }
}




