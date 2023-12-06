import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class day3_session {
    @Test
    public static void Day3() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");

        driver.manage().window().maximize();

        driver.findElement(By.partialLinkText("Example 1")).click();
        driver.findElement(By.cssSelector("div#start >button")).click();
        Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#finish > h4")));


        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(20)));
        String hellomsg = driver.findElement(By.cssSelector("div#finish > h4")).getText();
        Assert.assertEquals(hellomsg,"Hello World!");

        driver.quit();
    }

    @Test
    public static void Test2 (){

    }

}

// CSS selector : div#start >button
// implicit :
// in Example 1 .. element was hidden
// in Example 2 .. element didn't exist then element appears