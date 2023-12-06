import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGDemo {

    public void test1() {
        System.out.println("Test 1");
    }

    @Test( dependsOnMethods = {"test3"})
    public void test2() {
        System.out.println("Test 2");
    }
    @Test
    public void test3() {
        //Assert.fail("faileddd");
        System.out.println("Test 3");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method to run Before each TC");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("After Method to run After each TC");
    }

    @BeforeClass
    public void BeforeClass (){
        System.out.println("Before Class Run");
    }

    @AfterClass
    public void AfterClass (){
        System.out.println("After Class Run");
    }
}
